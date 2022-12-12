# CRUD basico

Spring Boot CRUD implementa operaciones CRUD simples con una entidad `Producto`.

## Tecnologías utilizadas

- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- Thymleaf

## Configuración de base de datos

Cree una base de datos MySQL con el nombre `springbootdb` y agregue las credenciales a `/resources/application.properties`.
Los predeterminados son:

```
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## Ejecutar la aplicación
Ejecute el proyecto a través del IDE y diríjase a [http://localhost:8080](http://localhost:8080)
o ejecute este comando en la línea de comandos:
```
mvn spring-boot:run
```
