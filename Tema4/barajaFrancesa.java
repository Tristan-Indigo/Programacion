public class barajaFrancesa {
    public static void main(String[] args) {
        //Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
        //Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
        //Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales:
        //2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
        //Pica = 0
        //Corazon = 1
        //Diamante = 2
        //Trebol = 3
        int numero = 0;
        int palo = 0;
        numero = (int)(Math.random() * 13) + 1;
        palo = (int)(Math.random() * 4);
        if (numero == 1) {
            //numero = (String)"As";
        }
        if (palo == 0) {
            System.out.println("La carta obtenida es: " + numero + " de picas");
        } else if (palo == 1) {
            System.out.println("La carta obtenida es: " + numero + " de corazones");
        } else if (palo == 2) {
            System.out.println("La carta obtenida es: " + numero + " de diamantes");
        } else if (palo == 3) {
            System.out.println("La carta obtenida es: " + numero + " de treboles");
        }
    }
}
