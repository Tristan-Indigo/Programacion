import java.util.Scanner;
public class convertirNota {
    public static void main(String[] args) {
        double nota = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una nota: ");
        nota = sc.nextDouble();
        if (nota < 0.0 || nota > 10.0) {
            System.out.println("Nota inválida");
        } else if (nota >= 9.0) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7.0) {
            System.out.println("Notable");
        } else if (nota >= 6.0) {
            System.out.println("Bien");
        } else if (nota >= 5.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
        sc.close();
    }
}