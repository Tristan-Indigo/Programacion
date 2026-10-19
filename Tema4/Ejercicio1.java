import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;
        double nota4 = 0.0;
        double nota5 = 0.0;
        double media = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la primera nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Esta nota redondeada al alza es " + Math.ceil(nota1) + ", a la baja es " + Math.floor(nota1) + " y truncada a las unidades es " + (int)(nota1));
        System.out.print("Introduzca la segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Esta nota redondeada al alza es " + Math.ceil(nota2) + ", a la baja es " + Math.floor(nota2) + " y truncada a las unidades es " + (int)(nota2));
        System.out.print("Introduzca la tercera nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Esta nota redondeada al alza es " + Math.ceil(nota3) + ", a la baja es " + Math.floor(nota3) + " y truncada a las unidades es " + (int)(nota3));
        System.out.print("Introduzca la cuarta nota: ");
        nota4 = sc.nextDouble();
        System.out.println("Esta nota redondeada al alza es " + Math.ceil(nota4) + ", a la baja es " + Math.floor(nota4) + " y truncada a las unidades es " + (int)(nota4));
        System.out.print("Introduzca la quinta nota: ");
        nota5 = sc.nextDouble();
        System.out.println("Esta nota redondeada al alza es " + Math.ceil(nota5) + ", a la baja es " + Math.floor(nota5) + " y truncada a las unidades es " + (int)(nota5));
        media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("La nota media es " + media + ". La media redondeada al alza es "+ Math.ceil(media) + ", a la baja es " + Math.floor(media) + " y truncada a las unidades es " + (int)(media));
        System.out.println("La nota minima es: " + Math.min(nota1, Math.min(nota2, Math.min(nota3, Math.min(nota4, nota5)))));
        System.out.println("La nota minima es: " + Math.max(nota1, Math.max(nota2, Math.max(nota3, Math.max(nota4, nota5)))));
        sc.close();
    }
}