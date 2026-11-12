import java.util.Scanner;
public class funcionesMatematicas {
    public static void main(String[] args) {
        String eleccion = "";
        int original = 0;
        int base = 0, exponente = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(
            "BIBLIOTECA DE FUNCIONES MATEMATICAS\n" +
            "-esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.\n" +
            "-potencia: Dada una base y un exponente devuelve la potencia.\n" +
            "-digitos: Cuenta el número de dígitos de un número entero.\n" +
            "-voltea: Le da la vuelta a un número.\n" +
            "-quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).\n" +
            "-pegaPorDelante: Añade un dígito a un número por delante."
        );
        System.out.print("Elija la funcion matematica: ");
        eleccion = sc.nextLine();
        if (eleccion.equalsIgnoreCase("esCapicua")) {
            System.out.print("Introduzca un numero: ");
            original = sc.nextInt();
            System.out.println(esCapicua(original));
        } else if (eleccion.equalsIgnoreCase("potencia")) {
            System.out.print("Di el valor de la base: ");
            base = sc.nextInt();
            System.out.print("Di el valor del exponente: ");
            exponente = sc.nextInt();
            System.out.println("La potencia de " + base + "^" + exponente + " es: " + potencia(base, exponente));
        } else if (eleccion.equalsIgnoreCase("digitos")) {
            System.out.println(digitos());
        } else if (eleccion.equalsIgnoreCase("voltea")) {
            System.out.println(voltea());
        } else if (eleccion.equalsIgnoreCase("quitaPorDetras")) {
            System.out.println(quitaPorDetras());
        } else if (eleccion.equalsIgnoreCase("pegaPorDelante")) {
            System.out.println(pegaPorDelante());
        } else {
            System.out.println("Elección incorrecta");
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
        }
        if (og == inverso) {
            esCapicua = og + " es un numero capicúa";
        } else if (og != inverso) {
            esCapicua = og + " no es un numero capicúa";
        }
        return esCapicua;
    }
    public static long potencia(int b, int e) {
        //potencia
        long potencia = (long)Math.pow(b,e);
        return potencia;
    }
    public static String digitos() {
        //digitos
        String numero = "";
        int comprobar = 0;
        char comprobarCaracter = ' ';
        boolean comprobarDigito = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        numero = sc.nextLine();
        while (comprobar < numero.length()) {
            comprobarCaracter = numero.charAt(comprobar);
            if (!Character.isDigit(comprobarCaracter)) {
                comprobarDigito = false;
            }
            comprobar++;
        }
        if (comprobarDigito == false) {
            numero = "No puedes introducir algo que no sea un numero";
        } else {
            numero = numero + " tiene " + numero.length() + " digitos";
        }
        sc.close();
        return numero;
    }
    public static String voltea() {
        //voltea
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int inverso = 0;
        String resultado = "";
        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
        System.out.print("El numero " + numero + " volteado es");
        while (numero != 0) {
            inverso = inverso * 10 + numero % 10;
            numero = numero / 10;
        }
        resultado = " " + inverso;
        sc.close();
        return resultado;
    }
    public static String quitaPorDetras() {
        //quitaPorDetras
        String numero = "";
        int partir = 0;
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero (minimo 2 digitos totales): ");
        numero = sc.next();
        Double.parseDouble(numero);
        if (numero.length() < 2) {
            resultado = "No puedes introducir un numero menor de 2 digitos totales";
        } else {
            System.out.print("Introduzca en cuantos digitos quitar: ");
            partir = sc.nextInt();
            if (partir >= numero.length()) {
                resultado = "No puedes quitar mas numeros que los digitos que tiene el numero";
            } else {
                resultado = "El numero restante es " + numero.substring(0,(numero.length() - partir));
            }
        }
        sc.close();
        return resultado;
    }
    public static String pegaPorDelante() {
        //pegarPorDelante
        String numero = "";
        int introducir = 0;
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero (minimo 1 digito): ");
        numero = sc.next();
        Double.parseDouble(numero);
        System.out.print("Introduzca un digito que quieras poner delante del numero: ");
        introducir = sc.nextInt();
        if (introducir >= 10) {
            System.out.println("No puedes introducir mas de 1 digito");
        } else {
            resultado = "El numero resultante es: " + introducir + numero;
        }
        sc.close();
        return resultado;
    }
}