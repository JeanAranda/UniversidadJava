
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class HolaMundo {

    public static void main(String args[]) {
        /*System.out.println("Hola mundo desde Java en Netbeans");
        int miVariableEntera = 10;
        System.out.println("El valor de mi variable es: "+miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println("El valor de la variable modificada es: "+miVariableEntera);
        //Variable en cadena
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        //Modificamos la variable
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        //var -- Inferencia de tipos en JAVA
        var miVariableEntera2 = 15;
        System.out.println("El valor de la variable 2 es: "+miVariableEntera2);
        var miVariableCadena2 = "Hola con var";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //Variables que concatenan y suman
        var titulo = "Ingeniero";
        var usuario = "Jean";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        //Suma de variables 
        var num1 = 5;
        var num2 = 8;
        var resultado = num1 + num2;
        System.out.println("resultado = " + resultado);
        //Si la variable al momento de imprimir se junta primero con una variable de tipo cadena las demas haran lo mismo
        //por lo que solo concatenara y no sumara
        System.out.println("ejemplo de concatenacion: "+usuario+" "+num1+num2);
        //Para que la variable se pueda sumar hay que encerrarla en parentesis 
        //por lo que tomara prioridad por lo que se encuentra entre parentesis
        System.out.println("ejemplo de solución: "+usuario+" " + (num1 +num2));
        //Vamos aplicar el salto de linea
        var nombre = "Juan";
        System.out.println("El nombre del responsable es:\n*"+nombre);
        //ejemplo usando el tabulador
        System.out.println("Usando tabulador:\t"+nombre);
        //utilizando la clase Scanner
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var teclado = consola.nextLine();
        System.out.println("El nombre ingresado es: "+teclado);
        System.out.println("Escribe el titulo: ");
        var titulo2 = consola.nextLine();
        System.out.println("El resultado es: "+titulo+" "+teclado);*/
 /*
        Tipos primitivos enteros: byte, short, int, long
         */
        //byte numeroByte = (byte)128; de esta forma se convierte el entero a byte pero pierde precision
        /*byte numeroByte = 127;
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        //En el caso de long es diferente por ser un caso especial
        //long numeroLong = (long)9223372036854775807L; --> tambien se puede agregar D de double o F de flotante
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        /*
        Tipos primitivos de tipo flotante: float y double
         */
        //float numeroFloat = (float)3.4028236E38D; //--> Al aumentar un valor este pierde precision y da l valor de Infinity
        /*float numeroFloat = 3.4028235E38F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        //El tipo double es el tipo mas grande en JAVA
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo doible: "+Double.MIN_VALUE);
        System.out.println("Valor maximo double: "+Double.MAX_VALUE);*/
 /*
        Inferencia de tipos con var y tipos primitvos
        en modo debug
         */
 /*var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);*/
 /*
        Tipos primitivos tipo char
         */
 /*char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        //Con caracteres unicode
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        char varCharDecimal = 35;
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        //Ahora con var
        var miCaracter1 = 'a';
        System.out.println("miCaracter = " + miCaracter1);
        //Con caracteres unicode
        var varChar2 = '\u0021';
        System.out.println("varChar = " + varChar2);
        var varCharDecimal3 = 35;
        System.out.println("varCharDecimal = " + varCharDecimal3);
        var varCharSimbolo4 = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo4);
        int variableEnteroSimbolo = '!';
        System.out.println("variableEnteroSimbolo = " + variableEnteroSimbolo);
        int letra = 'a';
        System.out.println("letra = " + letra);*/
 /*
        Tipos primitivos tipo boolean
         */
 /*boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        if (varBoolean) {
            System.out.println("La bandera del Perú esta en verde");
            
        }else {
            System.out.println("La bandera esta en rojo");
        }
        var edad = 30;
        //var esAdulto = edad >= 18;
        if (edad >= 18) {
            System.out.println("Eres mayorcito");
        }else{
            System.out.println("Eres chivolo");*/

 /*
        Conversion de tipos primitivos en java
         */
        //Convertir un tipo String a un tipo int
        /*var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
//        //Pedir un vaor con la clase Scanner
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona un valor por favor:");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
          
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var caracter = "Hola".charAt(3);
        System.out.println("caracter = " + caracter);
        System.out.println("Proporciona un carcater: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
         */
 /*
        Operadores aritmeticos
         */
 /*
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);
        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);
        resultado = a * b;
        System.out.println("resultado de la multiplicacion = " + resultado);
        var resultado2 = 3D/b;
        System.out.println("resultado de la division = " + resultado2);
        resultado = a % b;
        System.out.println("resultado del residuo  = " + resultado);
        
        if (a % 2 == 0)
            System.out.println("El valor de la variable es par");
        else
            System.out.println("El valor de la variable es impar");
         */
 /*
        Operadores de asignacion en JAVA
         */
 /*int a=3, b=2;
        int c=a+5-b;
        System.out.println("c = " + c);
        a+=1;
        System.out.println("a = " + a);
        a+=3;
        System.out.println("a = " + a);
        a-=2;
        System.out.println("a = " + a);
        a*=9;
        System.out.println("a = " + a);
        a/=3;
        System.out.println("a = " + a);
        a%=3;
        System.out.println("a = " + a);
         */
 /*
        Operaadores unarios
         */
 /*
        var a=3;
        var b=-a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //Con variables booleanas
        var c = true;
        var d = !c; //variable invertida
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        //incremento
        //1.Preincremento (Elsimbolo antes de la avariable)
        var e=3;
        var f=++e;//El valor de la variable "e" se aumenta en 1 antes de ser ejecutada
        //Por eso su valor al imprimir cambia
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.Postincremento (simbolo despues de la vcariable)
        var g=5;
        System.out.println("g normal = " + g);//En esta linea la variable continua con su valor normal
        var h=g++;//primero se utiliza el valor y despues se incrementa 
        System.out.println("g postincrementado = " + g);//En esta linea se ejecuta el postincremento
        System.out.println("h = " + h);
        //Decremento
        var i=2;
        System.out.println("i no decrementada = " + i);
        var j=--i;
        System.out.println("i decrementada = " + i);//YA se decremento
        System.out.println("j = " + j);
        //Postdecremento
        var K=4;
        var L=K--;//Primero se usa el valor de la variable y queda pendiente el decremento
        System.out.println("k = " + K);//Variable postdecrementada
        System.out.println("L = " + L);        
         */
 /*
        Operadores de igualdad y Relaciones en JAVA
         */
 /*var a=3;
        var b=2;
        
        var c = (a == b);//Operador de igualdad que valida si son iguales o no (true o false)
        System.out.println("c = " + c);
        
        var d = a!=b;//"a" es diferente de "b", tambien se puede colocar sin parentesis
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2;//Compara referencia de objetos
        System.out.println("e = " + e);
        
        var f=cadena.equals(cadena2);//El metodo equals nos va ayudar a verificar si las cadenas son iguales en contenido
        System.out.println("f = " + f);
        //Operadores Relacionales
        var g = (a>=b);
        System.out.println("g = " + g);
        var edad=30;
        var adulto=18;
        if (edad >= adulto)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es tilin");
         */
        //Operadores condicionales
        /*var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= valorMinimo && a <= valorMaximo;
        if (resultado)
            System.out.println("Dentro del rango");
        else
            System.out.println("Fuera de rango");
        //Operador OR ||
        var vacaciones = true;
        var diaDeDescanso = false;
        if (vacaciones || diaDeDescanso)
            System.out.println("El padre puede asistir al juego del hijo");
        else
            System.out.println("El padre esta ocupado");
         */
        //Operador ternario en JAVA
        /*var a = 10;
        var b = 15;
        var resultado = (a >= b) ? "El valor de a es mayor" : "El valor de a es menor";
        System.out.println("resultado = " + resultado);
        
        var numero = 7;
        resultado = (numero % 2 == 0) ? "El numero es par" : "El numero es imopar";
        System.out.println("numero = " + resultado);
         */
        //Precedencia de operadores en JAVA
        /*var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4+5*6/3;
        System.out.println("resultado = " + resultado);
        resultado = (4+5)*6/3;
        System.out.println("resultado = " + resultado);
         */
        //Tarea de Rectangulo
        //Scanner consola = new Scanner(System.in);
//        System.out.println("Escribe el nombre del ancho: ");
//        var ancho = Integer.parseInt(consola.nextLine());
//        System.out.println("Escribe el nombre del alto: ");
//        var alto = Integer.parseInt(consola.nextLine());
//        System.out.println("El area del rectangulo es: " + alto * ancho);
//        System.out.println("El perimetro del rectangulo es: " + (alto + ancho) * 2);
        //Tarea Imprimir el numero mayor
        /*System.out.println("Proporciona el primer numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el segundo numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        if (numero1 > numero2){
            System.out.println("El numero mayor es: "+numero1);
        }else{
            System.out.println("El numero mayor es: "+numero2);
        }
         */
        //Sentencia de control if else
        /*var condicion = false;
        if (condicion) //Es lo mismo que colocar (condicion == true)
        {
            System.out.println("La condición es verdadera");
        } else {
            System.out.println("La condición es falsa");
        }
        //otro ejemplo de if else
        var numero = 4;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            System.out.println("Numero uno");
        } else if (numero == 2) {
            System.out.println("Numero dos");
        } else if (numero == 3) {
            System.out.println("Numero tres");
        } else if (numero == 4) {
            System.out.println("Numero cuatro");
        } else {
            numeroTexto = "Numero no encontrado";
        }
        //Estaciones del año con if else
        var mes = 6;
        var estacion = "Estación desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        }else if(mes==6 || mes==7 || mes==8){
            estacion = "Verano";
        }else if(mes==9 || mes==10 || mes==11){
            estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
         */
        //Control switch en JAVA
        /*var numero = 2;
        var numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto="Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
         */
        //Estaciones del año con switch
        /*var mes = 11;
        var estacion = "Estacion desconocida";
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";                
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
        }
        System.out.println("estacion = " + estacion);
         */
//        El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
//El usuario proporcionará un valor entre 0 y 10.
//Si está entre 9 y 10: imprimir una A
//Si está entre 8 y menor a 9: imprimir una B
//Si está entre 7 y menor a 8: imprimir una C
//Si está entre 6 y menor a 7: imprimir una D
//Si está entre 0 y menor a 6: imprimir una F
//cualquier otro valor debe imprimir: Valor desconocido
//Por ejemplo:
//1.Proporciona un valor entre 0 y 10:
//2.A
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10");

        int nota = Integer.parseInt(consola.nextLine());

        if (nota >= 0 && nota < 6) {
            System.out.println("F");
        } else if (nota == 6 || nota < 7) {
            System.out.println("D");
        } else if (nota == 7 || nota < 8) {
            System.out.println("C");
        } else if (nota == 8 || nota < 9) {
            System.out.println("B");
        } else if (nota == 9 || nota <= 10) {
            System.out.println("A");
        } else {
            System.out.println("Valor desconocido");
        }

    }
}
