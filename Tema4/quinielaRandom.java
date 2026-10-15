public class quinielaRandom {
    public static void main(String[] args) {
        //"1" = 1/2
        //"X" = 1/3
        //"2" = 1/6
        int numero = 0;
        int intentos = 0;
        while (intentos != 15) {
            numero = (int)(Math.random() * 6) + 1;
            if (numero == 6) {
                System.out.println("2");
            } else if (numero*2 >= 6) {
                System.out.println("X");
            } else if (numero*3 >= 6) {
                System.out.println("1");
            } else {
                System.out.println("No gano nada");
            }
            intentos++;
        }
    }
}