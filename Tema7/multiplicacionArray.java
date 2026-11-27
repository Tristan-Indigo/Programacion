import java.util.Scanner;
public class multiplicacionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 5;
        Double lista[] = new Double[MAX];
        int contar = 1;
        System.out.println("Inserte " + MAX + " numero: ");
        while (contar <= MAX) {
            lista[contar - 1] = sc.nextDouble();
            contar++;
        }
        contar = 1;
        multiplicar(lista, contar, MAX);
        sc.close();
    }
    public static Double[] multiplicar(Double[] lista1, int contar, final int MAX) {
        final int MULT = 2;
        Double lista2[] = new Double[MAX];
        System.out.println("Los " + MAX + " numeros multiplicados por " + MULT + " son: ");
        while (contar <= MAX) {
            lista2[contar - 1] = lista1[contar - 1] * MULT;
            if (contar < MAX - 1 && MAX > 2) {
                System.out.print(lista2[contar - 1] + ", ");
            } else if (contar < MAX && MAX > 1) {
                System.out.print(lista2[contar - 1] + " y ");
            } else {
                System.out.println(lista2[contar - 1]);
            }
            contar++;
        }
        return lista1;
    }
}