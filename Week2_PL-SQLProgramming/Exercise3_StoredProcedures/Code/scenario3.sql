-- Table for Accounts
CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER
);

-- Sample Data
INSERT ALL
INTO Accounts VALUES (401, 1, 5000)
INTO Accounts VALUES (402, 1, 3000)
SELECT * FROM dual;

-- Stored Procedure
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance.');
    ELSE
        UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_account;
        UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_account;
    END IF;
END;
/

-- Execute fund transfer
EXEC TransferFunds(401, 402, 1000);

-- View result
SELECT * FROM Accounts;
