# Spring Boot Blog REST API Proof of Concept
This is a blog rest api with posts CRUD and user login & register functions and MySQL database

### Technology: 
Spring Boot, Spring security, Rest CRUD, MySQL, Data JPA, database authentication, JWT, Junit5, Mockito 

### Feature:
- Users can register with name, username, email and password;
- Users cannot register with the same username or email already in the database;
- Users can log in with username or email and password;
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
### Test with Postman:
- Get all posts
  ![getallposts](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/getallposts.png)
- Get a post by id
  ![getpostbyid](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/getapostbyid.png)
- New user register
  ![newusersignup](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/register.png)
- Users cannot register with the same username or email existed in the database
  ![notsameusersignup](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/usercan'tbethesame.png)
- Role_USER login
  ![userlogin](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/userlogin.png)
- Users with Role_USER Bearer Token cannot create/update/delete a post
  ![usercannotdeletepost]()
- Role_ADMIN login
  ![adminlogin](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/adminuserlogin.png)
- Users with Role_ADMIN Bearer Token can create/update/delete a post
  ![admincreatepost]()
  ![adminupdatepost](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/admincanupdate.png)
  ![admindeletepost](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/blob/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec/img/admincandelete.png)

