# spring-restful-api-usuaris
This Repository is my first serious attempt to create a restful API. 
Users can sign up and log in into the application, as well as perform CRUD operations to the customers entity when successfuly logged in, using a token to authenticate themselves. 

## Deployment
Per fer un registre, loguejar-te, o fer operacions amb un token segueix aquestes instruccions amb Curl o executa les mateixes amb Postman: 
1. Registrar-te com a usuari:
curl -H "Content-Type: application/json" -X POST -d '{
    "username": "useradmin",
    "password": "password"
}' http://localhost:8080/users/sign-up
2. Loguejar-te amb l'usuari:
curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "useradmin",
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

La funció bCryptPasswordEncoder crea la instància que UserController necessita per encriptar la contrassenya quan un usuari es registra. 

### User

#### ApplicationUser.java
Classe POJO dels usuaris que es registraran i es loguejaran a l'applicació. 

L'anotació @Entity mapeja la classe a una taula SQL. @Id diu quin atribut és el camp id de la taula i @GeneratedValue genera el seu valor automàticament.  

#### UserController.java
Controlador per registrar-se i encriptar. 

#### UserRepository.java

#### UserDetailsServiceImpl.java

### Customer
#### Customer.java

#### CustomerController.java

#### CustomerRepository.java

### Security
#### JWTAuthenticationFilter.java

#### JWTAuthorizationFilter.java

#### SecurityConstants.java
Constants que es fan servir als filtres autenticació i autorització. 

#### WebSecurity.java

### import.sql
Omple la _in-memory database_ H2 de registres d'usuaris. 

### application.properties
Conté les configuracions per a l'aplicació. 






## Build with
He baixat un projecte Maven de start.spring.io amb les dependències WEB, JPA, H2. 

## License
This project is licensed under the GNU General Public License v3.0 - see the LICENSE file for details

## Acknowledgments
- https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/

- _Per escriure aquest Readme he seguit l'estandard de Git._
_https://gist.github.com/PurpleBooth/109311bb0361f32d87a2#installing_
