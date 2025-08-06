-- Table Creation
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Sample Data
INSERT INTO Customers VALUES (1, 'John Doe', 65);
INSERT INTO Customers VALUES (2, 'Jane Smith', 45);
INSERT INTO Customers VALUES (3, 'Bob Brown', 70);

INSERT INTO Loans VALUES (101, 1, 7.5);
INSERT INTO Loans VALUES (102, 2, 8.0);
INSERT INTO Loans VALUES (103, 3, 6.5);

-- PL/SQL Block
BEGIN
    FOR cust_rec IN (SELECT CustomerID FROM Customers WHERE Age > 60) LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust_rec.CustomerID;
    END LOOP;
END;
/

-- View result
SELECT * FROM Loans;
