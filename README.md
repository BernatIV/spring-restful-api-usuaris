# spring-restful-api-usuaris
This Repository is my first serious attempt to create a restful API. 
Users can sign up and log in into the application, as well as perform CRUD operations to the customers entity when successfuly logged in. 

Passos seguits per crear la Restful API amb Spring Boot: 
1. He baixat un projecte Maven de start.spring.io amb les dependències WEB, JPA, H2. També es podria crear des de zero i fer servir Gradle. 
2. Amb IntelliJ IDEA modificar application.properties, i crear import.sql que contindrà els registres de cada entitat quan inicies l'applicació. 
...

Fer funcionar l'app amb Curl: (amb postman és el mateix però a nivell gràfic). 
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
curl -H "Content-Type: application/json" \
-H "Authorization: Bearer xxx.yyy.zzz" \
-X POST -d '{
    "description": "Buy watermelon"
}'  http://localhost:8080/tasks
4. També es pot recuperar un sol client, borrar, afegir i actualitzar similarment al punt anterior. 


Fonts: 
https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
