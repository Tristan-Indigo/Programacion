import java.util.Scanner;
public class calculaDiezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double lista1[] = new Double[10];
        int contar = 1;
        String eleccion = "";
        System.out.println("Elija una operación (suma, resta, multiplicacion, division): ");
        eleccion = sc.next();
        if (eleccion.equalsIgnoreCase("suma") || eleccion.equalsIgnoreCase("resta") || eleccion.equalsIgnoreCase("multiplicacion") || eleccion.equalsIgnoreCase("division")) {
            System.out.println("Inserte diez numeros: ");
            while (contar <= 10) {
                lista1[contar - 1] = sc.nextDouble();
                contar++;
            }
            operacion(lista1, eleccion);
        } else {
            System.out.println("Elección incorrecta");
        }
        sc.close();
    }
    public static Double[] operacion(Double[] lista, String eleccion) {
        Double resultado[] = new Double[1];
        int contar = 1;
        resultado[0] = lista[0];
        System.out.println("numeros insertados: ");
        System.out.print("| ");
        while (contar <= 10) {
            System.out.print("Nº " + contar + ": " + lista[contar - 1] + " | ");
            contar++;
        }
        contar = 2;
        System.out.println("");
        System.out.println(eleccion + ": ");
        System.out.print("| ");
        if (eleccion.equalsIgnoreCase("suma")) {
            //Suma
            while (contar <= 10) {
                resultado[0] += lista[contar - 1];
                contar++;
            }
            System.out.println(resultado[0] + " |");
        } else if (eleccion.equalsIgnoreCase("resta")) {
            //Resta
            while (contar <= 10) {
                resultado[0] -= lista[contar - 1];
                contar++;
            }
            System.out.println(resultado[0] + " |");
        } else if (eleccion.equalsIgnoreCase("multiplicacion")) {
            //Multiplicación
            while (contar <= 10) {
                resultado[0] *= lista[contar - 1];
                contar++;
            }
            System.out.println(resultado[0] + " |");
        } else {
            //Division
            while (contar <= 10) {
                resultado[0] /= lista[contar - 1];
                contar++;
            }
            System.out.println(resultado[0] + " |");
        }
        return resultado;
    }
}