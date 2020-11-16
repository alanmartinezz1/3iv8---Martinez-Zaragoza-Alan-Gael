//libreria
import javax.swing.JOptionPane;

public class LTel{

    //variables
    private int cr = 50, op, ct1, r;
    private float ln, li, lc, ct;
    private String  nc;
    //private int dialogButton = JOptionPane.YES_NO_OPTION;

    public void LTel(){

        op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, elija la opcion deseada: \n1.- Calcular costo de llamadas telefonicas \n2.- Consultar crédito \n3.- Recarga. "));
        nc = JOptionPane.showInputDialog("Bienvenido, por favor ingrese su numero telefonico. ");

            switch(op){
                case 1:
                    ln = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese las llamadas nacionales realizadas durante el ultimo mes. "));
                    li = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese las llamadas internacionales realizadas durante el ultimo mes. "));
                    lc = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese las llamadas celulares realizadas durante el ultimo mes. "));     
                    
                    ln = ln * 0.5f;
                    li = li * 0.6f;
                    lc = lc * 0.2f;
                    ct = ln + li + lc;

                    ct1 = (int)ct;
                    cr = cr - ct1;
                    JOptionPane.showMessageDialog(null,"Su total a pagar será de: "+ct+ " pesos MX. ");
                    JOptionPane.showMessageDialog(null,"Su credito es de: "+cr+ " pesos MX. ");
                    /*JOptionPane.showConfirmDialog(null, "¿Desea realizar una recarga?");

                    if(dialogButton == JOptionPane.YES_OPTION){
            
                        r = Integer.parseInt(JOptionPane.showInputDialog("¿De cuanto sera la recarga?"));
                        ct = ct + r;
                        JOptionPane.showMessageDialog(null,"Usted tiene un credito de "+ct+ " pesos MX. ");

                    }
                    if(dialogButton == JOptionPane.NO_OPTION){

                        JOptionPane.showMessageDialog(null,"Vuelva pronto. ");
                    }
                    if(dialogButton == JOptionPane.CLOSED_OPTION){
                        
                    }
                    */

                break;
                case 2:
                    
                    JOptionPane.showMessageDialog(null,"Usted tiene un credito de "+cr+ " pesos MX. ");
                    
                    /*JOptionPane.showConfirmDialog(null, "¿Desea realizar una recarga?");

                    if(dialogButton == JOptionPane.YES_OPTION){
            
                        r = Integer.parseInt(JOptionPane.showInputDialog("¿De cuanto sera la recarga?"));
                        ct = ct + r;
                        JOptionPane.showMessageDialog(null,"Usted tiene un credito de "+ct+ " pesos MX. ");

                    }
                    if(dialogButton == JOptionPane.NO_OPTION){

                        JOptionPane.showMessageDialog(null,"Vuelva pronto. ");
                    }
                    if(dialogButton == JOptionPane.CLOSED_OPTION){

                    }
                    */
                break;
                case 3:

                    r = Integer.parseInt(JOptionPane.showInputDialog("¿De cuanto sera la recarga?"));
                        cr = cr + r;
                    JOptionPane.showMessageDialog(null,"Usted tiene un credito de "+cr+ " pesos MX. ");

                break;
                default:
            

    }
}
}