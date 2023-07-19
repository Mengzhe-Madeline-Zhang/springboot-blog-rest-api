import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.springboot.blog.controller.PostController;
import com.springboot.blog.model.Post;
import com.springboot.blog.payload.PostDto;
import com.springboot.blog.repository.PostRepository;

import com.springboot.blog.service.PostService;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.*;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class PostControllerTest {

    private MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter objectWriter = objectMapper.writer();

    @Mock
    private PostRepository postRepository;
//    @Mock
//    private PostService postService;

    @InjectMocks
    private PostController postController;

    Post postRecord_1 = new Post(20L, "test1", "test1", "test1");
    Post postRecord_2 = new Post(21L, "test2", "test2", "test2");
    Post postRecord_3 = new Post(22L, "test3", "test3", "test3");

    @BeforeEach
    public void setUp(){
//        MockitoAnnotations.initMocks(this);
//        this.mockMvc= MockMvcBuilders.standaloneSetup(postController).build();
        mockMvc = MockMvcBuilders.standaloneSetup(postController).build();

    }

    @Test
    public void getAllPosts_success() throws Exception{
        List<Post> posts = new ArrayList<>(Arrays.asList(postRecord_1, postRecord_2, postRecord_3));
        Mockito.when(postRepository.findAll()).thenReturn(posts);
//        Mockito.when(postService.getAllPosts()).thenReturn(posts);
//        Mockito.doReturn(posts).when(postService.getAllPosts());
        mockMvc.perform(MockMvcRequestBuilders
        .get("/api/posts")
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].title", is("test3")));

    }

    @Test
    public void getPostById_success() throws Exception {
        Mockito.when(postRepository.findById((postRecord_1.getId()))).thenReturn(Optional.of(postRecord_1));

        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/posts/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.title", is("test1")));
    }

    @Test
    public void createPost_success() throws  Exception {
        Post post = Post.builder()
                .id(23L)
                .title("test4")
                .description("test4")
                .content("test4")
                .build();
        Mockito.when(postRepository.save(post)).thenReturn(post);
        String content = objectWriter.writeValueAsString(post);
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/posts")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(content);

        mockMvc.perform(mockRequest)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("%.name", is("test4")));
    }

    @Test
    public void updatePostRecord_success() throws  Exception{
        Post updatedPost = Post.builder()
                .id(20L)
                .title("test_updated")
                .description("updated")
                .content("updated")
                .build();

        Mockito.when(postRepository.findById(postRecord_1.getId())).thenReturn(Optional.ofNullable(postRecord_1));
        Mockito.when(postRepository.save(updatedPost)).thenReturn(updatedPost);
        String updatedContent = objectWriter.writeValueAsString(updatedPost);
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.put(("/api/posts"))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(updatedContent);
        mockMvc.perform(mockRequest)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.title", is("test_updated")));

    }

    @Test
    public void deletePostById_success() throws  Exception{
        Mockito.when(postRepository.findById(postRecord_2.getId())).thenReturn(Optional.of(postRecord_2));
        mockMvc.perform(MockMvcRequestBuilders
        .delete("/api/posts/2")
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }



}
