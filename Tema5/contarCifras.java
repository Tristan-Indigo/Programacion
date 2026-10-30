import java.util.Scanner;
public class contarCifras {
    public static void main(String[] args) {
        int numero = 0;
        int cifras = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero positivo: ");
        numero = sc.nextInt();
        if (numero <= 0) {
            System.out.println("No puedes introducir un numero menor a 1");
        }
        while (numero > 0) {
            numero = numero / 10;
            cifras++;
        }
        if (cifras > 0) {
            System.out.println("El numero tiene " + cifras + " cifras.");
        }
        sc.close();
    }
}