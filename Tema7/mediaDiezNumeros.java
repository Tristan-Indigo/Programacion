import java.util.Scanner;
public class mediaDiezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 10;
        Double lista1[] = new Double[MAX];
        int contar = 1;
        System.out.println("Inserte diez notas: ");
        while (contar <= MAX) {
            lista1[contar - 1] = sc.nextDouble();
            contar++;
        }
        media(lista1, MAX);
        sc.close();
    }
    public static Double[] media(Double[] lista, final int MAX) {
        Double resultado[] = new Double[1];
        int contar = 1;
        resultado[0] = 0.0;
        while (contar <= MAX) {
            resultado[0] += lista[contar - 1];
            contar++;
        }
        System.out.println(resultado[0] / MAX);
        return resultado;
    }
}