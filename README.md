# Spring Boot Blog REST API Proof of Concept
This is a blog rest api with posts CRUD and user login & register functions using MySQL database

### Technology: 
Spring Boot, Spring security, Rest CRUD, MySQL, PasswordEncoder, Data JPA, database authentication, JWT, Junit5, Mockito 

### Feature:
- Users can register with name, username, email and password;
- Users cannot register with the same username or email already in the database;
- Users can log in with username or email and password;
- Users with wrong username/email/password cannot sign in;
- Users have roles of ADMIN and USER;
- All users can get all posts and get a post by id;
- Only ADMIN user can create, update and delete posts.

### API:
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

### MySQL database form:

- Table  

  ![table](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/Table.png)

- Posts Table  

  ![post table](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/posts.png)

- Roles Table  

  ![role table](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/roles.png)

- Users Table  

  ![user table](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/users.png)

- Users_roles Table  

  ![user_role table](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/user_roles.png)

[comment]: <> (### Test with Postman:)

[comment]: <> (- Get all posts)

[comment]: <> (  ![getallposts]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/getallposts.png&#41;)

[comment]: <> (- Get a post by id)

[comment]: <> (  ![getpostbyid]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/getapostbyid.png&#41;)

[comment]: <> (- New user register)

[comment]: <> (  ![newusersignup]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/register.png&#41;)

[comment]: <> (- Users cannot register with the same username or email existed in the database)

[comment]: <> (  ![notsameusersignup]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/usercan'tbethesame.png&#41;)

[comment]: <> (- User without right username/email/password cannot sign in)

[comment]: <> (  ![cannotsignin]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/dev/img/loginusernamenotfound.png&#41;)

[comment]: <> (- Role_USER login)

[comment]: <> (  ![userlogin]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/userlogin.png&#41;)

[comment]: <> (- Users with Role_USER Bearer Token cannot create/update/delete a post)

[comment]: <> (  ![usercannotdeletepost]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/dev/img/usercannotdelete.png&#41;)

[comment]: <> (- Role_ADMIN login)

[comment]: <> (  ![adminlogin]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/adminuserlogin.png&#41;)

[comment]: <> (- Users with Role_ADMIN Bearer Token can create/update/delete a post)

[comment]: <> (  ![admincreatepost]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/dev/img/admincancreate.png&#41;)

[comment]: <> (  ![adminupdatepost]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/admincanupdate.png&#41;)

[comment]: <> (  ![admindeletepost]&#40;https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/admincandelete.png&#41;)

