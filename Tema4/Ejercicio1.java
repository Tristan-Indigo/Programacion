import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //Introduce 5 notas desde teclado y muestra para cada nota,
        //la nota redondeada con un decimal al alza,
        //a la baja,
        //la nota truncada en las unidades
        //y al final muestra la media
        //e indica el máximo y mínimo.
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double nota4 = 0.0;
        double nota5 = 0.0;
        double media = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        nota1 = sc.nextDouble();
        //System.out.println(Math.ceil (nota1));
        //System.out.println(Math.floor (nota1));
        //System.out.println((int)(nota1));
        System.out.print("Introduzca la segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Introduzca la tercera nota: ");
        nota3 = sc.nextDouble();
        System.out.print("Introduzca la cuarta nota: ");
        nota4 = sc.nextDouble();
        System.out.print("Introduzca la quinta nota: ");
        nota5 = sc.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("La nota media es: " + media);
        sc.close();
    }
}