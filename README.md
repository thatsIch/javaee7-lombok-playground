# JavaEE 7 Lombok Playground

This is a playground to test the integration level of IDEs, JavaEE 7 and Lombok.
Using JPA in JavaEE 7 and using smart build tools can sometimes be limiting
due to the limitation in the JPA specification.
For example a at least package private constructor is required for the JPA entity.
Lombok on the other hand has support of special constructors via
`@RequiredArgsConstructor` which creates a constructor with all required fields.
But since JPA requires also a package private no args constructor we need
to initialize the fields in the no args constructor, which lombok does not allow,
if you mark a field as `final`.

Check the `City.java` ([link](src/main/java/de/thatsich/jlp/entity/City.java)) for the final implementation.

## Requirement

* JDK 7+ installed (build against JDK 8+)
* optionally JavaEE 7 compliant application server for development (demo runs on docker)
* git installed
* optionally docker installed (if you want to easily deploy the application

## Installation

1. run `git clone https://github.com/thatsIch/javaee7-lombok-playground.git`
2. run `mvnw clean install`
3. run `docker build -t thatsich/javaee7-lombok-playground`
4. run `docker run -it -p 8080:8080 --name dude thatsich/javaee7-lombok-playground`
5. open browser at [http://localhost:8080/javaee7-lombok-playground/resources/cities](http://localhost:8080/javaee7-lombok-playground/resources/cities)
