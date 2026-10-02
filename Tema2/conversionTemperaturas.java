import java.util.Scanner;
public class conversionTemperaturas {
    public static void main(String[] args) {
		double celsius = 0.0;
		double fahrenheit = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Convertimos grados fahrenheit a celsius");
		System.out.println("=============================================");
		System.out.print("Introduzca una cantidad de grados fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius = (5.0/9)*(fahrenheit - 32);
        System.out.println(fahrenheit+" grados fahrenheit son "+celsius+" grados celsius");
        celsius = 0.0;
		fahrenheit = 0.0;
		System.out.println("Convertimos grados celsius a fahrenheit");
		System.out.println("=============================================");
		System.out.print("Introduzca una cantidad de grados celsius: ");
        celsius = sc.nextDouble();
        fahrenheit =(celsius * 9/5) + 32;
        System.out.println(celsius+" grados celsius son "+fahrenheit+" grados fahrenheit");
		sc.close();
    }
}