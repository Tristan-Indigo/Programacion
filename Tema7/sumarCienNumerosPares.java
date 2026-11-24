public class sumarCienNumerosPares {
    public static void main(String[] args) {
        int listaNumeros[] = new int[201];
        int resultado[] = new int[1];
        int numero = 0;
        for (numero = 0; numero < 201; numero++) {
            if (numero % 2 == 0) {
                listaNumeros[numero] = numero;
            }
        }
        numero = 0;
        while (numero < 201) {
            resultado[0] += listaNumeros[numero];
            numero++;
        }
        System.out.print("La suma de los 100 primeros numeros pares es: " + resultado[0]);
    }
}