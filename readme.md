## Project Description

This project is a small web application for Employee Management System, made using Java, Spring-Boot, Hibernate, Thymeleaf, Maven & MySQL.

#### Browser <-> Controller <-> Service <-> DAO <-> DB

### Methodology

1. Set up the Database using MySQL workbench & provide DB connection info in the application.properties file.
2. Create JPA Entity (Employee.java in /src/...../model/)
3. Create DAO Layer - (EmployeeRepository.java in /src/...../repository/)
    - Here, EmployeeRepository extends JpaRepository which exposes the CRUD operations to be carried out on the DB.
    
4. Create the Service Layer
    - Create an interface EmployeeService.java (in /src/...../service/) which specifies the methods to be implemented for carrying out the business logic.
    - EmployeeServiceImpl.java (in /src/...../service/) implements the methods in the interface EmployeeService.java
    
5. Create the Controller (EmployeeController.java in /src/...../controller/) which exposes the APIs for method handlers against the methods implemented in the service layer & returns the view.
6. Create the View Layer (index.html, new_employee.html, update_employee.html in /resources/templates/) which renders the UI in the browser.

#### Functionalities Implemented -

1. View List of Employees and their details in a paginated format.
2. Add a new employee.
3. Update employee details.
4. Delete an employee.

#### Running the application -
1. Create a MySQL connection in MySQL workbench with your username and password.
2. Create a DB named ems in MySQL workbench.
3. Specify/modify the following in the application.properties file (in /src/main/resources/):
   spring.datasource.url=jdbc:mysql://localhost:3306/ems?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false</br>
   spring.datasource.username=</br>
   spring.datasource.password=</br>
   
4. Run EmsApplication.java (in /src/..../ems/) which is the entry point to the Spring Application.
5. Navigate to localhost:8080 on the browser.



