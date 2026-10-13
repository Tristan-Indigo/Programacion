public class quinielaRandom {
    public static void main(String[] args) {
        //Realiza un programa para rellenar una quiniela al azar,
        //el programa muestra un 1, una X o un 2 pero,
        //haciendo que la probabilidad de que salga un 1 sea de 1/2,
        //la probabilidad de que salga X sea de 1/3
        //y la probabilidad de que salga 2 sea de 1/6.
        //Pista: 1/2 = 3/6 y 1/3 = 2/6.
        int numero = 0;
        numero = (int)(Math.random() * 6) + 1;
        System.out.println(numero);
        //if (numero == 1) {1/6}
    }
}
