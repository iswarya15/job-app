## Job Application – Spring Boot + JSP

A simple Spring Boot web application built using Spring MVC and JSP, following a layered architecture (Controller–Service–Repository).
This project demonstrates form handling, data flow across layers, and dynamic JSP rendering using an embedded Tomcat server.

**Tech Stack** : Java, Spring Boot, Spring MVC, JSP, Embedded Tomcat, Maven

### How Data Flows

* User submits job details via JSP form

* Controller receives form data as JobPost

* Service layer processes the request

* Repository stores job data (hardcoded list)

* Controller sends data to JSP using Model

* JSP renders dynamic content
  Annotations Used

### Annotations used in Model Class

* @Data - Generates getters, setters, toString(), equals(), and hashCode() automatically.

* @NoArgsConstructor - Generates a no-argument constructor.

* @AllArgsConstructor - Generates a constructor with all fields.