import java.util.Scanner;
public class batalla {
    public static void main(String[] args) {
        //Hacer batalla entre un enemigo y un jugador
        //Añadir critico random (para enemigo y jugador)
        //Añadir ataques (normal y fuerte)
        //Vida juador = 20
        //Vida enemigo = 20
        int vidaEnemigo = 20;
        int vidaJugador = 20;
        String eleccion;
        int eleccionEnemigo = 0;
        int ataque = 0;
        int critico = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Batalla!");
        while (vidaEnemigo > 0 && vidaJugador > 0) {
            System.out.println("Vida enemigo = " + vidaEnemigo);
            System.out.println("Vida jugador = " + vidaJugador);
            eleccion = "";
            System.out.println("Turno del jugador");
            while (eleccion != "normal" && eleccion != "fuerte") {
                System.out.print("Elija ataque (normal | fuerte): ");
                eleccion = sc.next();
                critico = (int)(Math.random() * 2 + 1);
                if (eleccion.equalsIgnoreCase("normal")) {
                    if (critico == 2) {
                        System.out.println("Golpe critico!");
                    }
                    ataque = 1 * critico;
                    eleccion = "normal";
                } else if (eleccion.equalsIgnoreCase("fuerte")) {
                    if (critico == 2) {
                        System.out.println("Golpe critico!");
                    }
                    ataque = 2 * critico;
                    eleccion = "fuerte";
                } else {
                    System.out.println("Eleccion incorrecta");
                    eleccion = "";
                }
            }
            vidaEnemigo-=ataque;
            if (vidaJugador > 0 && vidaEnemigo > 0) {
                System.out.println("Vida enemigo = " + vidaEnemigo);
                System.out.println("Vida jugador = " + vidaJugador);
                System.out.println("Turno del enemigo");
                eleccionEnemigo = (int)(Math.random() * 2 + 1);
                critico = (int)(Math.random() * 2 + 1);
                if (eleccionEnemigo == 1) {
                    System.out.println("El enemigo eligio un ataque normal");
                    if (critico == 2) {
                        System.out.println("Golpe critico...del enemigo");
                    }
                    ataque = 1 * critico;
                } else {
                    System.out.println("El enemigo eligio un ataque fuerte");
                    if (critico == 2) {
                        System.out.println("Golpe critico...del enemigo");
                    }
                    ataque = 2 * critico;
                }
                vidaJugador-=ataque;
            }
        }
        if (vidaEnemigo <= 0) {
            System.out.println("Vida enemigo = " + vidaEnemigo);
            System.out.println("Vida jugador = " + vidaJugador);
            System.out.println("Ganaste");
        } else {
            System.out.println("Vida enemigo = " + vidaEnemigo);
            System.out.println("Vida jugador = " + vidaJugador);
            System.out.println("Perdiste");
        }
        sc.close();
    }
}