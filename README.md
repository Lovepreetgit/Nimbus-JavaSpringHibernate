# Nimbus-JavaSpringHibernate

# Spring and Hibernate Web Applications Assignment

This repository contains solutions for three Java application tasks using Spring and Hibernate, as per assignment instructions on Nimbus.

---

## Part a: Dependency Injection in Spring Using Java-Based Configuration

**Objective:**  
To demonstrate Dependency Injection (DI) in Spring using Java annotations instead of XML.

**Files:**
- `spring/Student.java`: Student class depending on Course.
- `spring/Course.java`: Course dependency.
- `spring/AppConfig.java`: Spring configuration with `@Configuration` and `@Bean`.
- `spring/MainApp.java`: Main runner to initialize context and call methods.

**Description:**  
This part shows how to manage object wiring using Spring’s DI with Java-based configuration and annotations.

---

## Part b: Hibernate Application for Student CRUD Operations

**Objective:**  
To build a Hibernate ORM app that performs Create, Read, Update, Delete on a Student entity stored in MySQL.

**Files:**
- `hibernate/Student.java`: Annotated JPA entity.
- `hibernate/HibernateUtil.java`: Hibernate SessionFactory utility.
- `hibernate/StudentDAO.java`: Student CRUD methods.
- `hibernate/MainCRUD.java`: Demo class for CRUD testing.
- `hibernate.cfg.xml`: Hibernate configuration file (in root).

**Description:**  
This part covers Hibernate mapping, session management, and CRUD operations via DAO pattern.

---

## Part c: Transaction Management Using Spring and Hibernate

**Objective:**  
To demonstrate declarative transaction management for a banking scenario, ensuring atomic money transfers.

**Files:**
- `banking/Account.java`: Entity for bank accounts.
- `banking/Transaction.java`: Entity for transactions.
- `banking/AccountService.java`: Service layer with `@Transactional` annotation.
- `banking/AppConfig.java`: Spring configuration for services.
- `banking/BankMain.java`: Example runner for money transfer.

**Description:**  
Implements Spring’s transaction management to ensure safe money transfers. All steps are atomic: on failure, the transaction is rolled back.

---

## How to Run

1. Clone the repository (`git clone <your_repo_link>`).
2. Import the code into your Java IDE.
3. Ensure Spring and Hibernate dependencies (see pom.xml or build.gradle if using Maven/Gradle—add as needed).
4. Set up a MySQL or supported database; configure connection details in `hibernate.cfg.xml`.
5. Run each part as a separate Java program.

---

## Notes

- All code is organized in folders by topic: `spring`, `hibernate`, `banking`.
- Replace database credentials in `hibernate.cfg.xml` before running.
- These are simplified demo apps for educational purposes.

---

## Author

Lovepreet
