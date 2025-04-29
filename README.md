# Todo Management API

This is a simple Spring Boot application that provides RESTful APIs to manage Todo tasks. It allows users to create, read, update, and delete todos using a PostgreSQL or in-memory database through Spring Data JPA.

##  Features

- Get all todos
- Get a todo by ID
- Add a new todo
- Update a todo
- Delete a todo

##  Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL (or in-memory DB for testing)

##  API Endpoints

| Method | Endpoint        | Description       |
|--------|------------------|-------------------|
| GET    | `/todos`         | Get all todos     |
| GET    | `/todos/{id}`    | Get a todo by ID  |
| POST   | `/todos`         | Add a new todo    |
| PUT    | `/todos/{id}`    | Update a todo     |
| DELETE | `/todos/{id}`    | Delete a todo     |

##  Sample Todo JSON

```json
{
  "todo": "Finish Spring Boot Project",
  "status": "Pending",
  "priority": "High"
}
}
