public class palabraRandom {
    public static void main(String[] args) {
        //A = 65
        //Z = 90
        String mayuscula = "";
        int contador = 0;
        int numeroChar = 0;
        while (contador != 5) {
            contador++;
            numeroChar = 65 + (int)(Math.random() * 26);
            char letra = (char)numeroChar;
            mayuscula = mayuscula + letra;
        }
        String minuscula = mayuscula.toLowerCase();
        System.out.println(mayuscula);
        System.out.println(minuscula);
    }
}