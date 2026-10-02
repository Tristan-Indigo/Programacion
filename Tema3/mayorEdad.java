import java.util.Scanner;
public class mayorEdad {
    public static void main(String[] args) {
        //1.- Realiza un programa que indique si el usuario es mayor de edad o no. (El usuario debe indicar su edad).
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