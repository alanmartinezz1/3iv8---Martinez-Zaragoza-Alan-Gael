import java.util.*;

public class Principal{

    public static void main(String[] args){

        char letra;
        Scanner entrada = new Scanner(System.in);

        do{

        Partida m1 = new Partida();
        m1.iniciarJuego();

        System.out.println("Si desea repetir presione s");
        letra = entrada.next().charAt(0);

        }while(letra == 's');

        System.out.println("Bien jugado, ahora vuelve al trabajo. unu");
    }

}