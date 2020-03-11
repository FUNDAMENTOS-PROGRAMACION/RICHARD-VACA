/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Richard
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    int numeroEntero = 5 ;
double numeroDouble = 3.14;
char letras = 'A' ;
String cadena = "hola mundo";
boolean valorBoolean = false;
boolean valorboo1 = true;
/*Solo numeros que representan las distancias de la variable dada
en el libro de materia vista
*/
public void imprimirNombre(){
System.out.println("pedro");
//System.out.println("juan \n perez");
//System.out.println("kevin\tin");
String nombre= " juan ";
System.out.println(nombre.length());
System.out.println(nombre.trim());
System.out.println(nombre.toUpperCase());
System.out.println(nombre.toLowerCase());
System.out.println(nombre.replace(nombre, " Richard "));
System.out.println(nombre.split(" "));

}
}
