public class numerosPrimos {
    public static void main(String[] args) {
        //Escribe un programa que imprima todos los números primos del 1 al 50, cada uno en su línea.
        int numero = 1;
        double divisor = 2.0;
        while (numero <= 50) {
            while (divisor <= 50 && ((numero/divisor) * Math.pow(10, numero)) != 0) {
                divisor++;
            }
            System.out.println(numero);
            numero++;
        }
    }
}