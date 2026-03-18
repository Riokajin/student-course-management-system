# student-course-management-system
Group Project for Java OOP, validation, exceptions, and collections. 

## Group Members
- Adam Evans
- Cameron Yon-vachon
- Valentina Romar

## Project Overview
This project is a simple Student Course Management System built using:
- Object-Oriented Programming (classes, objects, encapsulation)
- Input validation
- Exception handling with try/catch
- Dynamic data storage using ArrayList
 
The program allows users to add students, validate their information, assign courses, and display stored data.

## Features
- Add new students
- Validate student ID(S-####) and email format
- Assign courses to students
- Display all stored students
- Search students by ID
- Handle invalid input without crashing
- Demonstrate inheritance through Person, Student, and Instructor classes

## Class Structure
Person (abstract)
  |--Student
  |--Instructor
  |--Coourse
Main (menu + program flow
- Person: base abstract class with shared fields
- Student: extends Person, used in the main program
- Instructor: extends Person, included for OOP demonstration
- Course: standalone class representing course data, included to show system expansion
- Main: handles menu, input, and data processing

## Task Breakdown (To Be Finalized)
- [ ] Member 1 - TBD
- [ ] Member 2 - TBD
- [ ] Member 3 - TBD

## How to Run
1. Clone the repository
2. Open the project in VS Code
3. Compile and run Main.java
4. Follow the menu prompts

## Notes 
- Instructor objects are included to demonstrate inheritance but are not part of the final menu system.
- Course included to demonstrate how the system could expand to manage course data.
- The project focuses on student management as required by the assignment.
