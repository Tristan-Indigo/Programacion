import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
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