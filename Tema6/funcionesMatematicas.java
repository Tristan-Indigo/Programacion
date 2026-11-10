import java.util.Scanner;
public class funcionesMatematicas {
    public static void main(String[] args) {
        //Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones.
        //Recuerda que puedes usar unas dentro de otras si es necesario. Se deberá realizar un menú para poder ejecutarlas.
        /*
            esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
            potencia: Dada una base y un exponente devuelve la potencia.
            digitos: Cuenta el número de dígitos de un número entero.
            voltea: Le da la vuelta a un número.
            quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
            pegaPorDelante: Añade un dígito a un número por delante.
        */
        String eleccion = "";
        int original = 0;
        int base = 0, exponente = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija la funcion matematica: ");
        eleccion = sc.nextLine();
        if (eleccion.equalsIgnoreCase("esCapicua")) {
            System.out.print("Introduzca un numero: ");
            original = sc.nextInt();
            System.out.println(esCapicua(original));
        }
        if (eleccion.equalsIgnoreCase("potencia")) {
            System.out.print("Di el valor de la base: ");
            base = sc.nextInt();
            System.out.print("Di el valor del exponente: ");
            exponente = sc.nextInt();
            System.out.println("La potencia de " + base + "^" + exponente + " es: " + potencia(base, exponente));
        }
        sc.close();
    }
    public static String esCapicua(int og) {
        //esCapicua
        String esCapicua = "";
        int numero = og;
        int inverso = 0;
        while (numero != 0) {
                inverso = inverso * 10 + numero % 10;
                numero = numero / 10;
            } if (og == inverso) {
                System.out.println(og + " es un numero capicúa");
            } else if (og != inverso) {
                System.out.println(og + " no es un numero capicúa");
            }
        return esCapicua;
    }
    public static long potencia(int b, int e) {
        //potencia
        long potencia = (long)Math.pow(b,e);
        return potencia;
    }
}
