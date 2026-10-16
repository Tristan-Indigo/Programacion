import java.util.Scanner;
public class insertarSimbolo {
    public static void main(String[] args) {
        String cadena = "";
        int mitad = 0;
        String primeraParte = "";
        String segundaParte = "";
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el cadena (minimo 2 caracteres): ");
        cadena = sc.nextLine();
        if (cadena.length() < 2) {
            System.out.println("No puedes introducir una cadena con menos de 2 caracteres");
        } else {
            mitad = (cadena.length() / 2);
            primeraParte = cadena.substring(0,mitad);
            segundaParte = cadena.substring(mitad);
            resultado = primeraParte + "<>" + segundaParte;
            System.out.println("La cadena resultante es: " + resultado);
           
        }
        sc.close();
    }
}
