public class escaleraInversa {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = (4*3) - (i*3); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }
    }
}
