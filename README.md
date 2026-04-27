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

## 📁 Project Structurehospital-management-system/
├── src/main/java/com/example/hms
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
├── src/main/resources/
│   └── application.properties
├── pom.xml
└── README.md

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

### Auth APIs
| Method | Endpoint | Description |
|---|---|---|
| POST | /api/auth/register | Register a new user |
| POST | /api/auth/login | Login and get JWT token |

### Patient APIs (🔒 Secured — JWT Required)
| Method | Endpoint | Description |
|---|---|---|
| POST | /api/patients | Add a new patient |
| GET | /api/patients | Get all patients |
| GET | /api/patients/{id} | Get patient by ID |
| PUT | /api/patients/{id} | Update patient |
| DELETE | /api/patients/{id} | Delete patient |

---

## 🛠️ Setup Instructions

### Prerequisites
- Java 17+
- MySQL running on localhost:3306
- Maven

### Database Setup
```sqlCREATE DATABASE IF NOT EXISTS hospitalmgmtdb;

### Run the Application
```bash./mvnw spring-boot:run

---

## 🔑 Authorization HeaderAuthorization: Bearer <your_jwt_token>

---

## 📌 Project Flow

**Registration:** User → AuthController → AuthService → Encode Password → Save → Success

**Login:** User → AuthController → AuthService → Verify → Generate JWT → Return Token

**Secured API:** Token → JwtFilter → Validate → PatientController → PatientService → DB

---

## 📝 Future Enhancements
- Doctor Module
- Appointment Module
- Role-based Access Control
- React Frontend
- Swagger API Docs
- Pagination and Search
