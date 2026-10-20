import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String nombreCompleto = "";
        String nombre = "";
        String apellido1 = "";
        String apellido2 = "";
        int k = 0;
        int k1 = 0;
        int k2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca tu nombre y apellidos: ");
        nombreCompleto = sc.nextLine();
        k = nombreCompleto.indexOf(" ");
        nombre = nombreCompleto.substring(0, k);
        apellido1 = nombreCompleto.substring(k + 1);
        k1 = apellido1.indexOf(" ");
        apellido2 = apellido1.substring(k1 + 1);
        k2 = apellido1.indexOf(" ");
        apellido1 = apellido1.substring(0, k2);
        System.out.println("Nombre: " + nombre + ", primer apellido: " + apellido1 + ", segundo apellido: " + apellido2);
        sc.close();
    }
}