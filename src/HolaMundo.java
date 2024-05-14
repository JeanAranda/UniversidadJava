
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
        String color;
        color = "Rojo";
        System.out.println("color = " + color);
        
    }
}
