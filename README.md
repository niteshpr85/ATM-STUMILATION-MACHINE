🏧 ATM Simulation Machine

A Java-based ATM Simulation Machine that demonstrates core banking operations such as user authentication, balance inquiry, cash withdrawal, deposit, and transaction history using Java and SQL database integration.

This project is ideal for academic purposes, Java practice, and understanding database connectivity (JDBC).

📌 Features

🔐 User Authentication (Card Number & PIN)

💰 Balance Inquiry

➕ Cash Deposit

➖ Cash Withdrawal

📜 Transaction History

🗄️ SQL Database Integration

❌ Secure handling of invalid inputs

🛠️ Technologies Used

Programming Language: Java

Database: MySQL / SQL Server

Database Connectivity: JDBC

IDE: IntelliJ IDEA / Eclipse / NetBeans

Version Control: Git & GitHub

🗃️ Database Structure
Table: users
Column Name	Data Type
user_id	INT (Primary Key)
card_number	VARCHAR(20)
pin	VARCHAR(10)
balance	DECIMAL(10,2)
Table: transactions
Column Name	Data Type
transaction_id	INT (Primary Key)
user_id	INT (Foreign Key)
type	VARCHAR(20)
amount	DECIMAL(10,2)
transaction_date	DATETIME
⚙️ Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/your-username/ATM-Simulation-Machine.git

2️⃣ Configure Database

Create a database named atm_db

Import the SQL tables

Update database credentials in Java file:

String url = "jdbc:mysql://localhost:3306/atm_db";
String username = "root";
String password = "your_password";

3️⃣ Compile and Run
javac ATM.java
java ATM

🧪 Sample Operations

Login using Card Number & PIN

Select operation:

Check Balance

Deposit

Withdraw

View Transactions

Exit

📂 Project Structure
ATM-Simulation-Machine/
│
├── src/
│   ├── ATM.java
│   ├── User.java
│   ├── Transaction.java
│   └── DBConnection.java
│
├── sql/
│   └── atm_database.sql
│
├── README.md

🚀 Future Enhancements

GUI using JavaFX / Swing

OTP-based authentication

Admin panel

Multi-account support

Encryption for PIN storage
