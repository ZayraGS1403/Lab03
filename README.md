# LABORATORIO 3 - TDD

#### TALLER 3

### Integrantes

Andres Serrato
Zayra Gutierrez

### CREAR PROYECTO CON MAVEN

![alt text](images/image.png)
![alt text](images/image-1.png)

### AGREGAR DEPENDENCIA JUNIT5

El proeycto compila bien.
![alt text](images/image-2.png)


### AGREGAR ESQUELETO DEL PROYECTO

Carpetas agregadas correctamente
![alt text](images/image-6.png)

### AGREGAR CLASES

Compila correctamente
![alt text](images/image-7.png)



### COBERTURA

Se le asigna el codigo del pom.xml para Jacoco
![alt text](images/image-8.png)

La carpeta fue creada con éxito
![alt text](images/image-9.png)

### SONARQUBE

Ejecutamos los comando para la creación de la imagen en docker 

![alt text](images/image-4%20copy.png)

Creamos el token

![alt text](images/image-3%20copy.png)

Se añade sonar al archivo pom.xml del proyecto

![alt text](images/image%20copy.png)

Se añaden las propiedades de sonarqube y Jacoco

![alt text](images/image-1%20copy.png)

#### Se compila de nuevo Jacoco

![alt text](images/image-2%20copy.png)

#### Generamos la integración de sonarqube

![alt text](images/image-5%20copy.png)



### PRUEBAS UNITARIAS Y TDD

Temos el jacoco para saber el nivel de testeo del código
![alt text](images/image-10.png)

#### Test antes de la implementación de la clase addBook
![alt text](images/image-1.png)

#### Test despues de implementar la clase addBook

![alt text](images/image.png)


#### Test antes de la implementación de la clase loan

![alt text](images/image-2.png)


#### Test despues de la implementación de la clase loan

![alt text](images/image-11.png)


### Reporte Test

Despues de crear los test de las clases realizamos un reporte en Jacoco para ver el estado del código

![alt text](images/jacoco.png)