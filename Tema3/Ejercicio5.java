import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double nota1 = 0.0;
        double nota2 = 0.0;
        double media = 0.0;
        String recuperacion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota de tu primer control: ");
        nota1 = sc.nextDouble();
        System.out.print("Introduzca la nota de tu segundo control: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("Estas aprobado con un " + media);
        } else if (media < 5) {
            System.out.print("Introduzca la nota de el resultado de la recuperación (apto o no apto): ");
            recuperacion = sc.next();
            if (recuperacion.equalsIgnoreCase ("apto")) {
                System.out.println("La nota del trimestre es 5");
            } else {
                //en clase no se hizo la comprobacion de poner algo que no es "apto" o "no apto"
                System.out.println("La nota del trimestre es " + media);
            }
        }
        sc.close();
    }
}