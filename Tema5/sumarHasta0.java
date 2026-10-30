import java.util.Scanner;
public class sumarHasta0 {
    public static void main(String[] args) {
        int numero = 0;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero (0 para terminar): ");
            numero = sc.nextInt();
            suma = suma + numero;
        } while (numero!= 0);
        System.out.println("La suma final es: " + suma);
        sc.close();
    }
}