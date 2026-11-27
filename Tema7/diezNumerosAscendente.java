import java.util.Scanner;
public class diezNumerosAscendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 10;
        Double lista1[] = new Double[MAX];
        int contar = 1;
        System.out.println("Inserte " + MAX + " numeros: ");
        while (contar <= MAX) {
            lista1[contar - 1] = sc.nextDouble();
            contar++;
        }
        ordenarAscendente(lista1, MAX);
        sc.close();
    }
    public static Double[] ordenarAscendente(Double[] lista, final int MAX) {
        int contar = 1;
        System.out.print("Los " + MAX + " numeros ordenados ascendentemente son: ");
        //El metodo Arrays.sort ordena ascendentemente automaticamente con solo 1 linea de codigo
        java.util.Arrays.sort(lista);
        while (contar <= MAX && MAX > 2) {
            System.out.print(lista[contar - 1] + ", ");
            contar++;
        }
        if (MAX > 1) {
            System.out.print(lista[MAX - 2] + " y ");
        }
        System.out.print(lista[MAX - 1]);
        return lista;
    }
}