# Shopping Cart API

## Overview
A simple RESTful web service that allows clients to manage a shopping cart. It provides endpoints to add an item to the cart, retrieve all items, update the quantity of an item, and remove an item from the cart.

## Technologies Used
- **Java:** To implement the program.
- **Spring Boot:** For building the RESTful web service.
- **JUnit 5:** For unit testing the application.
- **Postman:** For testing the API endpoints manually.

## Project Structure
The project consists of the following main components:

### ShoppingCartApiApplication
- The main class to run the Spring Boot application.

### Item
- A model class representing an item in the shopping cart. It has three attributes: name, price, and quantity.

### CartService
- A service class that contains the business logic for managing the shopping cart. It provides methods to add, retrieve, update, and remove items.

### CartController
- A REST controller to handle HTTP requests and delegate the business logic to CartService.

## Endpoints
#### Add an Item to the Cart
- URL: /api/cart/items 
- Method: POST 
- Request Body: JSON of the item to be added. 
- Response: A message showing that an item has been added to the cart.

#### Get All Items in the Cart
- URL: /api/cart/items
- Method: GET
- Response: A JSON list of all items in the cart.

##### Update the Quantity of an Item
- URL: /api/cart/items/{name} 
- Method: PATCH 
- Parameters: name (path parameter), quantity (query parameter)
- Response: A message showing that an item's quantity has been updated.

#### Remove an Item from the Cart
- URL: /api/cart/items/{name} 
- Method: DELETE 
- Parameters: name (path parameter)
- Response: A message showing than an item has been removed from the cart.