import java.util.Scanner;
public class diezNumerosInversos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lista1[] = new int[10];
        int contar = 1;
        System.out.println("Inserte diez numeros: ");
        while (contar <= 10) {
            lista1[contar - 1] = sc.nextInt();
            contar++;
        }
        invertirOrden(lista1);
        sc.close();
    }
    public static int[] invertirOrden(int[] lista) {
        int resultado[] = new int[lista.length];
        int numero = 0;
        int inverso = resultado.length - 1;
        int contar = 1;
        System.out.println("Numeros insertados: ");
        System.out.print("| ");
        while (contar <= 10) {
            System.out.print("Nº " + contar + ": " + lista[contar - 1] + " | ");
            contar++;
        }
        contar = 1;
        System.out.println("");
        System.out.println("Numeros inversos: ");
        System.out.print("| ");
        while (numero < lista.length) {
            resultado[inverso] = lista[numero];
            System.out.print("Nº " + contar + ": " + lista[inverso] + " | ");
            numero++;
            inverso--;
            contar++;
        }
        return resultado;
    }
}