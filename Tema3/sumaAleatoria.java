import java.util.Scanner;
public class sumaAleatoria {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);
        int resultado= random1 + random2;
        int adivinacion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué es " + random1 + " + " + random2 + "?");
        System.out.print("Introduzca el resultado: ");
        adivinacion = sc.nextInt();
        if (resultado == adivinacion) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        sc.close();
    }
}