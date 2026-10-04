import java.util.Scanner;
public class menorAMayor {
    public static void main(String[] args) {
        double numero1 = 0.0;
        double numero2 = 0.0;
        double numero3 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primero numero: ");
        numero1 = sc.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        numero2 = sc.nextDouble();
        System.out.print("Introduzca el tercer numero: ");
        numero3 = sc.nextDouble();
        if (numero1 < numero2 && numero2 < numero3) {
            System.out.println(numero1 + " < " + numero2 + " < " + numero3);
        } else if (numero1 < numero3 && numero3 < numero2) {
            System.out.println(numero1 + " < " + numero3 + " < " + numero2);
        } else if (numero2 < numero1 && numero1 < numero3) {
            System.out.println(numero2 + " < " + numero1 + " < " + numero3);
        } else if (numero2 < numero3 && numero3 < numero1) {
            System.out.println(numero2 + " < " + numero3 + " < " + numero1);
        } else if (numero3 < numero1 && numero1 < numero2) {
            System.out.println(numero3 + " < " + numero1 + " < " + numero2);
        } else if (numero3 < numero2 && numero2 < numero1) {
            System.out.println(numero3 + " < " + numero2 + " < " + numero1);
        } else {
            System.out.println("Por favor, la proxima vez no introduzca numeros repetidos");
        }
        sc.close();
    }
}