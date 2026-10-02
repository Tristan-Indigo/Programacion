import java.util.Scanner;
public class mayorEdad {
    public static void main(String[] args) {
        int edad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca tu edad: ");
        edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        sc.close();
    }
}