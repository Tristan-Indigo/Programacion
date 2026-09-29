public class Ejercicio1 {
    public static void main(String[] args) {
        int eurosPorHora = 12;
        int salarioSemanal1 = 0;
            //salarioSemanal1 es el salario de todos los dias de la semana
        int salarioSemanal2 = 0;
            //salarioSemanal2 es el salario de lunes a viernes
        salarioSemanal1 = (eurosPorHora * 24) * 7;
        salarioSemanal2 = (eurosPorHora * 24) * 5;
        System.out.println("El salario semanal de una persona que trabaja todos los dias de la semana y gana 12 euros por hora es de " + salarioSemanal1 + " euros.");
        System.out.println("El salario semanal de una persona que trabaja de lunes a viernes y gana 12 euros por hora es de " + salarioSemanal2 + " euros.");

    }
}
