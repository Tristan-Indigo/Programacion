public class tablaDelNueve {
    public static void main(String[] args) {
        int tabla = 9;
        int multiplicar;
        for (multiplicar = 0; multiplicar <= 10; multiplicar++) {
            System.out.printf("%-2d x %2d = %2d%n", tabla, multiplicar, tabla * multiplicar);
        }
    }
}