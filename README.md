###Spring Boot Blog REST API Proof of Concept
This is a blog rest api with posts CRUD and user login & register functions and MySQL database

#Technology: 
Spring Boot, Spring security, Rest CRUD, MySQL, Data JPA, database authentication, JWT, Junit5, Mockito 

#Feature:
- Users can register with name, username, email and password;
- Users can log in with username or email and password;
- Users have roles of ADMIN and USER;
- All users can get all posts and get a post by id;
- Only ADMIN user can create, update and delete posts.

#API:
- User register by POST request:
`http://localhost:8080/api/auth/register`
or
`http://localhost:8080/api/auth/signup`
- User sign in by POST request:
`http://localhost:8080/api/auth/login`
or
`http://localhost:8080/api/auth/signin`
- Get posts by GET request:
`http://localhost:8080/api/posts`
- Get posts by id by GET request:
`http://localhost:8080/api/posts/<id>`
- Create a post by POST request:
`http://localhost:8080/api/posts`
- Update a post by PUT request:
`http://localhost:8080/api/posts/<id>`
- Delete a post by DELETE request:
`http://localhost:8080/api/posts/<id>`

#MySQL database form:

#Test with Postman:
