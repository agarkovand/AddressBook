# AddressBook

This is a Simple Address Book.

You may use it to keep contacts of your friends (Emails and Phones).

One person may have many Emails addresses and many phones.

To have this application work as expected one should create db.properties file with the following parametes: 

spring.datasource.url=jdbc:postgresql://localhost:5432/britenet
spring.datasource.username=postgres
spring.datasource.password=****

Please change the values of the parameters according to your DB Connections details, place the file on the classpath
and add --spring.config.location=classpath:/db.properties,classpath:/application.properties option to the program execution line.
