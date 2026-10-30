import java.util.Scanner;
public class rectanguloAsteriscos {
    public static void main(String[] args) {
        int filas = 0;
        int columnas = 0;
        int contarFilas = 0;
        int contarColumnas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de filas: ");
        filas = sc.nextInt();
        System.out.print("Introduzca el numero de columnas: ");
        columnas = sc.nextInt();
        while (contarFilas < filas) {
            while (contarColumnas < columnas) {
                System.out.print("*");
                contarColumnas++;
            }
            if (contarFilas < filas) {
                contarColumnas = 0;
            }
            System.out.println();
            contarFilas++;
        }
        sc.close();
    }   
}