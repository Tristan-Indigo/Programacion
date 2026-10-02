import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        float eurosPorHora = 12.0F;
        float salarioSemanal = 0.0F;
        float horasTrabajadas = 0.0F;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de horas trabajadas: ");
        horasTrabajadas = sc.nextFloat();
        salarioSemanal = (eurosPorHora * horasTrabajadas);
        System.out.println("El salario semanal es de " + salarioSemanal + " euros.");
        sc.close();
    }
}