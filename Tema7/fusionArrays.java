import java.util.Scanner;
public class fusionArrays {
    public static void main(String[] args) {
        //Falta hacer que cuando el "MAX" sea un numero impar funcione
        Scanner sc = new Scanner(System.in);
        final int MAX = 10;
        Double lista[] = new Double[MAX];
        int contar = 1;
        System.out.println("Inserte una cadena de " + MAX + " numero: ");
        while (contar <= MAX) {
            lista[contar - 1] = sc.nextDouble();
            contar++;
        }
        contar = 1;
        separar(lista, contar, MAX);
        sc.close();
    }
    public static Double[] separar(Double[] lista, int contar, final int MAX) {
        Double lista1[] = new Double[MAX/2];
        Double lista2[] = new Double[MAX/2];
        System.out.println("-La primera mitad de la cadena de numeros introducidos son: ");
        while (contar <= MAX/2) {
            lista1[contar - 1] = lista[contar - 1];
            if (contar < MAX/2 - 1) {
                System.out.print(lista1[contar - 1] + ", ");
            } else if (contar < MAX/2) {
                System.out.print(lista1[contar - 1] + " y ");
            } else {
                System.out.println(lista1[contar - 1]);
            }
            contar++;
        }
        System.out.println("-La segunda mitad de la cadena de numeros introducidos son: ");
        while (contar <= MAX) {
            lista2[contar - 1 - MAX/2] = lista[contar - 1];
            if (contar < MAX - 1) {
                System.out.print(lista2[contar - 1 - MAX/2] + ", ");
            } else if (contar < MAX) {
                System.out.print(lista2[contar - 1 - MAX/2] + " y ");
            } else {
                System.out.println(lista2[contar - 1 - MAX/2]);
            }
            contar++;
        }
        contar = 1;
        fusionar(lista1, lista2, contar, MAX);
        return lista;
    }
    public static Double[] fusionar(Double[] lista1, Double[] lista2, int contar, final int MAX) {
        Double resultado[] = new Double[MAX];
        while (contar <= MAX/2) {
            resultado[contar - 1] = lista1[contar - 1];
            contar++;
        }
        while (contar <= MAX) {
            resultado[contar - 1] = lista2[contar - 1 - MAX/2];
            contar++;
        }
        System.out.println("-La fusion de las dos mitades de la cadena de numeros introducidos son:");
        contar = 1;
        while (contar <= MAX) {
            if (contar < MAX - 1) {
                System.out.print(resultado[contar - 1] + ", ");
            } else if (contar < MAX) {
                System.out.print(resultado[contar - 1] + " y ");
            } else {
                System.out.println(resultado[contar - 1]);
            }
            contar++;
        }
        return resultado;
    }
}