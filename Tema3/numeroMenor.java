import java.util.Scanner;
public class numeroMenor {
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
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println(numero1 + " es el numero menor");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println(numero2 + " es el numero menor");
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println(numero3 +" es el numero menor");
        } else {
            System.out.println("Por favor, la proxima vez no introduzca numeros repetidos");
        }
        sc.close();
    }
}