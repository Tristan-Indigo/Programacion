public class barajaFrancesa {
    public static void main(String[] args) {
        //Pica = 0
        //Corazon = 1
        //Diamante = 2
        //Trebol = 3
        int numero = 0;
        int palo = 0;
        numero = (int)(Math.random() * 13) + 1;
        palo = (int)(Math.random() * 4);
        if (palo == 0) {
            if (numero == 1) {
                System.out.println("La carta obtenida es: As de picas");
            } else if (numero > 1 && numero < 11) {
                System.out.println("La carta obtenida es: " + numero + " de picas");
            } else if (numero == 11) {
                System.out.println("La carta obtenida es: Joker de picas");
            } else if (numero == 12) {
                System.out.println("La carta obtenida es: Reina de picas");
            } else if (numero == 13) {
                System.out.println("La carta obtenida es: Rey de picas");
            }
        } else if (palo == 1) {
            if (numero == 1) {
                System.out.println("La carta obtenida es: As de corazones");
            } else if (numero > 1 && numero < 11) {
                System.out.println("La carta obtenida es: " + numero + " de corazones");
            } else if (numero == 11) {
                System.out.println("La carta obtenida es: Joker de corazones");
            } else if (numero == 12) {
                System.out.println("La carta obtenida es: Reina de corazones");
            } else if (numero == 13) {
                System.out.println("La carta obtenida es: Rey de corazones");
            }
        } else if (palo == 2) {
            if (numero == 1) {
                System.out.println("La carta obtenida es: As de diamantes");
            } else if (numero > 1 && numero < 11) {
                System.out.println("La carta obtenida es: " + numero + " de diamantes");
            } else if (numero == 11) {
                System.out.println("La carta obtenida es: Joker de diamantes");
            } else if (numero == 12) {
                System.out.println("La carta obtenida es: Reina de diamantes");
            } else if (numero == 13) {
                System.out.println("La carta obtenida es: Rey de diamantes");
            }
        } else if (palo == 3) {
            if (numero == 1) {
                System.out.println("La carta obtenida es: As de treboles");
            } else if (numero > 1 && numero < 11) {
                System.out.println("La carta obtenida es: " + numero + " de treboles");
            } else if (numero == 11) {
                System.out.println("La carta obtenida es: Joker de treboles");
            } else if (numero == 12) {
                System.out.println("La carta obtenida es: Reina de treboles");
            } else if (numero == 13) {
                System.out.println("La carta obtenida es: Rey de treboles");
            }
        }
    }
}