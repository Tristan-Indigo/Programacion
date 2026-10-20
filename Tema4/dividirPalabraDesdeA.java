import java.util.Scanner;
public class dividirPalabraDesdeA {
    public static void main(String[] args) {
        String cadena = "";
        String primeraParte = "";
        String siguienteParte = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        cadena = sc.next();
        if (cadena.indexOf("a") <= 0 && cadena.indexOf("A") <= 0) {
            System.out.println("La cadena resultante es: " + cadena);
        } else if (cadena.indexOf("a") >= 0 && cadena.indexOf("A") > cadena.indexOf("a")) {
            primeraParte = cadena.substring(0,cadena.indexOf("a"));
            siguienteParte = cadena.substring(cadena.indexOf("a"));
            System.out.println("La cadena resultante es: " + primeraParte + " " + siguienteParte);
        } else if (cadena.indexOf("A") >= 0 && cadena.indexOf("a") > cadena.indexOf("A")) {
            primeraParte = cadena.substring(0,cadena.indexOf("A"));
            siguienteParte = cadena.substring(cadena.indexOf("A"));
            System.out.println("La cadena resultante es: " + primeraParte + " " + siguienteParte);
        } else if (cadena.indexOf("a") >= 0) {
            primeraParte = cadena.substring(0,cadena.indexOf("a"));
            siguienteParte = cadena.substring(cadena.indexOf("a"));
            System.out.println("La cadena resultante es: " + primeraParte + " " + siguienteParte);
        } else {
            primeraParte = cadena.substring(0,cadena.indexOf("A"));
            siguienteParte = cadena.substring(cadena.indexOf("A"));
            System.out.println("La cadena resultante es: " + primeraParte + " " + siguienteParte);
        }
        sc.close();
    }
}