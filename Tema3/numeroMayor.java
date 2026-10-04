import java.util.Scanner;
public class numeroMayor {
    public static void main(String[] args) {
        double numero1 = 0.0;
        double numero2 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primero numero: ");
        numero1 = sc.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        numero2 = sc.nextDouble();
        if (numero1 > numero2) {
            System.out.println(numero1 + " es el numero mayor");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es el numero mayor");
        } else {
            System.out.println("Por favor, la proxima vez introduzca numeros diferentes");
        }
        sc.close();
    }
}