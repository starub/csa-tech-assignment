# csa-tech-assignment

Pre-requisites :

1. Java runtime with 1.8 language support.
2. Maven SCM toolkit.
2. MongoDB with default configuration.

Installation (from Internet):

1. Clone project repository from Github 

git clone https://github.com/starub/csa-tech-assignment.git 

2. Change to project directory

cd csa-tech-assignment

3. Let Maven download necessary dependencies, build and test application

mvn clean package

4. Generate dummy data for reporting

mvn test -Dtest=DummyDataTestSuite

5. Launch application

mvn spring-boot:run

Installation (from supplied archive):

1. Unpack archive

unzip "Stanislavs_Rubens - Chief Software Architect - Java.zip"

2. Change to project directory

cd Code

3. Let Maven download necessary dependencies, build and test application

mvn clean package

4. Generate dummy data for reporting

mvn test -Dtest=DummyDataTestSuite

5. Launch application

mvn spring-boot:run

Usage :

Using web browser : 

1. Navigate to http://localhost:8080/customer/list to view list of customers

2. Navigate to http://localhost:8080/transaction/list to view list of transactions made by customers

3. Navigate to http://localhost:8080/payment/list to view list of payments made by customers during transactions.

4. Navigate to http://localhost:8081/services/camel/customer to view list of customers as Camel Restlet consuming endpoint.

Using 'curl' tool :

1. curl -X GET http://localhost:8080/customer/list

2. curl -X GET http://localhost:8080/transaction/list

3. curl -X GET http://localhost:8080/payment/list

4. curl -X GET http://localhost:8081/services/camel/customer
