import java.util.Scanner;
public class añoBisiesto {
    public static void main(String[] args) {
        int año = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un año: ");
        año = sc.nextInt();
        if ((año % 400) == 0) {
            System.out.println("El año " + año + " si es un año bisiesto");
        } else if ((año % 100) == 0) {
            System.out.println("El año " + año + " no es un año bisiesto");
        } else if ((año % 4) == 0) {
            System.out.println("El año " + año + " si es un año bisiesto");
        } else {
            System.out.println("El año " + año + " no es un año bisiesto");
        }
        sc.close();
    }
}