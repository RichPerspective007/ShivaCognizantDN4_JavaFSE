-- Alter Loans table
ALTER TABLE Loans ADD (DueDate DATE);

-- Update due dates
UPDATE Loans SET DueDate = SYSDATE + 10 WHERE LoanID = 101;
UPDATE Loans SET DueDate = SYSDATE + 40 WHERE LoanID = 102;
UPDATE Loans SET DueDate = SYSDATE + 5 WHERE LoanID = 103;

-- PL/SQL Block
BEGIN
    FOR loan_rec IN (
        SELECT L.LoanID, C.Name, L.DueDate
        FROM Loans L
        JOIN Customers C ON L.CustomerID = C.CustomerID
        WHERE L.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan_rec.LoanID || ' for ' || loan_rec.Name || ' is due on ' || loan_rec.DueDate);
    END LOOP;
END;
/
