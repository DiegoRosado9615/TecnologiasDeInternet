# demoSpringHibernateService
Servicio Web con persistencia de datos

El servicio esta creado con:

-Eclipse Java EE IDE for Web Developers.
Version: Oxygen.3 Release (4.7.3)
Build id: 20180308-1800

-Ubuntu 16.04

Configuracion de la conexion con la base de datos
demo/src/main/webapp/WEB-INF/application-context.xml
Adjunto se encuentra src.sql, la base de datos del servicio.
Para utilizarse con MySQL

Para mandar a llamar al servicio, se puede hacer con postman.
GET request
http://localhost:8080/demo/v1/accounts/{id}/record

Ejemplos:
http://localhost:8080/demo/v1/accounts/2/record
http://localhost:8080/demo/v1/accounts/1/record
