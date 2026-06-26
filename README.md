# Student Course Management System(Console-based)

## Project Description

The Student Course Management System is a simple Java console application developed using Object-Oriented Programming (OOP) concepts. It allows users to manage student and course information and assign a course to a student through a menu-driven program.

This project was created to demonstrate the implementation of core OOP principles such as Class & Object, Constructor, Encapsulation, Inheritance, Polymorphism, and Abstraction.

---

## Features

* Add Student Details
* Add Course Details
* Assign a Course to a Student
* Show Student Details
* Show Course Details
* Show All Students
* Show All Courses
* Menu-driven Console Application

---

## OOP Concepts Used

### 1. Class and Object

Classes created:

* Person
* Student
* Course
* Main

Objects of `Student` and `Course` are created to store data.

### 2. Constructor

Constructors are used to initialize student and course details when objects are created.

### 3. Encapsulation

All data members are declared as `private`.
Getter and Setter methods are used to access and modify the data.

### 4. Inheritance

The `Student` class extends the `Person` class to inherit common details like Name, Email, and Phone Number.

### 5. Polymorphism

Both `Student` and `Course` implement the `showDetails()` method from the `Display` interface.

### 6. Abstraction

The `Display` interface contains the abstract method:

```java
void showDetails();
```

This method is implemented by both `Student` and `Course`.

---

## Project Structure

```
StudentCourseProject
│
├── Display.java
├── Person.java
├── Student.java
├── Course.java
└── Main.java
```

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Eclipse IDE (or VS Code)

---

## How to Run

1. Download or clone the project.
2. Open the project in Eclipse or VS Code.
3. Compile all Java files.
4. Run `Main.java`.
5. Use the menu to perform different operations.

---

## Sample Menu

```
===== Student Course Management =====

1. Add Student
2. Add Course
3. Assign Course
4. Show Student Details
5. Show Course Details
6. Show All Students
7. Show All Courses
8. Exit
```

---

## Learning Outcomes

After completing this project, I learned:

* Creating classes and objects in Java
* Using constructors
* Applying encapsulation using getters and setters
* Implementing inheritance
* Using interfaces for abstraction
* Implementing polymorphism
* Working with arrays of objects
* Building a menu-driven console application

---

## Author

**Nemo**


