# Restaurant Management System

A RESTful backend application developed using Java and Spring Boot to manage restaurant information and food items. The application uses Spring Data JPA for database operations and exposes REST APIs for CRUD operations.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Git and GitHub

## Features

- Create a new restaurant.
- Retrieve all restaurants.
- Retrieve restaurant details by ID.
- Update restaurant names.
- Delete restaurant records.
- Create food items associated with existing restaurants.
- Retrieve all food items.
- Retrieve food items by restaurant ID.
- Handle requests for restaurants that do not exist when creating food items.

## API Endpoints

### Restaurant APIs

| Method | Endpoint | Description |
|---|---|---|
| GET | `/restaurant/GetAllRest` | Get all restaurants |
| POST | `/restaurant/CreateRest` | Create a restaurant |
| GET | `/restaurant/getres/{id}` | Get a restaurant by ID |
| PUT | `/restaurant/Update/{id}` | Update a restaurant |
| DELETE | `/restaurant/Delres/{id}` | Delete a restaurant |

### Food Item APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | `/FoodItems/Create` | Create a food item |
| GET | `/FoodItems/getfooditem` | Get all food items |
| GET | `/FoodItems/getfooditemsbyid/{id}` | Get food items by restaurant ID |

## Getting Started

### Prerequisites

- Java JDK
- Maven
- MySQL Server

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/UdayaChandra-36/Spring_boot_restaurant_backend.git
   ```

2. Open the project in your preferred Java IDE.

3. Configure the MySQL database connection in `restaurantservice/src/main/resources/application.properties`.

4. Run the Spring Boot application from your IDE or use Maven:

   ```bash
   cd restaurantservice
   mvn spring-boot:run
   ```

5. Test the REST APIs using Postman or another API client.

The application typically runs on `http://localhost:8080`, unless another port is configured.

## Future Enhancements

- Add food item update and delete endpoints.
- Improve request validation and exception handling.
- Add API documentation using Swagger/OpenAPI.
- Integrate a React frontend.
- Deploy the backend to a cloud hosting platform.

## Author

Udaya Chandra
