public class escalera {
    public static void main(String[] args) {
        final int MAX = 4;
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}