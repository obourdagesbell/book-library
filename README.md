# Java 21 API - Library Management System

## Overview
This is a Spring Boot application built with Java 21. It provides a simple API for managing books in a library. The application uses an in-memory H2 database for persistence and includes endpoints for creating and retrieving books.

## Features
- **Create a Book**: Add a new book to the library.
- **Retrieve a Book by ID**: Fetch details of a specific book using its ID.
- **In-Memory Database**: Uses H2 for quick and easy data storage.
- **REST API Testing**: Includes an `.http` file for testing API endpoints.

## Project Structure
```
src/
  main/
    java/
      com/
        library/
          LibraryApplication.java       # Main application entry point
          api/
            controllers/
              BookController.java       # REST controller for book endpoints
            mappers/
              BookMapper.java           # Maps between domain and API models
            models/
              BookViewModel.java        # API model for books
          domain/
            entities/
              Book.java                 # Domain model for books
            services/
              BookService.java          # Business logic for books
          persistence/
            entities/
              BookEntity.java           # Persistence model for books
            mappers/
              BookPersistenceMapper.java # Maps between domain and persistence models
            repositories/
              BookRepository.java       # JPA repository for books
    resources/
      application.yml                   # Application configuration
  test/
    java/
      com/
        library/
          api/
            controllers/
              BookControllerTest.java   # Unit tests for BookController
```

## Prerequisites
- Java 21
- Maven

## Setup
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd java21-api
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints
### Base URL
`http://localhost:8080`

### Endpoints
See [book.http](/docs/rest/book.http)

## Testing the API
Use the `.http` file located in `docs/rest/book.http` to test the API endpoints. You can use the [REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) extension in VS Code to execute the requests.