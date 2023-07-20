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
![table](https://github.com/Mengzhe-Madeline-Zhang/Springboot_POC_Project/commit/cd8a5920247e83dc55a2cd440b4a78f32e82e0ec#diff-6b65f34646012b80e03caa818a37cb83504154b6fd230a43a3b74acec129612c)
- Posts Table
- Roles Table
- Users Table
- Users_roles Table
### Test with Postman:
- Get all posts
- Get a post by id
- New user register
- Users cannot register with the same username or email existed in the database
- Role_USER login
- Users with Role_USER Bearer Token cannot create/update/delete a post
- Role_ADMIN login
- Users with Role_ADMIN Bearer Token can create/update/delete a post
