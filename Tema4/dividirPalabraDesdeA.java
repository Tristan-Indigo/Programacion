import java.util.Scanner;
public class dividirPalabraDesdeA {
    public static void main(String[] args) {
        String cadena = "";
        String primeraParte = "";
        String siguienteParte = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        cadena = sc.next();
        if (cadena.indexOf("a") <= 0) {
            System.out.println("La cadena resultante es: " + cadena);
        } else {
            primeraParte = cadena.substring(0,cadena.indexOf("a"));
            siguienteParte = cadena.substring(cadena.indexOf("a"));
            System.out.println("La cadena resultante es: " + primeraParte + " " + siguienteParte);
        }
        sc.close();
    }
}