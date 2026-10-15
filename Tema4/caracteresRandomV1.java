public class caracteresRandomV1 {
     public static void main(String[] args) {
        //€ = ?
        String cadena = "";
        int contador = 0;
        int numeroChar = 0;
        char letra = 0;
        numeroChar = (int)(Math.random() * 4 + 1);
            if (numeroChar == 1) {
                letra = '#';
            }else if (numeroChar == 2) {
                letra = '$';
            }else if (numeroChar == 3) {
                letra = '€';
            }else {
                letra = '&';
            }
        while (contador != 5) {
            contador++;
            cadena = cadena + letra;
        }
        System.out.println(cadena);
     }
}