import java.util.Scanner;

class Pokedex{


    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int opcion, Charmander, Bulbasaor, Squartle, dano, vida, dano2, vida2, intensidad;
        char letra, letra2, ataque;

    do{
        //el cuerpo del programa
        System.out.println("3IV8, Martínez Zaragoza Alan Gael.");
        System.out.println("Bienvenido a tu pokedex, por favor elige un pokemon para iniciar. ");
        System.out.println("1.- Charmander ");
        System.out.println("2.- Bulbasaor ");
        System.out.println("3.- Squartle ");
        System.out.println("4. Batalla");
        System.out.println("5.- Salir ");

        //asignar la opcion

        opcion = entrada.nextInt();

        if (opcion == 1){
            System.out.println("\t id \t nombre \t fuerza \t defensa \t vida \t ataque principal \t ataque secundario. ");
            System.out.println("\t 001 \t Charmander \t 350 \t \t 670 \t \t 1200 \t Bola de fuego \t \t patada");
        } else if (opcion == 2){
            System.out.println("\t id \t nombre \t fuerza \t defensa \t vida \t ataque principal \t ataque secundario. ");
            System.out.println("\t 002 \t Bulbasaor \t 310 \t \t 700 \t \t 1200 \t Polvo venenoso \t \t Gruñido");
        } else if (opcion == 3){
            System.out.println("\t id \t nombre \t fuerza \t defensa \t vida \t ataque principal \t ataque secundario. ");
            System.out.println("\t 003 \t Squartle \t 380 \t \t 650 \t \t 1200 \t Salpicar agua \t \t patada");
        }

        if (opcion == 4){
            System.out.println("Escriba el nombre de un Pokemon.");
            System.out.println("Charmander, Bulbasaor, Squartle.");
            letra = entrada.next().charAt(0);
            System.out.println("Escriba el nombre de un Pokemon.");
            System.out.println("Charmander, Bulbasaor, Squartle.");
            letra2 = entrada.next().charAt(0);
            
            if (letra == "Charmander"){
                if (letra2 == "Charmander"){
                    System.out.println("Elige un ataque.");
                    System.out.println("Bola de fuego, Patada");
                    ataque = entrada.next().charAt(0);
                    System.out.println("Escriba un numero");
                    intensidad = entrada.nextInt();

                    vida = 1200;
                    vida2 = 1200;

                    dano2 = (intensidad*1200)/20;
                    vida2 = vida2 - dano2;

                    System.out.println("Charmander recibió "+dano2+" de daño de tu pokemon");
                    System.out.println("Le queda "+vida2+" de vida");
                    System.out.println("Escriba un numero");
                    intensidad = entrada.nextInt();

                    dano = (intensidad*1200)/20;
                    vida = vida - dano;

                    System.out.println("Charmander recibió "+dano+" de daño de tu pokemon");
                    System.out.println("Le queda "+vida+" de vida");
                }
            }

        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        letra = entrada.next().charAt(0);


    }while(letra == 's');
        
    }
}