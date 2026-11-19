public class cienNumerosPrimos {
    public static void main(String[] args) {
        comprobarPrimo();
    }
    public static String comprobarPrimo () {
        String todo = "";
        int listaNumeros[] = new int[100];
        int contar = 2;
        boolean esPrimo;
        int comprobar;
        final int MAX = 101;
        for (int numero = 2; numero < MAX; numero++) {
            esPrimo = true;
            comprobar = 2;
            while (comprobar < numero) {
                if (numero % comprobar == 0 && numero != 2) {
                    esPrimo = false;
                }
                comprobar++;
            }
            if (contar > 1 && esPrimo == true) {
                listaNumeros[numero] = numero;
                System.out.println("| " + listaNumeros[numero] + " es un numero primo | ");
            }
            contar++;
        }
        return todo;
    }
}