-- Table for Savings Accounts
CREATE TABLE SavingsAccounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER
);

-- Sample Data
INSERT ALL 
INTO SavingsAccounts VALUES (201, 1, 10000)
INTO SavingsAccounts VALUES (202, 2, 8000)
INTO SavingsAccounts VALUES (203, 3, 12000)
SELECT * FROM dual;

-- Stored Procedure
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE SavingsAccounts
    SET Balance = Balance + (Balance * 0.01);
END;
/

-- Execute and view
EXEC ProcessMonthlyInterest;

SELECT * FROM SavingsAccounts;