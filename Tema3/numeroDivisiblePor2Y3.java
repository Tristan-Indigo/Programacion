import java.util.Scanner;
public class numeroDivisiblePor2Y3 {
    public static void main(String[] args) {
        int numero1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        numero1 = sc.nextInt();
        if ((numero1 % 2) == 0 && (numero1 % 3) != 0) {
            System.out.println("El número es divisible por 2");
        } else if ((numero1 % 3) == 0 && (numero1 % 2) != 0) {
            System.out.println("El número es divisible por 3");
        } else if ((numero1 % 2) == 0 && (numero1 % 3) == 0) {
            System.out.println("El número es divisible por 2 y por 3");
        } else {
            System.out.println("El número no es divisible por 2 ni por 3");
        }
        sc.close();
    }
}