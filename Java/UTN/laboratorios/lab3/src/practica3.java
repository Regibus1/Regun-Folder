import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        int cartaJugador1, cartaJugador2, paloJugador1, paloJugador2;
        int puntosJugador1 = 0, puntosJugador2 = 0, ganadorJuego;

        System.out.println("Este es un juego de cartas españolas!");
        System.out.println("Cada jugador recibirá un carta.");
        System.out.println("El que tengo el numero mas alta gana la ronda");
        System.out.println("Se decide el ganador en dos rondas");
        System.out.println(" ");

        for (int i = 0; i < 2; i++) {
            cartaJugador1 = (int) (Math.random() * 10) + 1;
            paloJugador1 = (int) (Math.random() * 3) + 1;

            cartaJugador2 = (int) (Math.random() * 10) + 1;
            paloJugador2 = (int) (Math.random() * 3) + 1;

            switch (paloJugador1) {
                case 1:
                    System.out.println("Carta del jugador 1 es un " + cartaJugador1 + " de Copa");
                    break;
                case 2:
                    System.out.println("Carta del jugador 1 es un " + cartaJugador1 + " de Bastos");
                    break;
                case 3:
                    System.out.println("Carta del jugador 1 es un " + cartaJugador1 + " de Espadilla");
                    break;
                case 4:
                    System.out.println("Carta del jugador 1 es un " + cartaJugador1 + " de Oro");
                    break;
                default:
                    System.out.println("Error en el cdigo 001");
            }

            switch (paloJugador2) {
                case 1:
                    System.out.println("Carta del jugador 2 es un " + cartaJugador2 + " de Copa");
                    break;
                case 2:
                    System.out.println("Carta del jugador 2 es un " + cartaJugador2 + " de Basto");
                    break;
                case 3:
                    System.out.println("Carta del jugador 2 es un " + cartaJugador2 + " de Espadilla");
                    break;
                case 4:
                    System.out.println("Carta del jugador 2 es un " + cartaJugador2 + " de Oro");
                    break;
                default:
                    System.out.println("Error en el cdigo 001");
            }

            if (cartaJugador1 > cartaJugador2) {
                puntosJugador1 = cartaJugador1 + cartaJugador2 + paloJugador1 + paloJugador2;

            } else {
                if (cartaJugador2 > cartaJugador1) {
                    puntosJugador2 = cartaJugador2 + cartaJugador1 + paloJugador2 + paloJugador1;
                } else {
                    if (paloJugador1 == 4) {
                        puntosJugador1 = cartaJugador1 + cartaJugador2 + paloJugador1 + paloJugador2;
                    } else {
                        if (paloJugador2 == 4) {
                            puntosJugador2 = cartaJugador2 + cartaJugador1 + paloJugador2 + paloJugador1;
                        } else {
                            puntosJugador1 = cartaJugador1 + paloJugador1;
                            puntosJugador2 = cartaJugador2 + paloJugador2;
                        }
                    }
                }
            }
        }
        if(puntosJugador1>puntosJugador2){
            ganadorJuego = 1;
        }
        else {
            ganadorJuego = 2;
        }
        System.out.println("Ganador del juego es el Jugador "+ ganadorJuego);
    }
}
