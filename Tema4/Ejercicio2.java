import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Escribe un programa que lea un número por teclado con un mínimo de 2 dígitos y un máximo de 7.
        //Se introducirá dicho número en una cadena (String).
        //Debemos asegurarnos que el número está compuesto exclusivamente por dígitos y que la longitud esté comprendida entre 2 y 7.
        int numero = 0;
        String cadena = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero entero entre 2 digitos y 7 digitos: ");
        numero = sc.nextInt();
         if (numero < 10) {
            System.out.println("No puedes introducir un numero menor de 2 digitos");
        } else if (numero >= Math.pow(10, 7)) {
            System.out.println("No puedes introducir un mayor de 7 digitos");
        } else {
            cadena = (numero + "");
            System.out.println("El numero es: " + cadena);
        }
        sc.close();
    }
}