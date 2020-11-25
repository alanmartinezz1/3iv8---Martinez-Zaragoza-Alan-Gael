import javax.swing.JOptionPane;

public class Prestamo extends Libreria{

    int libro, prestamos, op;

    public void pedirDatos(){

        try{
        libro = Integer.parseInt(JOptionPane.showInputDialog("Libros disponibles: "
                                              +"\n1. " + Libro[0] + ": " + Ejemplares[0]
                                              +"\n2. " + Libro[1] + ": " + Ejemplares[1]
                                              +"\n3. " + Libro[2] + ": " + Ejemplares[2]
                                              +"\nDigite el libro a solicitar. "));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
        }
        
        if(libro == 1){
            JOptionPane.showMessageDialog(null, "Disfrute " + Libro[0] + " de " + Autor[0] +" y recuerde regresarlo a tiempo. :))");
            prestamos = Ejemplares[libro-1] - 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestamos+ " ejemplares");
        }else if(libro == 2){
            JOptionPane.showMessageDialog(null, "Disfrute " + Libro[1] + " de " + Autor[1] +" y recuerde regresarlo a tiempo. :))");
            prestamos = Ejemplares[libro-1] - 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestamos+ " ejemplares");
        }else if(libro == 3){
            JOptionPane.showMessageDialog(null, "Disfrute " + Libro[2] + " de " + Autor[2] +" y recuerde regresarlo a tiempo. :))");
            prestamos = Ejemplares[libro-1] - 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestamos+ " ejemplares");
        }

        
    }
}