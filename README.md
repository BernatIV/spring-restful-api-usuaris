# spring-restful-api-usuaris
This Repository is my first serious attempt to create a restful API. 
Users can sign up and log in into the application, as well as perform CRUD operations to the customers entity when successfuly logged in, using a token to authenticate themselves. 

## Getting Started
Aquesta pàgina explica molt bé com registrar un usuari, loguejar-te, 
https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/

## Què fa cada part del codi?
### SpringRestfulApiUsuarisApplication.java
Inicia l'aplicació i ha de contenir el mínim possible. 
La funció bCryptPasswordEncoder crea una instància de BCryptPasswordEncoder que UserController necessita per encriptar la contrassenya quan un usuari es registra. 



### import.sql
Omple la _in-memory database_ H2 de registres d'usuaris. 

### application.properties
Conté les configuracions per a l'aplicació. 

## Recordatori
### Llençar l'app amb Curl:


### Creació
He baixat un projecte Maven de start.spring.io amb les dependències WEB, JPA, H2. 



_Per escriure aquest Readme he seguit l'estandard de Git._

_https://gist.github.com/PurpleBooth/109311bb0361f32d87a2#installing_
