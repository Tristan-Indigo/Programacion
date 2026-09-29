import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        double kb = 0.0;
        double mb = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de Kilobytes: ");
        kb = sc.nextDouble();
        mb = kb / 1024;
        System.out.println(kb + " Kilobytes son " + mb + " Megabytes");
    }
}