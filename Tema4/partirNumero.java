import java.util.Scanner;
public class partirNumero {
    public static void main(String[] args) {
        //Escribe un programa que permita partir un número introducido por teclado en dos partes.
        //Las posiciones se cuentan de izquierda a derecha empezando por el 1.
        //Suponemos que el usuario introduce correctamente los datos, es decir,
        //el número introducido tiene dos dígitos como mínimo y la posición en la que se parte el número está entre 2 y la longitud del número.
        String numero = "";
        int partir = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero: ");
        numero = sc.next();
        System.out.print("Introduzca en cual posicion vas a partirlo (minimo 0): ");
        partir = sc.nextInt();
        /*System.out.println(numero + " tiene " + numero.length() + " digitos");
        System.out.println(numero.charAt(partir));
        */sc.close();
    }
}