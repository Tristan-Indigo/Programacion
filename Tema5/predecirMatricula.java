public class predecirMatricula {
    public static void main(String[] args) {
        //7% = (x*7)/100
        int matricula = 10000;
        int años = 0;
        while (matricula < 2 * 10000) {
            matricula+=(10000*7)/100;
            años++;
        }
        System.out.println("La matrícula se duplicará en " + años + " años");
    }
}
