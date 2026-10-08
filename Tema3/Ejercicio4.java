import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        int original = 0;
        int inverso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo y menor de 6 cifras: ");
        original = sc.nextInt();
        int numero = original;
        if ((original / 10000) >= 10) {
            System.out.println("La proxima vez introduzca un numero menor de 6 cifras");
        } else if (original < 0) {
            System.out.println("La proxima vez introduzca un numero positivo");
        } else {
            //usare un bucle porque el ejercicio lo recomendo, aunque los bucles no se den en este tema (aparte que pereza hacerlo sin bucle)
            while (numero != 0) {
                inverso = inverso * 10 + numero % 10;
                numero = numero / 10;
            } if (original == inverso) {
                System.out.println(original + " es un numero capicúa");
            } else if (original != inverso) {
                System.out.println(original + " no es un numero capicúa");
            }
        }
        sc.close();
    }
}