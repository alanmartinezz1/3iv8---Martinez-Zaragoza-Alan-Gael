import java.util.Scanner;

class figurasClasico{

    /*
    vamos a crear un programa que se encargue de realizar
    un menu en el cual se pueda elegir entre calcular
    el area o el perimetro de las siguientes figuras
    triangulo
    cuadrado
    circulo
    actualizacion, ahora quiero que se repita todo el programa
    para volver a calcular otra area,
    como trabajo
    ustedes deben agregar las opciones del perimetro
    y dos figuras mas
    rectangulo pentagono
    */

    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int base, altura, lado, opcion;
        char letra;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado;
    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el area de un cuadrado ");
        System.out.println("2.- Calcular el perimetro de un cuadrado ");
        System.out.println("3.- Calcular el area de un triangulo ");
        System.out.println("4.- Calcular el perimetro de un triangulo ");
        System.out.println("5.- Calcular el area de un circulo ");
        System.out.println("6.- Calcular el perimetro de un circulo ");
        System.out.println("7.- Calcular el area de un rectangulo ");
        System.out.println("8.- Calcular el perimetro de un rectangulo ");
        System.out.println("9.- Calcular el area de un pentagono ");
        System.out.println("10.- Calcular el perimetro de un pentagono ");
        System.out.println("11.- Salir ");

        //asignar la opcion

        opcion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                resultado = base*base;

                System.out.println("El area del cuadrado es de: "+resultado);
                break;

            case 2:
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                resultado = base*4;

                System.out.println("El perímetro del cuadrado es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura)/2;

                System.out.println("El area del triangulo es de: "+resultado);
                break;

            case 4:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor del primer lado");
                altura = entrada.nextInt();

                System.out.println("Ingresa el valor del segundo lado");
                lado = entrada.nextInt();

                resultado = base+altura+lado ;

                System.out.println("El perimetro del triangulo es de: "+resultado);
                break;

            case 5:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                resultado = 3.1416*base*base;

                System.out.println("El area del circulo es de: "+resultado);
                break;

            case 6:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                resultado = (2*3.1416)*base;

                System.out.println("El perimetro del circulo es de: "+resultado);
                break;

            case 7:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura);

                System.out.println("El area del rectangulo es de: "+resultado);
                break;

            case 8:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*2)+(2*altura);

                System.out.println("El perimetro del rectangulo es de: "+resultado);
                break;

            case 9:
                System.out.println("Ingresa el valor del perimetro");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor del apotema");
                altura = entrada.nextInt();

                resultado = (base*altura)/2;

                System.out.println("El area del pentagono es de: "+resultado);
                break;

            case 10:
                System.out.println("Ingresa el numero de lados");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de un lado");
                altura = entrada.nextInt();

                resultado = (base*altura);

                System.out.println("El perimetro del pentagono es de: "+resultado);
                break;

            default:
                System.out.println("Gracias por participar unu nwn/ ");
        

            
                
                
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letra = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
        //char num = 1       1 + 1 = 11

    }while(letra == 's');
        
        //System.out.println(letra);
        
    }
}