import java.util.*;
public class Arreglos {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        char letra;
        int opcion;
                   
      do{
      
       System.out.println("Seleccione el programa a ejecutar. ");
       System.out.println("1.- Promedio positivo y negativo. ");
       System.out.println("2.- Pares. ");
       System.out.println("3.- Calificaciones. ");
       System.out.println("4.- Matrices. ");
       System.out.println("5.- Salir. ");
       
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
            Arreglos negpos = new Arreglos();
            do{
                 
                negpos.negpos();
                System.out.println("Si desea repetir el programa presione s. ");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            
            break;
            
            case 2:
            Arreglos pares = new Arreglos();
            do{
                
                pares.pares();
                System.out.println("Si desea repetir el programa presione s. ");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            
            break;
           
            case 3:
            Arreglos cal = new Arreglos();
            do{
                
                cal.cal();
                System.out.println("Si desea repetir el programa presione s. ");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            
            break;

            case 4:
            Arreglos matriz = new Arreglos();
            do{
                
                matriz.matriz();
                System.out.println("Si desea repetir el programa presione s. ");

                letra = entrada.next().charAt(0);
            }while(letra == 's');
            
            break;
            
            default:
            System.out.println("Gracias por ver mi programar. uwu ");

        }

            System.out.println("Si desea regresar al menú presione s. ");

            letra = entrada.next().charAt(0);
            }while(letra == 's');

    }

            public void negpos(){
            
                 Scanner entrada = new Scanner(System.in);
                    int i;
                    int pos = 0, neg = 0; 
                    int[] num = new int[10]; 
                    double sumaPos = 0, sumaNeg = 0;               
                    
                   
                    System.out.println("Digite los valores para su arreglo: ");
                    for (i = 0; i < 10; i++) {
                        System.out.print("numeros[" + i + "]= ");
                        num[i]=entrada.nextInt();
                    }
                    for (i = 0; i < 10; i++) {
                        if (num[i] > 0){ 
                            sumaPos += num[i];
                            pos++;
                        } else if (num[i] < 0){ 
                            sumaNeg += num[i];
                            neg++;
                        }
                    }
            
                    if (pos != 0) {
                        System.out.println("El promedio de los valores positivos es: " + sumaPos / pos);                
                    } else {
                        System.out.println("No ha introducido numeros positivos");
                    }
                    if (neg != 0) {
                        System.out.println("El promedio de los valores positivos es: " + sumaNeg / neg);
                    } else {
                        System.out.println("No ha introducido numeros negativos");
                    }
                }
                
                
            public void pares(){
                    Scanner entrada = new Scanner(System.in);
                    int i;
                    int[] num = new int[10];
                    double prom = 0;
            
                   
                    System.out.println("Escriba un número: ");
                    for (i = 0; i < 10; i++) {
                        System.out.print("numero [" + i + "]= ");
                        num[i] = entrada.nextInt();
                    }
                    
                   
                    for (i = 0; i < 10; i++) {
                        if (i % 2 == 0){ 
                            prom = prom + num[i];
                        }
                    }
                   
                    System.out.println("El promedio de los datos pares es: "+ prom/5);              
            }

            public void cal(){
                    Scanner entrada = new Scanner(System.in);
                    int i;
                    int aprobados = 0;
                    int reprobados = 10;
                    double suma = 0, prom;
                    
                  
                    double[] calif = new double[10]; 
                    
                    for (i = 0; i < calif.length; i++) {
                        System.out.print("Ingrese la calificacion final del alumno" + (i + 1) + ": " );
                        calif[i] = entrada.nextDouble();
                    }
            
                    for (i = 0; i < calif.length; i++) {
                        suma = suma + calif[i];
                    }
            
                    prom = suma / calif.length;
                    
                    System.out.println("");
                    System.out.println("Las calificaciones son: ");
                    for (i = 0; i < calif.length; i++) {
                       
                            System.out.println("Alumno numero " + (i + 1)+ " tiene: " + calif[i]);
                    }
                    System.out.printf("Nota media: %.2f %n", prom);
                    
                    System.out.println("");
                    System.out.println("Listado de notas superiores a la media: ");
                    for (i = 0; i < calif.length; i++) {
                        if (calif[i] > prom) {
                            System.out.println("Alumno numero " + (i + 1) + "con " + calif[i]);
                        }
                    }
                    
                    for (i = 0; i < calif.length; i++) {
                        if (calif[i] >= 6 ) {
                            aprobados= aprobados + 1;
                            
                }
                
            
            }
                reprobados = reprobados - aprobados;   
                System.out.println("");
                System.out.println("alumnos aprobados: "+aprobados);
                System.out.println("Alumnos reprobados: "+reprobados);
            }


            public void matriz(){
                    Scanner entrada = new Scanner(System.in);
                    int a1[][] = new int [3][3];
                    int a2[][] = new int [3][3];
                    int sumas [][] = new int[a1.length][a1.length];

                    float arreglos=0;
                
                    for(int i=0; i<a1.length; i++){
                    
                        for(int j=0; j<a1.length; j++){
                            System.out.println("Ingresa el numero de la fila " + i + " columna " + j + " del arreglo a: ");
                            a1[i][j] = entrada.nextInt();
                            
                }
            }
            for(int i=0; i<a2.length; i++){
            
                for(int j=0; j<a2.length; j++){
                    System.out.println("Ingresa el numero de la fila " + i + " columna " + j + " del arreglo b: ");
                    a2[i][j] = entrada.nextInt();
                }
                    
        }
        int[][] suma = new int[a1.length][a1[0].length];
        for (int i=0; i < a1.length; i++) {
            for (int j=0; j < a1[i].length; j++) {				
              suma[i][j]=a1[i][j]+a2[i][j];		

        }

        }
        for (int i=0; i < sumas.length; i++) {
            System.out.print("|");
            for (int j=0; j < suma[i].length; j++) {
              System.out.print (suma[i][j]);
              if (j!=suma[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
        }
                    
} 
                
            
            
            