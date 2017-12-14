Spring Boot RMI Sandbox
====================================================================================
A Spring Boot project that showcases different RMI technologies that you can use with Spring. A simple "User"
service is exposed over RMI that will let you getAllUsers() or getRandomUser().


## Technologies used
* plain old RMI
* Hessian RMI
* Spring Http RMI

## Running
1. configure a RMI profile in application.properties, one of:
    * rmi
    * hessian
    * http
2. start the main spring boot application which will start the configured RMI service using the profile selected
3. Run the test client corresponding to the rmi profile you configured
