import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        double kb = 0.0;
        double mb = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de Megabytes: ");
        mb = sc.nextDouble();
        kb = mb * 1024;
        System.out.println(mb + " Megabytes son " + kb + " Kilobytes");
        sc.close();
    }
}