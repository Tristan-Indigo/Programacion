import java.util.Scanner;
public class partirNumero {
    public static void main(String[] args) {
        String numero = "";
        int partir = 0;
        String primeraParte = "";
        String segundaParte = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero (minimo 2 digitos totales): ");
        numero = sc.next();
        Double.parseDouble(numero);
        if (numero.length() < 2) {
            System.out.println("No puedes introducir un numero menor de 2 digitos totales");
        } else {
            System.out.print("Introduzca en cual posicion vas a partirlo (minimo 1): ");
            partir = sc.nextInt();
            if (partir >= numero.length()) {
                System.out.println("No puedes introducir una posicion mayor o igual que el numero");
            } else if (partir < 1) {
                System.out.println("No puedes introducir una posicion menor que 1");
            } else {
                primeraParte = numero.substring(0,partir);
                segundaParte = numero.substring(partir);
                System.out.println("Los numero partidos son el " + primeraParte + " y el " + segundaParte);
            }
        }
        sc.close();
    }
}