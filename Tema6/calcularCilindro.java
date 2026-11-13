import java.util.Scanner;
public class calcularCilindro {
    public static void main(String[] args) {
        double radio = 0;
        double altura = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio del cilindro: ");
        radio = sc.nextDouble();
        System.out.print("Introduzca la altura del cilindro: ");
        altura = sc.nextDouble();
        System.out.println("El volumen de del cono es " + calcular(radio, altura));
        sc.close();
    }
    public static double calcular(double radio, double altura) {
        double volumen = Math.PI * Math.pow(radio, 2.0) * altura;
        return volumen;
    }
}