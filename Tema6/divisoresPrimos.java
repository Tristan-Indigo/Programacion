import java.util.Scanner;
public class divisoresPrimos {
    public static void main(String[] args) {
        //El 1 no es primo.
        int pedirNumero = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero mayor a 1: ");
        pedirNumero = sc.nextInt();
        if (pedirNumero > 1) {
            System.out.println("Los divisores primos de " + pedirNumero + " son: ");
            calcular(pedirNumero);
        } else if (pedirNumero == 1) {
            System.out.println("El numero no puede ser 1");
        } else {
            System.out.println("El numero no puede ser menor de 1");
        }
        sc.close();
    }
    public static String calcular(int pedirNumero) {
        int numero = 2;
        boolean esPrimo;
        int comprobar;
        String todo = "";
        while (numero <= pedirNumero) {
            comprobar = 2;
            esPrimo = true;
            while (comprobar < numero) {
                if (numero % comprobar == 0) {
                    esPrimo = false;
                }
                comprobar++;
            }
            if (esPrimo == true) {
                if (pedirNumero % numero == 0) {
                    System.out.println(numero);
                } else {
                    esPrimo = false;
                }
            }
            numero++;
        }
        return todo;
    }
}