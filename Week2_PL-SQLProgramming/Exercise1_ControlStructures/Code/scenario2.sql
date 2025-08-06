-- Alter Table to Add VIP Flag
ALTER TABLE Customers ADD (Balance NUMBER, IsVIP VARCHAR2(5));

-- Update balances
UPDATE Customers SET Balance = 15000 WHERE CustomerID = 1;
UPDATE Customers SET Balance = 5000 WHERE CustomerID = 2;
UPDATE Customers SET Balance = 12000 WHERE CustomerID = 3;

-- PL/SQL Block
BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;
END;
/

-- View result
SELECT CustomerID, Name, Balance, IsVIP FROM Customers;
