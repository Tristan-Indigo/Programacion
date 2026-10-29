public class numerosPrimos {
    public static void main(String[] args) {
        //El 1 no es primo.
        int numero = 2;
        boolean esPrimo;
        int comprobar;
        final int MAX = 50;
        while (numero <= MAX) {
            comprobar = 2;
            esPrimo = true;
            while (comprobar < numero) {
                if (numero % comprobar == 0) {
                    esPrimo = false;
                }
                comprobar++;
            }
            if (esPrimo == true) {
                System.out.println(numero + " es un numero primo.");
            }
            numero++;
        }
    }
}