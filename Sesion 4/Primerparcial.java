import java.util.Scanner;
import javax.swing.JOptionPane;

class Primerparcial{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int edad, opcion, num, exp, digito, temp, base, altura, lado, n;
        char letra, socios, temperatura, convertir, producto, operacion;
        double binario, resultado, num1, num2;
        
    do{
       
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Descuento de abono. ");
        System.out.println("2.- Decimal a binario. ");
        System.out.println("3.- Temperatura. ");
        System.out.println("4.- Serie de numeros. ");
        System.out.println("5.- Productos. ");
        System.out.println("6.- Area, perimetro y volumen. ");
        System.out.println("7.- Tabla. ");
        System.out.println("8.- Factoriales. ");
        System.out.println("9.- Cuadrado ");
        System.out.println("10.- Cuadrado hueco ");
        System.out.println("11.- Patron ");
        System.out.println("12.- Diamante ");
        System.out.println("13.- Calculadora");
        System.out.println("14.- Salir ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
            do{ 
                System.out.println("Bienvenido. Por favor, ingrese su edad: ");
                edad = entrada.nextInt();

                if (edad >= 65){
                    System.out.println("Recibirá un descuento del 40% en su abono. ");
                } else if (edad <= 21){
                  System.out.println("Coloque x si sus padres son socios: ");
                  socios = entrada.next().charAt(0);

                    if (socios == 'x'){
                        System.out.println("Recibirá un descuento del 45% en su abono. ");
                    } else if (socios != 'x'){
                        System.out.println("Recibirá un descuento del 25% en su abono. ");
                    } 
                
                } 
                if (edad >= 22){
                    if (edad <= 64){
                    System.out.println("Lamentablemente usted no aplica para ningun descuento. ");
                }}

                System.out.println("Si desea repetir el ejercicio, ingrese una a");
                letra = entrada.next().charAt(0);

            }while (letra == 'a');
                break;

            case 2:
            do{
                do{ 
                    System.out.print("Introduce un numero entero positivo para convertir a binario: ");                                                
                    num = entrada.nextInt();
                }while(num < 0);
        
                exp = 0;
                binario = 0;
                while(num != 0){
                        digito = num % 2;           
                        binario = binario + digito * Math.pow(10, exp);                                                   
                        exp++;
                        num = num/2;
                }
                System.out.println("La conversion es igual a: " +binario);

                System.out.println("Si desea repetir el ejercicio, ingrese una a");
                letra = entrada.next().charAt(0);

            }while(letra == 'a');
                break;

            case 3:
            do{
                temp = 0;
                
                System.out.println("Digite la temperatura.");
                temp = entrada.nextInt();
                
                System.out.println(" ");
                System.out.println("C = Celsius. F = Farenheit. K = Kelvin. R = Rankine.");
                System.out.println(" ");
                System.out.println("Escriba la unidad de temperatura inicial: ");
                temperatura = entrada.next().charAt(0);

                System.out.println("Escriba la unidad en que se convertir:");
                convertir = entrada.next().charAt(0);
                
                if(temperatura == 'C' & convertir == 'C')
                    {
                        System.out.println("El valor es el mismo.");
                    }
                    else if(temperatura == 'C' & convertir == 'F')
                    {
                        resultado = (temp*9)/5+32;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertir == 'K')
                    {
                        resultado = temp+273.15;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertir == 'R')
                    {
                        resultado = (temp*9)/5+491.67;
                        System.out.println("El resultado es: " + resultado);
                    }

                    if(temperatura == 'F' & convertir == 'F')
                    {
                        System.out.println("El valor es el mismo.");
                    }
                    else if(temperatura == 'F' & convertir == 'C')
                    {
                        resultado = 5*(temp-32)/9;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertir == 'K')
                    {
                        resultado = 5*(temp-32)/9+273.15;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertir == 'R')
                    {
                        resultado = temp+459.67;
                        System.out.println("El resultado es: " + resultado);
                    }

                    if(temperatura == 'K' & convertir == 'K')
                    {
                        System.out.println("El valor es el mismo.");
                    }
                    else if(temperatura == 'K' & convertir == 'F')
                    {
                        resultado = (temp-273.15)*9/5+32;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertir == 'C')
                    {
                        resultado = temp*-273.15;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertir == 'R')
                    {
                        resultado = temp*1.8;
                        System.out.println("El resultado es: " + resultado);
                    }

                    if(temperatura == 'R' & convertir == 'R')
                    {
                        System.out.println("El valor es el mismo.");
                    }
                    else if(temperatura == 'R' & convertir == 'F')
                    {
                        resultado = temp-459.67;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertir == 'K')
                    {
                        resultado = (temp*5)/9;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertir == 'C')
                    {
                        resultado = (temp-491.67)*5/9;
                        System.out.println("El resultado es: " + resultado);
                    }

                    System.out.println("Si desea repetir el ejercicio, ingrese una a");
                        letra = entrada.next().charAt(0);

            }while(letra == 'a');

                break;

            case 4:
            int positivos = 0;
            int negativos = 0;
            int total = 0;
            int totalnum;
            
            do{

                System.out.println("Inserte la cantidad de numeros que quiere digitar.");
    
                total = entrada.nextInt();
    
                do{
                    System.out.println("Digite el numero");
    
                    totalnum = entrada.nextInt();
    
                    if(totalnum == 0){
                        positivos = positivos+0;
                    } else { 
                        if(totalnum>0){
                                positivos = positivos +1;
                        }else{
                            negativos = negativos+1;
                        }
                    }
    
                    total = total-1;
                
                }while (total!=0);
    
                    System.out.println("El total de positivos es: " + positivos);
                    System.out.println("El total de negativos es: " + negativos);
            
                    System.out.println("Si desea repetir el ejercicio, ingrese una a");
                    letra = entrada.next().charAt(0);

            }while(letra == 'a');
                    
                break;

            case 5:

            int P = 12;
            int R = 17;
            int A = 13;
            int G = 16;
            
            do{

                System.out.println("Bienvenido, a continuación se le mostrará la lista de productos");
                System.out.println("");
                System.out.println("P: Papas 12 $, R: Refresco 17 $, A: Agua natural 13 $, G: Galletas 16 $");
                System.out.println("");

                System.out.println("Ingrese la cantidad de papas a comprar");
                digito = entrada.nextInt();

                resultado = digito * P;
                num = digito;

                System.out.println("Ingrese la cantidad de refrescos a comprar");
                digito = entrada.nextInt();

                resultado = (digito * R) + resultado;
                num = digito + num;

                System.out.println("Ingrese la cantidad de botellas de agua a comprar");
                digito = entrada.nextInt();

                resultado = (digito * A) + resultado;
                num = digito + num;

                System.out.println("Ingrese la cantidad de galletas a comprar");
                digito = entrada.nextInt();

                resultado = (digito * G) + resultado;
                num = digito + num;

                System.out.println("Su total de productos es de "+num );
                System.out.println("Su total a pagar es de "+resultado );

                System.out.println("Si desea repetir el ejercicio, ingrese una a");
                letra = entrada.next().charAt(0);

            }while(letra == 'a');
                break;

            case 6:
            
            do{

                System.out.println("Elija la opcion deseada: ");
                System.out.println("1.- Calcular el area de un triangulo ");
                System.out.println("2.- Calcular el perimetro de un triangulo ");
                System.out.println("3.- Calcular el area de un rectangulo ");
                System.out.println("4.- Calcular el perimetro de un rectangulo ");
                System.out.println("5.- Calcular el volumen de una esfera ");
                System.out.println("6.- Calcular el volumen de un cilindro ");
                System.out.println("7.- Salir ");
        
                opcion = entrada.nextInt();
        
                switch (opcion) {
        
                    case 1:
                        System.out.println("Ingresa el valor de la base");
                        base = entrada.nextInt();
        
                        System.out.println("Ingresa el valor de la altura");
                        altura = entrada.nextInt();
        
                        resultado = (base*altura)/2;
        
                        System.out.println("El area del triangulo es de: "+resultado);
                        break;
        
                    case 2:
                        System.out.println("Ingresa el valor de la base");
                        base = entrada.nextInt();
        
                        System.out.println("Ingresa el valor del primer lado");
                        altura = entrada.nextInt();
        
                        System.out.println("Ingresa el valor del segundo lado");
                        lado = entrada.nextInt();
        
                        resultado = base+altura+lado ;
        
                        System.out.println("El perimetro del triangulo es de: "+resultado);
                        break;
        
                    case 3:
                        System.out.println("Ingresa el valor de la base");
                        base = entrada.nextInt();
        
                        System.out.println("Ingresa el valor de la altura");
                        altura = entrada.nextInt();
        
                        resultado = (base*altura);
        
                        System.out.println("El area del rectangulo es de: "+resultado);
                        break;
        
                    case 4:
                        System.out.println("Ingresa el valor de la base");
                        base = entrada.nextInt();
        
                        System.out.println("Ingresa el valor de la altura");
                        altura = entrada.nextInt();
        
                        resultado = (base*2)+(2*altura);
        
                        System.out.println("El perimetro del rectangulo es de: "+resultado);
                        break;

                    case 5:
                        System.out.println("Ingresa el valor del radio");
                        base = entrada.nextInt();
        
                        resultado = (4/3)*3.1416*(base^3);
        
                        System.out.println("El volumen de la esfera es de: "+resultado);
                        break;
        
                    case 6:
                        System.out.println("Ingresa el valor del radio");
                        base = entrada.nextInt();
        
                        System.out.println("Ingresa el valor de la altura");
                        altura = entrada.nextInt();
        
                        resultado = 3.1416*(base*base)*altura;
        
                        System.out.println("El volumen del cilindro es de: "+resultado);
                        break;
        
                    default:
                        System.out.println("Gracias por participar. :)");

                    }
                    System.out.println("Si desea repetir el ejercicio, ingrese una a");
                    letra = entrada.next().charAt(0);
            }while(letra == 'a');
                break;

            case 7:

            do{

                System.out.println("");
                System.out.println("\tN\t\t\t");
                System.out.println("\t1\t10\t100\t1000");
                System.out.println("\t2\t20\t200\t2000");
                System.out.println("\t3\t30\t300\t3000");
                System.out.println("\t4\t40\t400\t4000");
                System.out.println("\t5\t50\t500\t5000");
                System.out.println("\t6\t60\t600\t6000");
                System.out.println("\t7\t70\t700\t7000");
                System.out.println("\t8\t80\t800\t8000");
                System.out.println("\t9\t90\t900\t9000");
                System.out.println("\t10\t100\t1000\t10000");
                System.out.println("");
                System.out.println("Si desea repetir el ejercicio, ingrese una a");
                letra = entrada.next().charAt(0);

            }while(letra == 'a');

                break;

            case 8:

            do{

                System.out.println("Escriba un numero entero positivo para calcular su factorial ");
                n = entrada.nextInt();

                int factorial = 1;

                do{
                    factorial = factorial*n;
                    n= n-1;
                    }while(n!=0);

                    System.out.println("La factorial es igual a " +factorial);

                    System.out.println("Si desea repetir el ejercicio, ingrese una a");
                    letra = entrada.next().charAt(0);
            }while(letra == 'a');
                break;

            case 9:
                System.out.println("Trabajando en ello :D");
                
                break;

            case 10:
                System.out.println("Trabajando en ello :D");
                
                break;

            case 11:
                System.out.println("Trabajando en ello :D");
                
                break;

            case 12:
                System.out.println("Trabajando en ello :D");
                
                break;

            case 13:

            do{
                System.out.println("Digite el primer numero de la operacion.");
                num1 = entrada.nextDouble();
                System.out.println("Digite el segundo numero de la operacion.");
                num2 = entrada.nextDouble();

                System.out.println("Suma = s, Resta = r, mulitiplicacion = m, division = d. ");
                System.out.println("Escriba que operacion desea realizar.");
                operacion = entrada.next().charAt(0);

                    switch(operacion){
                        case 's':
                            resultado=num1+num2;
                            System.out.println("El resultado de la suma es: " + resultado +".");
                        break;
                        case 'r':
                            resultado=num1-num2;
                            System.out.println("El resultado de la resta es: " + resultado +".");
                        break;
                        case 'd':
                            resultado=(num1)/(num2);
                            System.out.println("El resultado de la division es: " + resultado +".");
                        break;
                        case 'm':
                            resultado=num1*num2;
                            System.out.println("El resultado de la multiplicacion es: " + resultado +".");
                        break;
                        default:
                    }
                System.out.println("Si desea repetir el proceso, por favor presione la tecla a.");
                letra = entrada.next().charAt(0);
            }while(letra == 'a');

                break;

            default:
                System.out.println("Gracias por participar. :) ");
                
        }

        System.out.println("¿Deseas regresar al menu?, si lo desea escriba s");
        
        letra = entrada.next().charAt(0);

    }while(letra == 's');
        
    }
}