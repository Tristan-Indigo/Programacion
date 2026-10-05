import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
        //buenas tardes o buenas noches según la hora.
        //Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente.
        //Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
        int hora = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el la hora: ");
        hora = sc.nextInt();
        if (hora == 6) {
            System.out.println("Buenos días");
        }
    }
}
