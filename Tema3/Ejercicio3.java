import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        -Aries: 21 de marzo al 19 de abril
        -Tauro: 20 de abril al 20 de mayo
        -Géminis: 21 de mayo al 20 de junio
        -Cáncer: 21 de junio al 22 de julio
        -Leo: 23 de julio al 22 de agosto
        -Virgo: 23 de agosto al 22 de septiembre
        -Libra: 23 de septiembre al 22 de octubre
        -Escorpio: 23 de octubre al 21 de noviembre
        -Sagitario: 22 de noviembre al 21 de diciembre
        -Capricornio: 22 de diciembre al 20 de enero
        -Acuario: 21 de enero al 19 de febrero
        -Piscis: 19 de febrero al 20 de marzo
        */
        int dia = 0;
        int mes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del dia de tu nacimiento en un año no bisiesto: ");
        dia = sc.nextInt();
        System.out.print("Introduzca el numero del mes de tu nacimiento en un año no bisiesto: ");
        mes = sc.nextInt();
        //ya que el ejercicio no pide especificamente el año, pues usare un año no bisiesto
        if ((dia >= 32 || dia <= 0) && (mes <= 12 && mes >= 1)) {
            System.out.println("La proxima vez introduzca un dia que exista");
        } else if ((mes >= 13 || mes <= 0) && (dia <= 31 && dia >= 1)) {
            System.out.println("La proxima vez introduzca un mes que exista");
        } else if ((dia >= 32 || dia <= 0) && (mes >= 13 || mes <= 0)) {
            System.out.println("La proxima vez introduzca un dia y un mes que existan");
        } else if (dia >= 29 && mes == 2) {
            System.out.println("Febrero no tiene mas de 28 dias en un año no bisiesto.");
            System.out.println("la proxima vez no elijas un dia mas del 28 si luego vas a elejir febrero");
        } else if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            System.out.println("Tu signo es Aries");
        } else if ((dia >= 20 && dia <=30 && mes == 4) || (dia <= 20 && mes == 5)) {
            System.out.println("Tu signo es Tauro");
        }  else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            System.out.println("Tu signo es Géminis");
        } else if ((dia >= 21 && dia <=30 && mes == 6) || (dia <= 2 && mes == 7)) {
            System.out.println("Tu signo es Cáncer");
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            System.out.println("Tu signo es Leo");
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            System.out.println("Tu signo es Virgo");
        } else if ((dia >= 23 && dia <=30 && mes == 9) || (dia <= 22 && mes == 10)) {
            System.out.println("Tu signo es Libra");
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            System.out.println("Tu signo es Escorpio");
        } else if ((dia >= 22 && dia <=30 && mes == 11) || (dia <= 21 && mes == 12)) {
            System.out.println("Tu signo es Sagitario");
        } else if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1)) {
            System.out.println("Tu signo es Capricornio");
        } else if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)) {
            System.out.println("Tu signo es Acuario");
        } else if ((dia >= 20 && dia <=28 && mes == 2) || (dia <= 20 && mes == 3)) {
            System.out.println("Tu signo es Piscis");
        }
        sc.close();
    }
}