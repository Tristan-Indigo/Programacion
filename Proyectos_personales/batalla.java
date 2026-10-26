import java.util.Scanner;
public class batalla {
    public static void main(String[] args) {
        //Hecho:
            //Añadir critico random (para enemigo y jugador)
            //Añadir opcion de atacar
            //Añadir ataques (normal y fuerte)
            //Añadir opcion de huir
        //A medias:
            //Hacer batalla entre un enemigo y un jugador
        //No hecho
            //Añadir probabilidad de fallar al intentar huir
            //Añadir opcion de usar objetos
            //Añadir mas armas
            //Añadir objetos consumibles
            //Añadir objetos equipables
            //Añadir cooldown en ataque fuerte
        //Informacion:
            //Vida juador = 20
            //Vida enemigo = 20
        int vidaEnemigo = 20;
        int vidaJugador = 20;
        String eleccion;
        int eleccionEnemigo = 0;
        int ataque = 0;
        int critico = 1;
        boolean huir = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Batalla!");
        while (vidaEnemigo > 0 && vidaJugador > 0 && huir == false) {
            System.out.println("Vida enemigo = " + vidaEnemigo);
            System.out.println("Vida jugador = " + vidaJugador);
            eleccion = "";
            System.out.println("Turno del jugador");
            System.out.println("Elija: Atacar | Huir");
            eleccion = sc.next();
            if (eleccion.equalsIgnoreCase("atacar")) {
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
            } else if (eleccion.equalsIgnoreCase("huir")) {
                huir = true;
            } else {
                System.out.println("Eleccion incorrecta");
            }
        }
        if (vidaEnemigo <= 0) {
            System.out.println("Vida enemigo = " + vidaEnemigo);
            System.out.println("Vida jugador = " + vidaJugador);
            System.out.println("Ganaste");
        } else if (vidaJugador <= 0) {
            System.out.println("Vida enemigo = " + vidaEnemigo);
            System.out.println("Vida jugador = " + vidaJugador);
            System.out.println("Perdiste");
        } else {
            System.out.println("El jugador decidio huir");
        }
        sc.close();
    }
}