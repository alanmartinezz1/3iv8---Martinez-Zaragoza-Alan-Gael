import javax.swing.JOptionPane;

public class Devolver extends Libreria{

    int libro, prestados;

    public void pedirDatos2(){
        
        try{
        libro = Integer.parseInt(JOptionPane.showInputDialog("Qu\u00e9 libro regresar\u00e1?: "
                                           +"\n1. " + Libro[0] + ": " + Ejemplares[0]
                                           +"\n2. " + Libro[1] + ": " + Ejemplares[1]
                                           +"\n3. " + Libro[2] + ": " + Ejemplares[2]));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
        }

        if(libro == 1){
            JOptionPane.showMessageDialog(null, "Gracias por devolver " + Libro[0] + " de " + Autor[0] +", vuelva pronto. :))");
            prestados = Ejemplares[libro-1] + 1; 
            JOptionPane.showMessageDialog(null, "Quedan "+prestados+ " ejemplares");
        }else if(libro == 2){
            JOptionPane.showMessageDialog(null, "Gracias por devolver " + Libro[1] + " de " + Autor[1] +", vuelva pronto. :))");
            prestados = Ejemplares[libro-1] + 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestados+ " ejemplares");
        }else if(libro == 3){
            JOptionPane.showMessageDialog(null, "Gracias por devolver " + Libro[2] + " de " + Autor[2] +", vuelva pronto. :))");
            prestados = Ejemplares[libro-1] + 1;
            JOptionPane.showMessageDialog(null, "Quedan "+prestados+ " ejemplares");
        }
    
    }

}