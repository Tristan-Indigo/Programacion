import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        double radio = 0;
        double altura = 0;
        double volumen = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio del cono: ");
        radio = sc.nextDouble();
        System.out.print("Introduzca la altura del cono: ");
        altura = sc.nextDouble();
        volumen = (1.0/3) * Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cono es: " + volumen);
    }
}