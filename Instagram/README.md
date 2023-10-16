

<div style="background-color:blue;color:green">

# <p align = "center" > Instagram Application </p>
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-purple.svg" />
</a>
<a href="x.com" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-blue.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-yellow.svg" /></a>
</p>

## Overview
instagram app demo
# Framework and Language Used
- Framework: Spring Boot


## Controller
### UserController
- Endpoints:
  - POST /api/v1/user/signUp - Allows users to sign up for the application.
  - POST /api/v1/user/signIn - Handles user sign-in and returns an authentication token.
  - PUT /api/v1/user/user - Enables users to update their email address.

### PostController
- Endpoints:
  - POST /post - Allows users to create and post new content.
  - GET /post/{postId} - Retrieves a specific post by its unique identifier (postId).

## Services
### UserService
- userservice

### PostService
- post
## Repository
### IUserRepository


### ITokenRepository
- Extends JpaRepository for managing authentication tokens.

### IPostRepository
- Extends JpaRepository for managing user posts.

## Database Design
- The database design includes the following tables:
  - User: Stores user information
  - AuthenticationToken: Manages authentication tokens for user sessions
  - Post: Stores user posts

## Data Structures Used
- Entity classes are used to model database tables, including User, AuthenticationToken, and Post.

## Project Summary
This an Instagram app built using Spring Boot and Java

## Contributing

Contributions are welcome! Feel free to open issues or pull requests for any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or suggestions, feel free to contact me at the following
## kevinrolandofficial@gmail.com
## linked in username
user not found

</div>