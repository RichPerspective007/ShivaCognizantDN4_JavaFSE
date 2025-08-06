-- Employee Table
CREATE TABLE Employees (
    EmpID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER
);

-- Sample Data
INSERT ALL
INTO Employees VALUES (301, 'Alice', 'Sales', 5000)
INTO Employees VALUES (302, 'Bob', 'IT', 6000)
INTO Employees VALUES (303, 'Charlie', 'Sales', 5500)
SELECT * FROM dual;

-- Stored Procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;
END;
/

-- Execute for Sales department
EXEC UpdateEmployeeBonus('Sales', 10);

-- View result
SELECT * FROM Employees;
