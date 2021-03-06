csa-tech-assignment

Description

Please find below short instructions on deploying technical assignment application on local environment, its usage, and reporting functionality.

Prerequisites :

Java runtime with 1.8 language support.

Maven SCM toolkit.

MongoDB with default configuration.

Installation from Internet :

Clone project repository from Github

git clone https://github.com/starub/csa-tech-assignment.git 

Change to project directory

cd csa-tech-assignment

Let Maven download necessary dependencies, build and test application

mvn clean package

Generate dummy data for reporting

mvn test -Dtest=DummyDataTestSuite

Launch application

mvn spring-boot:run

Installation from supplied archive :

Unpack archive

unzip "Stanislavs_Rubens - Chief Software Architect - Java.zip"

Change to project directory

cd Code

Let Maven download necessary dependencies, build and test application

mvn clean package

Generate dummy data for reporting

mvn test -Dtest=DummyDataTestSuite

Launch application

mvn spring-boot:run

Usage :

Using web browser :

Navigate to http://localhost:8080/customer/list to view list of customers

Navigate to http://localhost:8080/transaction/list to view list of transactions made by customers

Navigate to http://localhost:8080/payment/list to view list of payments made by customers during transactions.

Navigate to http://localhost:8081/services/camel/customer to view list of customers as Camel Restlet consuming endpoint.

Using 'curl' tool :

curl -X GET http://localhost:8080/customer/list

curl -X GET http://localhost:8080/transaction/list

curl -X GET http://localhost:8080/payment/list

curl -X GET http://localhost:8081/services/camel/customer

Reports :

Using web browser :

Navigate to http://localhost:8080/transaction/{customerId} to view all transactions for particular customer.

Navigate to `http://localhost:8080/payment/{transactionId} to view all payments for particular transaction.

Using 'curl' tool :

curl -X GET http://localhost:8080/transaction/{customerId}

curl -X GET http://localhost:8080/payment/{transactionId}