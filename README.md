# Load Management System

## Introduction
A simple Spring Boot application to manage and track loads for shipping.It provides a set of API endpoints for adding, retrieving, updating, and deleting load information.

## Features

- **Add Load**: Users can add load details, including the loading point, unloading point, product type, truck type, number of trucks, weight, comments, shipper ID, and date.

- **Retrieve Loads by Shipper ID**: Loads can be retrieved based on the shipper ID. This is useful for shipper-specific load management.

- **Retrieve Load by Load ID**: Users can retrieve load details by providing the load's unique ID.

- **Update Load**: The system supports updating load details, including the loading point, unloading point, product type, truck type, number of trucks, weight, comments, and date.

- **Delete Load**: Loads can be deleted by specifying their unique ID.

 ## Prerequisites

Before using the Load Management System, ensure that you have the following prerequisites:

- Java Development Kit (JDK) installed
- Spring Boot and Spring Framework
- A database system (e.g., PostgreSQL, MySQL or H2) and configuration

## Endpoints
 The system provides the following API endpoints:

- `/load` POST: Add a new load with various details.
- `/load?shipperId=<shipperId>` GET: Retrieve loads based on the shipper ID.
- `/load/{loadId}` GET: Retrieve a specific load by its unique ID.
- `/load/{loadId}` PUT: Update an existing load by its unique ID.
- `/load/{loadId}` DELETE: Delete a load by its unique ID.

## Usage

Explain how to use the provided endpoints. Provide examples of requests and expected responses.
![LoadMangementSystem](https://github.com/AnkitKumarAK7/transport/assets/118627652/5537e994-ec03-4ca8-a5c2-96ead19da6a4)
