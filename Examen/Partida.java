import java.util.*;

public class Partida extends Buscaminas{

    private int contador = 0;
    private String coor;

    public void iniciarJuego(){
        for(int x = 0; x < 22; x++){

        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 5; i++){
                    tablero[j][i] = contador;
                    System.out.print("[" + tablero[j][i] + "]");
            }
            System.out.println("");
        }
        try{
        try{
        System.out.println("Por favor, ingrese un punto en el eje x (Solo valores del 1 al 5)");
        casillax = entrada.nextInt();

        System.out.println("Por favor, ingrese un punto en el eje y (Solo valores del 1 al 5)");
        casillay = entrada.nextInt();

        System.out.println("");

        casillax = casillax - 1;
        casillay = casillay - 1;

        if(casillax == bomba && casillay == bomba2){
                System.out.println("b1: Bum, tas morido.");
                System.exit(0);

        }else if((casillax == bomba && casillay != bomba2) || (casillax != bomba && casillay == bomba2)){
                System.out.println("b1: Cuidado, hay bomba cerca. o.O");
                tablero[casillay][casillax] = 1;
        }else{
                System.out.println("b1: todo chill, estas a salvo. uwu");
                tablero[casillay][casillax] = 1;
        }

        if(casillax == bomba3 && casillay == bomba4){
                System.out.println("b2:Bum, tas morido.");
                System.exit(0);
        }else if((casillax == bomba3 && casillay != bomba4) || (casillax != bomba3 && casillay == bomba4)){
                System.out.println("b2: Cuidado, hay bomba cerca. o.O");
                tablero[casillay][casillax] = 1;
        }else{
                System.out.println("b2: todo chill, estas a salvo. uwu");
                tablero[casillay][casillax] = 1;
        }

        if(casillax == bomba5 && casillay == bomba6){
                System.out.println("b3: Bum, tas morido.");
                System.exit(0);
        }else if((casillax == bomba5 && casillay != bomba6) || (casillax != bomba5 && casillay == bomba6)){
                System.out.println("b3: Cuidado, hay bomba cerca. o.O");
                tablero[casillay][casillax] = 1;
        }else{
                System.out.println("b3: todo chill, estas a salvo. uwu");
                tablero[casillay][casillax] = 1;
        }

        System.out.println("");

    }catch(Exception e){
        System.out.println("Ingresa valores posibles");
        System.out.println("Error: "+ e.getMessage());
    }
    }catch(ArrayIndexOutOfBoundsException excepcion){
        System.out.println("Ingresa valores posibles");
        System.out.println("Error: Error de índice en un array");
    }
        
    }
    }
}