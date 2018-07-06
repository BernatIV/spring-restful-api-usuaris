# spring-restful-api-usuaris
This Repository is my first serious attempt to create a restful API. 
Users can sign up and log in into the application, as well as perform CRUD operations to the customers entity when successfuly logged in, using a token to authenticate themselves. 

## Getting Started
Per fer un registre, loguejar-te, o fer operacions amb un token segueix aquestes instruccions amb Curl o executa les mateixes amb Postman: 
1. Registrar-te com a usuari:
curl -H "Content-Type: application/json" -X POST -d '{
    "username": "useradmin",
    "password": "password"
}' http://localhost:8080/users/sign-up
2. Loguejar-te amb l'usuari:
curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/login
3. Amb el token que hem rebut al loguejar-nos, consultar tots els clients que tenim:
curl -H "Content-Type: application/json"
H "Authorization: Bearer xxx.yyy.zzz"
X GET http://localhost:8080/customers
4. També es pot recuperar un sol client, borrar, afegir i actualitzar similarment al punt anterior.

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

FONT: https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/

### Creació
He baixat un projecte Maven de start.spring.io amb les dependències WEB, JPA, H2. 



_Per escriure aquest Readme he seguit l'estandard de Git._

_https://gist.github.com/PurpleBooth/109311bb0361f32d87a2#installing_
