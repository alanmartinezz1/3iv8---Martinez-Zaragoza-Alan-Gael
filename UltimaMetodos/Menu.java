//libreria
import javax.swing.JOptionPane;

public class Menu{

    //metodo principal
    public static void main(String[] args){

        int op, letra;
        
        JOptionPane.showMessageDialog(null,"Martinez Zaragoza Alan Gael, 3IV8 ");

        do{

            try{
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un programa. \n1. Sueldo. \n2. Productos. \n3.Libros. "));

            switch(op){

            case 1:
                try{
                op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione su puesto. \n1. Jefe. \n2. Empleado. "));
                switch(op){
                    case 1:
                        Jefe m1 = new Jefe("", "", 0, 8000);
                        m1.mostrarJefe();
                        break;
                    case 2:
                        Empleado m2 = new Empleado("", "", 0, 500);
                        m2.mostrarEmpleado();
                        break;
                }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
                }
                break;
            case 2:
                    Prove2res m3 = new Prove2res();
                    m3.pedirysuma();
                break;
            case 3:
                try{
                op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione su puesto. \n1. Prestamo. \n2. Devolver. "));
                switch(op){
                case 1:
                    Prestamo m4 = new Prestamo();
                    m4.pedirDatos();
                    break;
                case 2:
                    Devolver m5 = new Devolver();
                    m5.pedirDatos2();
                    break;
                }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
                }
                break;
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
            }
            letra = Integer.parseInt(JOptionPane.showInputDialog("Si desea regresar al menu presione 2. "));
            
        }while(letra == 2);

        JOptionPane.showMessageDialog(null,"Gracias por ver. uwu");
    }

}