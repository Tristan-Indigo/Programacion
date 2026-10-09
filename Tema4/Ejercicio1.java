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
        media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        sc.close();
    }
}