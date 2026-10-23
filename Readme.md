# Library Management System (Java)

## Overview
A console-based Library Management System built using Core Java that helps librarians manage books, patrons, and lending operations efficiently.

The project demonstrates strong implementation of:
- Object-Oriented Programming (OOP)
- SOLID Principles
- Design Patterns
- Layered Architecture

---

# Features

## Book Management
- Add books to the library
- Remove books from the library
- Search books by:
  - Title
  - Author
  - ISBN
- Track availability status of books

## Patron Management
- Register new patrons
- Maintain patron borrowing history
- Manage patron information

## Lending System
- Borrow books
- Return books
- Track active and returned loans
- Prevent borrowing of unavailable books

## Inventory Management
- Maintain records of:
  - Available books
  - Borrowed books
  - Loan history

---

# OOP Concepts Used

## Encapsulation
Used private fields with getters/setters for controlled data access.

## Abstraction
Implemented repository interfaces to separate business logic from storage logic.

## Association
Created relationships between:
- Book
- Patron
- Loan

## Polymorphism
Implemented using the Strategy Pattern for flexible recommendation logic.

---

# SOLID Principles Applied

## Single Responsibility Principle (SRP)
Each layer has a dedicated responsibility:
- Model Layer → Data representation
- Repository Layer → Data storage
- Service Layer → Business logic

## Dependency Inversion Principle (DIP)
Services depend on interfaces rather than concrete implementations.

---

# Design Patterns Used

## Factory Pattern
Implemented using `LoanFactory` to centralize Loan object creation.

## Strategy Pattern
Implemented recommendation strategies such as:
- Author-based recommendation
- Extensible recommendation logic for future enhancements

---

# Technologies Used

- Core Java
- Java Collections Framework (`Map`, `List`)
- `java.time` API

---

# Project Structure

```text
src/
│
├── model/
│   ├── Book.java
│   ├── Patron.java
│   └── Loan.java
│
├── repository/
│   ├── BookRepository.java
│   └── BookRepo.java
│
├── service/
│   ├── LibraryService.java
│   ├── LendingService.java
│   └── RecommendationService.java
│
├── factory/
│   └── LoanFactory.java
│
├── strategy/
│   ├── RecommendationStrategy.java
│   └── AuthorStrategy.java
│
└── util/
    └── Main.java

UML Class Overview

Book
- isbn
- title
- author
- year
- available

+ getters/setters

Patron
- id
- name
- borrowingHistory

+ addLoan()

Loan
- loanId
- book
- patron
- borrowDate
- returnDate

+ markReturned()
+ isReturned()

Entity Relationships

Patron 1 -------- * Loan
Book   1 -------- 1 Active Loan

Repository Layer

BookRepository (Interface)
+ add()
+ find()
+ getAll()

Service Layer

LendingService
+ borrowBook()
+ returnBook()
