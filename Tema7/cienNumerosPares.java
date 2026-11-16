public class cienNumerosPares {
    public static void main(String[] args) {
        int listaNumeros[] = new int[101];
        System.out.print("| ");
        for (int numero = 0; numero < 101; numero++) {
            if (numero % 2 == 0) {
                listaNumeros[numero] = numero;
                System.out.print(listaNumeros[numero] + " | ");
            }
        }
    }
}