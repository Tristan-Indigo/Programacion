public class escaleraPiramide {
    public static void main(String[] args) { 
        final int MAX = 4;
        for (int i = 1; i <= MAX; i++) {
            for (int j = MAX * 3 - i * 3; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + "  ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + "  ");
            }
            System.out.println();
        }
    }
}