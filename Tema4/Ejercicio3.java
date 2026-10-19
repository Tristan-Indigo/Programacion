import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        //Escribe un programa que lea el nombre y dos apellidos
        //y nos almacene en cadenas separadas el nombre, el primer apellido y el segundo apellido.
        String nombreCompleto = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca tu nombre y apellidos: ");
        nombreCompleto = sc.nextLine();
        sc.close();
    }
}