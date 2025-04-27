##

## TASK MANAGEMENT API(TODO LIST)
##

# FEATURES
## The program has been designed using the Spring Boot MVC model and consists of.
 + TaskModel.
 + TaskRepository.
 + TaskService.
 + TaskController.
  
### With these features, it will permit the user to carry out CRUD operations within the application

##

# TECH STACK
## The following software was used to achieve this project.
+ PostgreSQL.
+ IntelliJ IDEA.
+ Postman.
+ Ubuntu 2024.
+ Spring Boot 3.

##
# RUNNING THE APPLICATION
## Below is a table that shows the different endpoints that should be used in Postman to view diffrent tasks from the database.

##


|METHOD     |   ENDPOINT        |              DESCRIPTION                                                 |
| ----------|------------------ |--------------------------------------------------------------------------|
| GET       |/api/gettask/id    |     This will list a particular task based on the id passed              |
| POST      |/api/createTask    |     This will create a new task in the database                          |
| PUT       |/api/updateTask/id |     This will update a particular task based on the id  passed           | 
| DELETE    |/api/deleteTask/id |     This will delete a particular task based on the id passed            |
| GET       | /api/getAll|      |     This will list all the tasks in the database                         |


##
## NB 
+ The database for this project can be found in the resource folder (todolistdb.sql).
+ Swagger has also been implemented to enable a perfect view of all the endpoints. (http://localhost:8081/swagger-ui/index.html )
