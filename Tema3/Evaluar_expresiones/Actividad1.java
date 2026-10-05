public class Actividad1 {
    public static void main(String[] args) {
        //a)
        double a = 2.0;
        double b = 5.0;
        double resultado = 3 * a + b - 6/a;
        System.out.println("El resultado del apartado 'a' es: " + resultado);
        //b)
        a = 4.0;
        b = 5.0;
        double c = 1.0;
        resultado = b * a - b * b/4 * c;
        System.out.println("El resultado del apartado 'b' es: " + resultado);
        //c)
        a = 4.0;
        b = 5.0;
        resultado = (a * b)/9;
        System.out.println("El resultado del apartado 'c' es: " + resultado);
        //d)
        a = 4.0;
        b = 5.0;
        c = 1.0;
        resultado = (((b + c)/2 * a + 10) * 3 * b) - 6;
        System.out.println("El resultado del apartado 'd' es: " + resultado);
        //e)
        a = 4.0;
        c = 1.0;
        boolean resultadoE = 3 > a && c/2 != 0.5;
        System.out.println("El resultado del apartado 'e' es: " + resultadoE);
        //f)
        a = 4.0;
        b = 2.0;
        c = 20.0;
        boolean resultadoF = (a + b)/2 >= 3 || c !=20;
        System.out.println("El resultado del apartado 'f' es: " + resultadoF);
        //g)
        resultado = 5 + 25 % 2;
        System.out.println("El resultado del apartado 'g' es: " + resultado);
        //h)
        resultado = (5+25) % 2;
        System.out.println("El resultado del apartado 'h' es: " + resultado);
        //i)
        resultado = 5 + 25/10;
        System.out.println("El resultado del apartado 'i' es: " + resultado);
        //j)
        resultado = -2 * 2;
        System.out.println("El resultado del apartado 'j' es: " + resultado);
        //k)
        resultado = (-2) * 2;
        System.out.println("El resultado del apartado 'k' es: " + resultado);
        //l)
        resultado = - (2 * 2);
        System.out.println("El resultado del apartado 'l' es: " + resultado);
        //m)
        resultado = - Math.pow(2,2);
        System.out.println("El resultado del apartado 'm' es: " + resultado);
        //n)
        resultado = Math.pow(-2,2);
        System.out.println("El resultado del apartado 'n' es: " + resultado);
        //ñ)
        resultado = - (Math.pow(2,2));
        System.out.println("El resultado del apartado 'ñ' es: " + resultado);
    }
}