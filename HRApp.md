Here are the details of the classes that need to be implemented:

1. a `Employee` class, to define details of each employee.
2. a `Department` class, to define what is a student and its details.
3. a `HRApp` class, to allow a Student to interact with the Library.

EMPLOYEE CLASS :
1. Each Employee has an int identification number, string name and double salary.
2. Encapsulate all fields, and provide getter and setter methods for each.
3. Initialise all fields with a constructor.
4. Override the toString() method to print these fields.
 
DEPARTMENT CLASS :
Create additional fields as needed, as you write methods to process Department data. All fields must be private. Your program must not crash as a result of calling these methods.
1. Create a private Employee array field to store all Employees in a Department, with a capacity of 10 Employees.
2. Provide a method to add an Employee to a Department.Ensure that the number of Employees must not extend the Department's capacity.
3. Provide a method to return an array of Employees in the Department. This array must not contain null values.
4. Provide a method to return a number of Employees currently working in the Department.   
5. Provide a method to identify an Employee based on their identification number. Return the Employees object if it exists.
6. Provide a method that returns the total Salary of all Employees in the Department.
7. Provide a method that returns the average Salary of Employees in the Department.

HRApp CLASS :
1. This class contains a single main method.
2. Create a print method to say that the application is starting.
3. Create a new Department object.
4. Call toString() to print the information about the Department.
5. Create a few Employees and add them to the Department.
6. Locate an Employee by the identification number. Call toString() to print the information about this Employee.
7. Get every Employee in the Department and print their information.
8. Print the total Salary for that Department.
9. Print the average Salary for that Department. 

PROGRAM OUTPUT :

```
 HR App Starts
 Department : Department Education
 Employee : 101 Ann 1234.56
 Employee : 102 Bob 1200.34
 Employee : 103 Ray 1122.33
 Total Salary : 2434.8999999999
 Average Salary : 811.6333333
```