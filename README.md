# Spring Boot Task API

This is a minimal REST API built with Spring Boot for managing tasks.

## Features

- Create, retrieve, update, and delete tasks
- In-memory storage (ArrayList-based)
- Built entirely with standard Spring Boot tools

## Getting Started

```bash
mvn spring-boot:run
```

Once it's running, hit these endpoints:

- `GET /tasks` - list all tasks
- `POST /tasks` - add a new task
- `GET /tasks/{id}` - get one
- `PUT /tasks/{id}` - update
- `DELETE /tasks/{id}` - delete

## Structure

- `TaskController` - API endpoints
- `Task` - simple POJO model
- `DemoApplication` - app runner

---

Created by Jamar Robinson Jr. 
