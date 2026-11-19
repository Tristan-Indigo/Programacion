public class cienNumerosPrimos {
    public static void main(String[] args) {
        comprobarPrimo();
    }
    public static String comprobarPrimo () {
        String todo = "";
        int listaNumeros[] = new int[101];
        int contar = 0;
        boolean esPrimo;
        int comprobar;
        final int MAX = 101;
        for (int numero = 1; numero < MAX; numero++) {
            esPrimo = true;
            comprobar = 2;
            while (comprobar < numero) {
                if (numero % comprobar == 0 && numero != 2) {
                    esPrimo = false;
                }
                comprobar++;
            }
            listaNumeros[numero] = numero;
            if (contar >= 2 && esPrimo == true) {
                System.out.println("| " + listaNumeros[numero] + " es un numero primo.");
            } else {
                System.out.println("| " + listaNumeros[numero] + " no es un numero primo.");
            }
            contar++;
        }
        return todo;
    }
}