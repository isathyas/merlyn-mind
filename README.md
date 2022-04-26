# merlyn-mind

## Build
From root of the project,

mvn clean install

## run
From root of the project,

java -jar target\product-mgmt-1.0.0-SNAPSHOT.jar

## Endpoints
Get all packages - GET - http://localhost:8080/packages

Get package with id - GET - http://localhost:8080/package/{id}

Create package - POST - http://localhost:8080/package

Update package - PUT - http://localhost:8080/package/

Delete package with id - DELETE - http://localhost:8080/package/{id}

