
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
    public static void main(String args[]){
        System.out.println("Hola mundo desde Java en Netbeans");
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
        System.out.println("El resultado es: "+titulo+" "+teclado);
    }
}
