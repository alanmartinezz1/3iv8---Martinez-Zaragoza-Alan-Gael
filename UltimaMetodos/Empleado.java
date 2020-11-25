import javax.swing.JOptionPane;

public class Empleado extends Sueldos{

    private int sueldo, nocturnas, diurnas;

    public Empleado(String nombre_empleado, String puesto, float ID_empleado, int sueldo){
        //tenemos que utilizar la palabra reservada super, para poder acceder a 
        //los atributos de la clase padre
        super(nombre_empleado, puesto, ID_empleado);
        //acceso a la variable propia de la clase
        this.sueldo = sueldo;
    }

        


    //recibe obtiene
    public int getSueldo(){
        try{
        nocturnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras nocturas trabajadas."));
        nocturnas = nocturnas*60;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
        }

        try{
        diurnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras nocturas trabajadas."));
        diurnas = diurnas*50;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
        }

        sueldo = 5000 + nocturnas + diurnas;
        return sueldo;
    }
    //envia u establecer
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }

    //el metodo para poder visualizar los datos

    public void mostrarEmpleado(){
        JOptionPane.showMessageDialog(null,"Sr. " + getNombre()
                            + ", usted como Empleado "
                            + ", su ID es " + getIDempleado()
                            + " y gana " + getSueldo()
                            + " pesos MX ");
    }
}