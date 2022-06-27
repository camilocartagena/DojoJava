## DOJO JAVA -  Todo lo que debes saber

## Fundamentos JAVA SE (Estándar Edition)
- Variables
- Tipos de datos primitivos y referencia
- Operadores (lógicos)
- Flujos de control (bucles)
- Clase String
- Clases Wrapper ( Envuelven los tipo primitvos)
- System
- Math
- Random
- Date y Calendar
- Arreglos y Matrices
- Clases y objetos
- Principios POO( Herancia, modularidad )
- 
## Avanzados JAVA SE (Estándar Edition)
- Api de colecciones (Collection, List,Set y Map)
- Manejo de excepciones
- Manejo de archivos (File)
- Tipos genéricos (Generics)
- Api Stream (para trabajar con programación funcional)
- Expresiones Lambda y clouse
- Opcional
- Multi-Hilos (Thread)
- Base de datos (JDBC) Mysql - Postgres
- Hibernate/JPA  ( mapear nuestras entidades a BD)
- Data Access Object (DAO)
- GUI Swing
- RXJava Reactive Stream (Programación reactiva que no bloquea los hilos)
     Fundamentos JAVA EE (Enterprices Edition)
- Modelo Vista Controlador (MVC)
- Servidor Jboss Wildfly
- API Servlet/JSP – la base de cualquier framework
- Java Server Faces JSF 2 – para desarrollo de apliaciones web
- Weld CDI ( Para despliegue de soluciones )
- EJB 3
- API REST
- SOAP
- JAAS Autenticación y Autorización
- Sprint 5
- Struct 2

## Instalación de JDK (Kit de desarrollo – antes del 1.8  se necesitaba  JRE Runtime)
- https://www.oracle.com/java/
- http://jdk.java.net/

## Crear un nuevo proyecto en IntelliJ IDEA
https://www.jetbrains.com/help/idea/new-project-wizard.html
## Crear Hola mundo en IntelliJ
https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html

## VARIABLES JAVA
Es fuertemente tipado, representa la logica del negocio (dato) se maneja por dos parte:
TipoDato nombreVariables.
En Java 10 maneja una variable dinamica var.
Determina que tipo de valor debe guardarse en la vble.
Existen dos categorias de datos principales

## Primitivo: contienen un solo valor. Entero,flotante,los caracteres, booleanos
Referencia: una estructura mas compleja que tiene funciones definidas.
Java es un 99% orientado a objetos ya que los valores primitivos son valores
Reglas para definir para una varianble:
-	Debe iniciar en minuscula
-	No puede tener caracteres especiales (unicore)
-	No puede ser una plabra reservada del lenguaje o clave
-	No puede utilizar el nombre de una variable que ya existe en el mismo metodo
-	Palabras compueras la segunda debe iniciar en mayuscula nombreDato
-	No puede iniciar en numero.
- Para variables en español se debe agregar en las preferencias el idioma.

## TIPOS PRIMITIVOS
Solo contienen un valor, de tipo de dato escalares. Todos se deben escribir en minuscula.
Primitivos Enteros: son 4 tipos byte,short,int y long. Son enteros del conjunto Z difiere en las precisiones y pyede ser positivo o negativo.
Primitivos  Flotante: para guardar numeros reales en forma flotante con precision realFloat(f) y realDoble(d).

-	Primitivos Carácter: usa el codigo UNICODE y ocupa cada carácter 16 bits

-	Primitivos  Boleano: un solo bit true/false

## SISTEMAS NUMERICOS
Contiene los binarios, octales y hexadecimales
Para dar dinamismo a la entrada de datos utilizamos JoptionPane.showInputDialog y para mostrar JoptionPane.showMessageDIalog o con Scanner

## STRING.

Son objetos java, de tipo de referencia. String no es primitivo. Se puede representar con new String pero la forma mas comoda es con comilla doble (“”). Ambas son objetos.
-	Podemos incluir escape(\)  
-	Los caracteres de un String se codifican usando Unicode
-	Son inmutables, cualquier cambio siempre retorna una nueva instancia. No se cambia el valor inicial.
-	Para concatenar se utiliza (+)
-	Para comparar no se puede utilizar == por que no es primitivo, se debe utilizar equials
-	Se debe tener en cuenta en las funciones cuando recibe una secuencia ("") o un caracter o string ('')
-	Debe cuidarse el manejo de las expresiones regulares en el manejo de metodos de los String 

[Para conocer mas detalle de las expresiones regulares en JAVA](http://www.w3big.com/es/java/java-regular-expressions.html))

