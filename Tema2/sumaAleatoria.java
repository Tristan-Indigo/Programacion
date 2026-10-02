import java.util.Scanner;
public class sumaAleatoria {
    public static void main(String[] args) {
        //Este ejemplo crea un programa para que realiza una suma de primer grado. El programa genera aleatoriamente dos números enteros de un dígito número1 y número2
        //y muestra una pregunta como "¿Qué es 7 + 9?" Al estudiante. 
        //Después de que el estudiante escribe la respuesta, el programa muestra un mensaje para indicar si la respuesta es verdadera o falsa.
        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);
        int resultado= random1 + random2;
        int adivinacion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué es " + random1 + " + " + random2 + "?");
        System.out.print("Introduzca el resultado: ");
        adivinacion = sc.nextInt();
        if (resultado == adivinacion) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        sc.close();
    }
}