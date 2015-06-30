# csa-tech-assignment

**Pre-requisites :**

1. Java runtime with 1.8 language support.
2. Maven SCM toolkit.
2. MongoDB with default configuration.

**Installation from Internet :**

* Clone project repository from Github 
```
git clone https://github.com/starub/csa-tech-assignment.git 
```
* Change to project directory
```
cd csa-tech-assignment
```
* Let Maven download necessary dependencies, build and test application
```
mvn clean package
```
* Generate dummy data for reporting
```
mvn test -Dtest=DummyDataTestSuite
```
* Launch application
```
mvn spring-boot:run
```

**Installation from supplied archive :**

* Unpack archive
```
unzip "Stanislavs_Rubens - Chief Software Architect - Java.zip"
```
* Change to project directory
```
cd Code
```
* Let Maven download necessary dependencies, build and test application
```
mvn clean package
```
* Generate dummy data for reporting
```
mvn test -Dtest=DummyDataTestSuite
```
* Launch application
```
mvn spring-boot:run
```

**Usage :**

Using web browser : 

1. Navigate to `http://localhost:8080/customer/list` to view list of customers

2. Navigate to `http://localhost:8080/transaction/list` to view list of transactions made by customers

3. Navigate to `http://localhost:8080/payment/list` to view list of payments made by customers during transactions.

4. Navigate to `http://localhost:8081/services/camel/customer` to view list of customers as Camel Restlet consuming endpoint.

Using 'curl' tool :

1. ```curl -X GET http://localhost:8080/customer/list```

2. ```curl -X GET http://localhost:8080/transaction/list```

3. ```curl -X GET http://localhost:8080/payment/list```

4. ```curl -X GET http://localhost:8081/services/camel/customer```

**Reports :**

Using web browser :

1. Navigate to ```http://localhost:8080/customer/{customerId}``` to view particular customer.

2. Navigate to ```http://localhost:8080/transaction/{customerId}``` to view all transactions for particular customer.

3. Navigate to ```http://localhost:8080/payment/{transactionId}`` to view all payments for particular transaction.
 

Using 'curl' tool :

1. ```curl -X GET http://localhost:8080/customer/{customerId}```

2. ```curl -X GET http://localhost:8080/transaction/{customerId}```

3. ```curl -X GET http://localhost:8080/payment/{transactionId}```

