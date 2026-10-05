public class Actividad2 {
    public static void main(String[] args) {
        //a)
        double x = 1.0;
        double y = 4.0;
        double z = 10.0;
        double pi = 3.141592;
        double e = 2.718281;
        double resultado = 2 * x + 0.5 * y - 1 / 5 * z;
        System.out.println("El resultado del apartado 'a' es: " + resultado);
        //b)
        boolean resultadoB = pi * x * x > y ^ 2 * pi * x <= z;
        System.out.println("El resultado del apartado 'b' es: " + resultadoB);
        //c)
        resultado = Math.pow(e , (x - 1)) / (x * z) / (x / z);
        System.out.println("El resultado del apartado 'c' es: " + resultado);
        //d)
        boolean resultadoD = "DON" + "JUAN" == "DON JUAN" || "A" == "a";
        System.out.println("El resultado del apartado 'd' es: " + resultadoD);
        //e)
        resultado = x-y+z+pi-e+2.576689;
        System.out.println("El resultado del apartado 'e' es: " + resultado);
        //f)
        resultado = -3*x+2*y-1/2*z;
        System.out.println("El resultado del apartado 'f' es: " + resultado);
        //g)
        resultado = 2* Math.pow(y,2)-6*y+12;
        System.out.println("El resultado del apartado 'g' es: " + resultado);
        //h)
        resultado = (Math.pow(y,(2*x)-6*(z/10)))/2;
        System.out.println("El resultado del apartado 'h' es: " + resultado);
        //i)
        boolean resultadoI = x > 3 && (y == Math.pow(4, x)+y && y <=z && Math.pow(4, x)+y <=z);
        System.out.println("El resultado del apartado 'i' es: " + resultadoI);
        //j)
        boolean resultadoJ = "METODO" + "LOGIA" != "LOGIA" + "METODO";
        System.out.println("El resultado del apartado 'j' es: " + resultadoJ);
    }
}
