# 🍽️ Customer CRUD REST API

A Spring Boot REST API project for managing customer orders with complete CRUD (Create, Read, Update, Delete) operations. This project uses Spring Boot, Spring Data JPA, MySQL, and Swagger UI for API documentation.

---

## 🚀 Live Demo

🌐 Application URL:
https://customer-curd-1.onrender.com

📖 Swagger Documentation:
https://customer-curd-1.onrender.com/swagger-ui/index.html

🔗 GitHub Repository:
https://github.com/Bhawana-A/Customer_curd

---

## 📌 Features

✅ Create Customer Orders

✅ Get All Customer Orders

✅ Get Customer Order By ID

✅ Update Customer Orders

✅ Delete Customer Orders

✅ RESTful API Architecture

✅ Swagger UI Integration

---

## 🛠️ Technologies Used

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL Database
* Maven
* Lombok
* Swagger OpenAPI
* Render Deployment

---

## 📂 Project Structure

```text
src
├── controller
│   └── CustomerController
├── service
│   └── CustomerServices
├── repo
│   └── Customer_OrderRepo
├── entity
│   └── Customer_Order
└── application.properties
```

---

## 📊 Entity Model

### Customer_Order

| Field     | Type   |
| --------- | ------ |
| id        | Long   |
| name      | String |
| email     | String |
| orderDish | String |

---

## 🔗 API Endpoints

### Get All Orders

```http
GET /deploy
```

### Get Order By ID

```http
GET /deploy/{id}
```

### Create Order

```http
POST /deploy
```

Request Body:

```json
{
  "name": "Bhawana",
  "email": "bhawana@gmail.com",
  "orderDish": "Pizza"
}
```

### Update Order

```http
PUT /deploy/{id}
```

Request Body:

```json
{
  "name": "Bhawana",
  "email": "bhawana@gmail.com",
  "orderDish": "Burger"
}
```

### Delete Order

```http
DELETE /deploy/{id}
```

---

## ⚙️ Running Locally

### Clone Repository

```bash
git clone https://github.com/Bhawana-A/Customer_curd.git
```

### Navigate To Project

```bash
cd Customer_curd
```

### Run Application

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 👩‍💻 Author

**Bhawana Ahirwar**

GitHub:
https://github.com/Bhawana-A

---

## ⭐ Support

If you found this project helpful, please consider giving it a ⭐ on GitHub.
