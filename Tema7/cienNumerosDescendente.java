public class cienNumerosDescendente {
    public static void main(String[] args) {
        int listaNumeros[] = new int[100];
        System.out.print("| ");
        for (int numero = 99; numero > 0; numero--) {
            listaNumeros[numero] = numero;
            System.out.print(listaNumeros[numero] + " | ");
        }
    }
}