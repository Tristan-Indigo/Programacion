import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        String numero = "";
        String cadena = "";
        int comprobar = 0;
        char comprobarCaracter = ' ';
        boolean comprobarDigito = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero entero entre 2 digitos y 7 digitos: ");
        numero = sc.nextLine();
        while (comprobar < numero.length()) {
            comprobarCaracter = numero.charAt(comprobar);
            if (!Character.isDigit(comprobarCaracter)) {
                comprobarDigito = false;
            }
            comprobar++;
        }
        if (comprobarDigito == false) {
            System.out.println("No puedes introducir algo que no sea un numero");
        } else if (Integer.parseInt(numero) < 10) {
            System.out.println("No puedes introducir un numero menor de 2 digitos");
        } else if (Integer.parseInt(numero) >= Math.pow(10, 7)) {
            System.out.println("No puedes introducir un mayor de 7 digitos");
        } else {
            cadena = (numero + "");
            System.out.println("El numero es: " + cadena);
        }
        sc.close();
    }
}