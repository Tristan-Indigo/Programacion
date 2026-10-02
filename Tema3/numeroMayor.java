import java.util.Scanner;
public class numeroMayor {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primero numero: ");
        numero1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else {
            System.out.println(numero2 + " es mayor que " + numero1);
        }
        sc.close();
    }
}