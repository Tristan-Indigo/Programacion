import java.util.Scanner;
public class numeroMaximoV2 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer numero entero: ");
        numero1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero entero: ");
        numero2 = sc.nextInt();
        System.out.print("Introduzca el tercer numero entero: ");
        numero3 = sc.nextInt();
        System.out.println("El numero maximo entre " + numero1 + ", " + numero2 + " y " + numero3 + " es " + max(numero1, numero2, numero3));
        sc.close();
    }
    public static int max(int numero1, int numero2, int numero3) {
        int result = Math.max(numero1, Math.max(numero2, numero3));
        return result;
    }
}