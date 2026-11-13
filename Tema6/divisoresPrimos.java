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
    public static int calcular(int pedirNumero) {
        int comprobar = 2;
        boolean esPrimo;
        int divisor = 2;
        int imprimirNumero = 0;
        while (pedirNumero > divisor) {
            esPrimo = true;
            if (pedirNumero % divisor == 0) {
                while (comprobar < divisor && esPrimo == true) {
                    if (divisor % comprobar == 0) {
                        esPrimo = false;
                    }
                    comprobar++;
                }
                if (esPrimo == true) {
                    imprimirNumero = divisor;
                    System.out.println(imprimirNumero);
                }
            }
            divisor++;
            comprobar++;
        }
        return imprimirNumero;  
    }
}