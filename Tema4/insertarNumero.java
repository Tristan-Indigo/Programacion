import java.util.Scanner;
public class insertarNumero {
    public static void main(String[] args) {
        String numero = "";
        int posicion = 0;
        int introducir = 0;
        String primeraParte = "";
        String segundaParte = "";
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero (minimo 1 digito): ");
        numero = sc.next();
        Double.parseDouble(numero);
        System.out.print("Introduzca la posicion donde se va a insertar el numero (minimo 1): ");
        posicion = sc.nextInt();
        if (posicion > (numero.length() + 1)) {
            System.out.println("No puedes introducir una posicion mayor que la ultima posicion del numero");
        } else if (posicion < 1) {
            System.out.println("No puedes introducir una posicion menor que 1");
        } else {
            System.out.print("Introduzca un digito que quieras poner en la posicion " + posicion + ": ");
            introducir = sc.nextInt();
            if (introducir >= 10) {
                System.out.println("No puedes introducir mas de 1 digito");
            } else {
                posicion = posicion - 1;
                primeraParte = numero.substring(0,posicion);
                segundaParte = numero.substring(posicion);
                resultado = primeraParte + introducir + segundaParte;
                System.out.println("El numero resultante es: " + resultado);
            }
        }
        sc.close();
    }
}