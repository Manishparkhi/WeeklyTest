# WeeklyTest

### Framework Used
+ Springboot

### Language Used
+  JAVA

### Data Flow

+ Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.

+ Repository - Here database is stored, for which I have used arrayList. In the database layer, CRUD (create, read, update, delete) operations are performed.

+ Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.

+ DataBase Class - Here the class user is defined and the whatever a user class will load. e.g -userId, userName, address, phone number etc.

### Data Structure used in my project

In our project H2 database and the methods involved with h2 Database, like add method for posting new User information, remove method for deleting a User_Id, combination of add and remove method for update User_Id and linear search function for searching a user in Java by specific userId.
### Project Summary

Our project basically maintains the upcoming user information which includes -

+ Job_Id.
+ Job_name.
+ Job_tittle
+ Job_description
+ Job_Location
+ Salary
+ Company_Name
+ Employer_Name
+ Job_Type

You can create a user information, read a user information, read by specific id, update userName of specific userId, delete a user by their userId by api calls
and also using H2 database.
 
