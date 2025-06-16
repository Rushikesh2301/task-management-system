# 📝 Task Management System

A simple and efficient Task Management System built with **Spring Boot**, **Spring Data JPA**, and **MySQL**. It allows users to manage their daily tasks with priority, due dates, and completion status.

## 🚀 Features

- Create, edit, and delete tasks
- Set task priority (HIGH, MEDIUM, LOW)
- Track status (PENDING, COMPLETED)
- Assign due dates
- Filter tasks by user or status (optional)
- REST API endpoints

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL or H2 Database
- Maven

## 📂 Project Structure
src/
└── main/
├── java/
│ └── com/taskmanagement/
│ ├── controller/
│ ├── service/
│ ├── model/
│ ├── repository/
│ └── TaskManagementApplication.java
└── resources/
├── application.properties
└── static/


## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/task-management-system.git
   
2. Open the project in your IDE.

3. Configure your database in application.properties.

4. Run the TaskManagementApplication.java file.
