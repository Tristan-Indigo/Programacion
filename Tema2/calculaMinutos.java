//CalculaMinutos
import java.util.Scanner;

public class calculaMinutos {
	public static void main(String[] args) {
		int segundos;
		int minutos;
		int segundosRestantes;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculamos el nº de minutos y segundos, dada una cantidad de segundos");
		System.out.println("======================================================================");
		System.out.print("Introduzca una cantidad de segundos ");
		segundos = sc.nextInt();
		minutos = segundos / 60;
		segundosRestantes = segundos % 60;
		System.out.println("El nº de minutos es "+minutos+" y el numero de segundos restantes es "+segundosRestantes);
	}
}