import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int diaSemana = 0;
        //lunes = Lenguaje de marca
        //martes = Base de datos
        //miercoles = Sistemas Informáticos
        //jueves = Programación
        //viernes = Entorno de desarrollo
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de un día de la semana del 1 al 7: ");
        diaSemana = sc.nextInt();
        if (diaSemana == 1) {
            System.out.println("El lunes a primera hora toca Lenguaje de marca");
        } else if (diaSemana == 2) {
            System.out.println("El martes a primera hora toca Base de datos");
        } else if (diaSemana == 3) {
            System.out.println("El miercoles a primera hora toca Sistemas Informáticos");
        } else if (diaSemana == 4) {
            System.out.println("El jueves a primera hora toca Programación");
        } else if (diaSemana == 5) {
            System.out.println("El viernes a primera hora toca Entorno de desarrollo");
        } else if (diaSemana == 6 || diaSemana == 7) {
            System.out.println("Los sabados y domingos no hay que ir a clases");
        } else if (diaSemana <= 0 || diaSemana > 7) {
            System.out.println("Por favor, la proxima vez introduzca un numero comprendido entre el 1 y el 7");
        }
        sc.close();
    }
}