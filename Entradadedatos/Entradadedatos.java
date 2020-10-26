//vamos a crear un archivo que se encargue de poder obtener un texto como entrada
// de datos

class Entradadedatos{
    //cuerpo principal del programa
    public static void main(String[ ] args){
        //primero variables
        String nombre;
        System.out.println("Por favor, dime tu nombre *w*: ");
        //queremos obtener el nombre de la entrada estandar de la computadora
        //¿quien es la entrada estandar?
        //teclado, a partir de la línea del comando (terminal)

        //primera forma para obtener un texto
        nombre = System.console().readLine();

        System.out.println("Hola " +nombre+ " bienvenido a tu segundo programa");
    }
}