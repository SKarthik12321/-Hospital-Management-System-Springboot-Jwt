# 🏥 Hospital Management System (Spring Boot + JWT)

A simple and secure Hospital Management System backend API built using **Spring Boot** with **JWT-based authentication** and **Patient Management** CRUD operations.

---

## 🚀 Tech Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Security | Security Layer |
| Spring Data JPA | ORM / Database Access |
| JWT (jjwt) | Token-Based Authentication |
| MySQL | Relational Database |
| Lombok | Boilerplate Reduction |
| Maven | Build Tool |
| Postman | API Testing |

---

## 📁 Project Structure

```
src/
└── main/
    ├── java/com/example/hms/
    │   ├── config/
    │   │   ├── SecurityConfig.java
    │   │   ├── JwtAuthenticationFilter.java
    │   │   └── JwtService.java
    │   ├── controller/
    │   │   ├── AuthController.java
    │   │   └── PatientController.java
    │   ├── dto/
    │   │   ├── AuthRequest.java
    │   │   ├── AuthResponse.java
    │   │   └── PatientDto.java
    │   ├── entity/
    │   │   ├── User.java
    │   │   ├── Role.java
    │   │   └── Patient.java
    │   ├── repository/
    │   │   ├── UserRepository.java
    │   │   └── PatientRepository.java
    │   ├── service/
    │   │   ├── AuthService.java
    │   │   └── PatientService.java
    │   └── HospitalManagementApplication.java
    └── resources/
        └── application.properties
```

---

## 📦 Modules

### 🔐 Auth Module
- User Registration
- User Login
- JWT Token Generation
- JWT Token Validation
- API Security

### 🏨 Patient Module
- Add Patient
- Get All Patients
- Get Patient by ID
- Update Patient
- Delete Patient

---

## 🔗 API Endpoints

### Auth APIs (Public)

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/auth/register | Register a new user |
| POST | /api/auth/login | Login and get JWT token |

### Patient APIs (🔒 JWT Required)

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/patients | Add a new patient |
| GET | /api/patients | Get all patients |
| GET | /api/patients/{id} | Get patient by ID |
| PUT | /api/patients/{id} | Update patient |
| DELETE | /api/patients/{id} | Delete patient |

---

## 🛠️ Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/SKarthik12321/-Hospital-Management-System-Springboot-Jwt.git
cd Hospital-Management-System-Springboot-Jwt
```

### 2. Create MySQL Database
```sql
CREATE DATABASE IF NOT EXISTS hospitalmgmtdb;
```

### 3. Configure application.properties
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospitalmgmtdb
spring.datasource.username=root
spring.datasource.password=root
```

### 4. Run the Application
```bash
./mvnw spring-boot:run
```

---

## 🔑 Authorization Header Format
Authorization: Bearer <your_jwt_token>

---

## 📌 Project Flow

**Registration** → User sends name, email, password → password encoded → saved to DB

**Login** → User sends email, password → JWT token generated → token returned

**Secured API** → Token sent in header → JWT validated → request allowed → response returned

---

## 🌿 Branch Strategy

| Branch | Purpose |
|---|---|
| main | Production ready — README only |
| develop | Integration branch — skeleton |
| feature/db-config | Database configuration |
| feature/auth | Auth module — JWT + Security |
| feature/patient | Patient CRUD module |

---

## 📝 Future Enhancements

- Doctor Module
- Appointment Module
- Role-based Access Control
- React Frontend
- Swagger API Documentation
- Pagination and Search
EOF
