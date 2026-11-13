import java.util.Scanner;
public class numeroMaximo {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer numero entero: ");
        numero1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero entero: ");
        numero2 = sc.nextInt();
        System.out.println("El numero maximo entre " + numero1 + " y " + numero2 + " es " + max(numero1, numero2));
        sc.close();
    }
    public static int max(int numero1, int numero2) {
        int result = Math.max(numero1, numero2);
        return result;
    }
}