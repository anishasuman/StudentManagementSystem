# 🎓 Student Management System

A Java-based Student Management System developed using **Java Swing**, **JDBC**, and **MySQL**. The application allows users to search student records by ID and view student information through a graphical user interface.

## 🌐 Live Demo

**Website:** https://studentmanagementhub.onrender.com

## 🚀 Features

* Search Student by ID
* Display Student Details

  * ID
  * Name
  * Age
  * Course
* MySQL Database Connectivity
* JDBC Integration
* DAO (Data Access Object) Design Pattern
* User-Friendly Interface

## 🛠️ Technologies Used

* Java
* Java Swing
* JDBC
* MySQL
* Maven
* IntelliJ IDEA
* HTML
* CSS
* JavaScript

## 📂 Project Structure

```text
StudentManagementSystem
│
├── src
│   └── main
│       ├── java
│       │   ├── DBConnection.java
│       │   ├── Student.java
│       │   ├── StudentDAO.java
│       │   ├── StudentGUI.java
│       │   └── Main.java
│       │
│       └── resources
│           ├── index.html
│           ├── style.css
│           └── script.js
│
├── pom.xml
└── README.md
```

## 🗄️ Database Schema

### Student Table

| Column | Type        |
| ------ | ----------- |
| id     | INT         |
| name   | VARCHAR(50) |
| age    | INT         |
| course | VARCHAR(50) |

## 💻 How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Configure MySQL database
4. Update database credentials in `DBConnection.java`
5. Run `Main.java`

## 🔮 Future Enhancements

* Add Student
* Update Student
* Delete Student
* View All Students
* Spring Boot Integration
* REST APIs
* Authentication & Authorization
* Docker Deployment
* AWS Deployment

## 👩‍💻 Author

**Anisha Kumari**

GitHub: https://github.com/anishasuman

---

⭐ If you like this project, don't forget to star the repository.
