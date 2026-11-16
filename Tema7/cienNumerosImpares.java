public class cienNumerosImpares {
    public static void main(String[] args) {
        int listaNumeros[] = new int[100];
        System.out.print("| ");
        for (int numero = 0; numero < 100; numero++) {
            if (numero % 2 != 0) {
                listaNumeros[numero] = numero;
                System.out.print(listaNumeros[numero] + " | ");
            }
        }
    }
}