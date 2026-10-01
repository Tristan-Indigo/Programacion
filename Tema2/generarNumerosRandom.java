public class generarNumerosRandom {
    public static void main(String[] args) {
    //Genera 2 números aleatorios y realiza la suma de ambos. A continuación preguntamos al usuario el resultado y comprobamos que es correcto.
    int random1 = (int) (Math.random() * 10);
    int random2 = (int) (Math.random() * 10);
    System.out.println(random1);
    System.out.println(random2);
    }
}