import java.util.Scanner;
public class numerosPares {
    public static void main(String[] args) {
        long numero = 0;
        long contar = 0;
        Scanner sc = new Scanner(System.in);
        while (numero < 1) {
            System.out.print("Escribe un número (mayor a 1): ");
            numero = sc.nextLong();
            if (numero < 1) {
                System.out.println("No introduzcas un número menor a 1");
            }
        }
        while (contar <= numero && numero > 1) {
            if (contar % 2 == 0) {
                System.out.println(contar);
            }
            contar++;
        }
        sc.close();
    }
}