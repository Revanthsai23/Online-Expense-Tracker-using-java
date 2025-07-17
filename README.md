# Online Expense Tracker

## Overview
The Online Expense Tracker is a web-based application that allows users to manage and track their expenses efficiently. Users can add, update, and delete expenses, view detailed reports, and manage their accounts. The application is built using Java Servlets, JSP, and Hibernate ORM for database interaction.

## Features
- **User Authentication**: Secure login and registration functionality.
- **Expense Management**: Add, update, delete, and view expenses.
- **Categorization**: Expenses can be categorized for better organization.
- **Reports**: Generate reports based on time periods, categories, etc.
- **Responsive Design**: User-friendly interface with responsive design for mobile and desktop.

## Project Structure
- **DAO Layer**: Handles database operations using Hibernate.
  - `ExpenseDao.java`: Manages CRUD operations for expenses.
  - `UserDao.java`: Manages CRUD operations for user accounts.
- **Entity Layer**: Represents the database entities.
  - `Expense.java`: Represents the `Expense` entity.
  - `User.java`: Represents the `User` entity.
- **Servlet Layer**: Handles HTTP requests and responses.
  - `LoginServlet.java`, `LogoutServlet.java`, `RegisterServlet.java`: Manage user authentication.
  - `SaveExpenseServlet.java`, `UpdateExpenseServlet.java`, `DeleteExpenseServlet.java`: Handle expense-related actions.
- **JSP Pages**: User interface components.
  - `index.jsp`: Homepage.
  - `login.jsp`: Login page.
  - `register.jsp`: Registration page.
  - `add_expense.jsp`, `view_expense.jsp`: Pages for managing expenses.

## Installation

https://github.com/YaswanthKan/Expensetracker/tree/main

### Prerequisites
- **Java 8+**
- **Maven 3+**
- **Apache Tomcat 8+**
- **MySQL 5+**

### Running the Application
- Open a browser and navigate to `http://localhost:8080/Online_Expense_Tracker`.
- Register a new account or log in with existing credentials.
- Start managing your expenses!

## Future Enhancements
- **Mobile App**: Develop a companion mobile application for on-the-go expense tracking.
- **Data Visualization**: Integrate charts and graphs for better data representation.
- **Multi-Currency Support**: Allow users to manage expenses in different currencies.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.
