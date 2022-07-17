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

- Primitivos
- Referencia

## Primitivo: contienen un solo valor. Entero,flotante,los caracteres, booleanos
Referencia: una estructura mas compleja que tiene funciones definidas.
Java es un 99% orientado a objetos ya que los valores primitivos son valores
Reglas para definir para una variable:
-	Debe iniciar en minuscula
-	No puede tener caracteres especiales (unicore)
-	No puede ser una plabra reservada del lenguaje o clave
-	No puede utilizar el nombre de una variable que ya existe en el mismo metodo
-	Palabras compueras la segunda debe iniciar en mayuscula nombreDato
-	No puede iniciar en numero.
-  Para variables en español se debe agregar en las preferencias el idioma.

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

[Para conocer mas detalle de las expresiones regulares en JAVA](http://www.w3big.com/es/java/java-regular-expressions.html)

# OPERADORES JAVA

JAVA proporciona muchos tipos de operadores que se pueden usar segun la necesidad. Se clasifican segun la funcionalidad que brindan

## ARITMETICOS
Para realizar operaciones matematicas con tipos de datos primitivos
- Multiplicacion
- Division
- Modulo o resto
- Suma
- Resta
- Incremento
- Decremento
- Menos unitario

## COMBINADOS
Operadores combinados o compuestos: -=. +=, /=. Una version simplificad o mas corta.

a+= 5 es equivalente a a=a+5
a/=b es equivalente a a=a/b

## INCREMENTO Y DECREMENTO (INCREMENTALES))
Utilizado para incrementar o decrementar el valor en 1. Hay dos variedaddes de operador de incremento pre y post

++a pre-incremento (incrementa a en uno y luego devuelve a)
a++ post-incremento (Devuelve a , y luego incrementa a en uno)

--a pre-decremento (decrementa a en uno y luego devuelve a)
a-- post-decremento (Devuelve a , y luego decrementa a en uno)

## TERNARIO O CONDICIONAL
- el operador ternario es una version abreviaba de la sentancia if-else
- Tiene tres operandos y de ahi el nombre ternario
  (condicion)? valor1 : valor2
- Si la condicion se cumple devielve el primer valor y en cosa contrario el segund

Ejemplo:
<code>int a = 2 > 3 ? 1 : 2;</code>

## RELACIONES
- Se utilizan para comprobar relaciones de igualdad, mayor que o menos que (<,>,<=,==,!=)
- Devuelven un resultado booleano despues de la comparacion un valor true o false
- Se utilizan ampliamente en las sentencias if/else asi como en bucles como el for o el while

## LOGICOS
- Permiten evaluar expresiones logicas y trabajan con operandos booleanos
- realizan las operaciones logicas de conjuncion (AND && ), disyuncion (OR || )  o negacion (NOT) 
- Debemos tener en cuenta Xor (verdadero cuando A y B son diferentes)

>Nota: Precedencia de operadores= tiene importnacia el tipo de operacion y la asociatividad (de izquierda a derecha)

## ASIGNACION
cada vez que asigna un valor a una variable (=)

## UNARIOS
invertir el signo del valor entero o multiplicar por -1 (-) (+)

## INSTANCEOF (TIPO DE)
Nos permite validar si una instancia es referencia de un tipo o sub tipo
- Genericos
- Abstractos

OTROS OPERADORES SON

- COMBINADOS
- DE BITS 
- DE INSTANCIA

## FLUJO DE CONTROl o SENTENCIA DE CONTROl

## IF/ELSE
Ejecuta un bloque de codigo si alguna condicion no se cumple

## SWITH CASE
- La sentencia Swith o interrumpor se utiliza para realizar sentencias condicionalmente basadas en alguna expresion
- De acuerdo al valor de la expresion se ejecuta la sentencia case apropiada
- la expresion debe ser un primitivo o referencia

## SEPARADORES
# () Se utilizan para:
- contener condiciones
- lista de parametros
- modificar la presencia de los operadores
- realizar conversiones de tipo.

# {} Se utilizan para:
- Definir bloques de codigo
- para crear una arreglo

# {} Se utilizan para:
- Declarar una arreglo
- Definir una matriz
- referencias valores de una matriz

# ; Se utilizan para:
- separar sentencias
- encadenar sentencias de un for
- incrementar variables de control

# , Se utilizan para:
- separar identificadores consecutivos en la declaracion de variables
- separar argumentos o parametros
- 
# . Se utilizan para:
- variable de tipo referencia para llamar un metodo
- separar nombre de paquetes o subpaquetes