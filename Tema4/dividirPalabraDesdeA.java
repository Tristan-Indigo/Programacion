import java.util.Scanner;
public class dividirPalabraDesdeA {
    public static void main(String[] args) {
        //Programa que divida una palabra desde la primera A que encuentre.
        String cadena = "";
        int dividir = 0;
        String primeraParte = "";
        String siguienteParte = "";
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        cadena = sc.next();
        /*
        primeraParte = cadena.substring(0,dividir);
        siguienteParte = cadena.substring(dividir, dividir);
        resultado = primeraParte + "<>" + siguienteParte;
        System.out.println("La cadena resultante es: " + resultado);
        */
        sc.close();
    }
}