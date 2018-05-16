# README #

Demo de una Aplicacion Web que expone un API, el cual calcula el número de la **“Sucesión de Fibonacci”** para una posición en especifica pasada por parámetro.

### Que es la sucesión de Fibonacci? ###

En matemática, la sucesión de Fibonacci es la siguiente sucesión infinita de números naturales:

La espiral de Fibonacci: una aproximación de la espiral áurea generada dibujando arcos circulares conectando las esquinas opuestas de los cuadrados ajustados a los valores de la sucesión;1 adosando sucesivamente cuadrados de lado 0, 1, 1, 2, 3, 5, 8, 13, 21 y 34.

La sucesión comienza con los números 0 y 1,2, y a partir de estos, «cada término es la suma de los dos anteriores», es la relación de recurrencia que la define.

A los elementos de esta sucesión se les llama números de Fibonacci. Esta sucesión fue descrita en Europa por Leonardo de Pisa, matemático italiano del siglo XIII también conocido como Fibonacci. [Más Info](https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci)

### Sobre la aplicación ###

Aplicación Web desarrollado en el lenguaje Java. Implementando una arquitectura simple para el desarrollo de un API RESTFul utilizando el framework de “Spring Boot”.

La función principal de esta API es calcular el número de una posición y de la posición anterior a esta en la “Sucesión de Fibonacci”, dado un numero por parámetro el cual representa la posición que se quiere obtener.  El calculo se hizo basado en el [“Algoritmo 3: Versión iterativa”](https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci#Algref_3) utilizando una suma iterativa para obtener los valores.

Esta API consta de 4 componentes principales: 

1. La clase “Main” la cual es la responsable de levantar el servicio.
2. La Clase “Controller” que expone los “endpoints” principales del API.
3.  La Clase “Service” la cual se encarga de encapsular e implementar la lógica de negocio (realiza los cálculos).
4. La Clase “Model” esta funciona de “Data Transfer Object” la cual encapsula y representa la respuesta del API.

Esta aplicación fue creada con un proyecto maven utilizando el IDE de desarrollo de Eclipse.

### Sobre la versión ###

Es la versión inicial del desarrollo.

* Versión: 1.0

### Configuración y prueba ###

####  Clonar este repositorio #### 

Baja el codigo fuenta a tu ambiente de desarrollo local:

```
git clone https://github.com/Rart3001/FibonacciApi

```
Entra la carpeta FibonacciApi:

```
cd FibonacciApi
```

####  Compilar y ejecutar la App #### 

Compila la aplicación y descarga sus dependencias con el siguiente comando.

```
 mvn install
```

####  Iniciar el servidor #### 

```
java -jar target/fibo-0.0.1-SNAPSHOT.jar

```

####  Prueba de que la aplicación está activa ####

 
Entra a tu navegador web y coloca la siguiente dirección:

[http://localhost:8080/api/v1/fibo](http://localhost:8080/api/v1/fibo)


Si todo sale bien podrás observar en tu navegador el siguiente mensaje.

>  I am Working! ;)

####  Prueba del servicio fibo #### 

En tu navegador utiliza la siguiente dirección: 

```
http://localhost:8080/api/v1/fibo/{num}
```
Donde “{num}” lo tienes que sustituir por el número que representa la posición que deseas calcular.  Ejemplo:

[http://localhost:8080/api/v1/fibo/6](http://localhost:8080/api/v1/fibo/6)

Cuando el API realice el caluculo te retornara un json con el siguiente formato:

```
{
  "value": 8,
  "previousValue": 5,
  "timestamp": "2018-05-15T22:06:14.076+0000"
}
```

### Contribución ###

* Escritura de pruebas
* Revisión de código.

### ¿Con quién hablo? ###

* Propietario de repositorio.