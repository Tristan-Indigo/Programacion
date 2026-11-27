import java.util.Scanner;
public class multiplicacionArrayV2 {
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
    public static void multiplicar(Double[] lista1, int contar, final int MAX) {
        final int MULT = 2;
        Double lista2[] = new Double[MAX];
        while (contar <= MAX) {
            lista2[contar - 1] = lista1[contar - 1] * MULT;
            contar++;
        }
        contar = 1;
        ordenar(lista2, contar, MAX, MULT);
    }
    public static void ordenar(Double[] lista3, int contar, final int MAX, final int MULT) {
        System.out.println("Los " + MAX + " numeros multiplicados por " + MULT + " y ordenados ascendentemente son: ");
        //El metodo Arrays.sort ordena ascendentemente automaticamente con solo 1 linea de codigo
        java.util.Arrays.sort(lista3);
        while (contar <= MAX - 2 && MAX > 2) {
            System.out.print(lista3[contar - 1] + ", ");
            contar++;
        }
        if (MAX > 1) {
            System.out.print(lista3[MAX - 2] + " y ");
        }
        System.out.print(lista3[MAX - 1]);
    }
}