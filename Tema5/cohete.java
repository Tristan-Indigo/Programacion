public class cohete {
    public static void main(String[] args) {
        int cuenta = 5;
        while (cuenta > 0) {
            System.out.println(cuenta + "...");
            cuenta--;
        }
        System.out.println("¡Despegue!" /*+ (char) 0x1F680*/);
        //Todavia no se explico como poner emojis en java
    }
}