import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int hora = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el la hora: ");
        hora = sc.nextInt();
        if (hora == 6 || hora == 7 || hora == 8 || hora == 9 || hora == 10 || hora == 11 || hora == 12) {
            System.out.println("Buenos días");
        } else if (hora == 13 || hora == 14 || hora == 15 || hora == 16 || hora == 17 || hora == 18 || hora == 19 || hora == 20) {
            System.out.println("Buenas tardes");
        } else if (hora == 21 || hora == 22 || hora == 23 || hora == 0 || hora == 1 || hora == 2 || hora == 3 || hora == 4 || hora == 5) {
            System.out.println("Buenas noches");
        } else if (hora == 24) {
            System.out.println("La proxima vez introduzca 0 en vez de 24");
        } else if (hora < 0 || hora > 24) {
            System.out.println("La proxima vez introduzca un numero de hora correcto");
        }
        sc.close();
    }
}