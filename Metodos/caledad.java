//libreria
import javax.swing.JOptionPane;

public class caledad{

    //variables
    private String texto;
    private int a, a1, edad;

    public void caledad(){

        JOptionPane.showMessageDialog(null,"Bienvenido, siga las instrucciones para determinar su edad. ");
        texto = JOptionPane.showInputDialog("Ingrese su a\u00f1o de nacimiento");

        a = Integer.parseInt(texto);

        if(a<1900 || a>2050){
            JOptionPane.showMessageDialog(null,"Por favor, ingrese un a\u00f1o valido. ");

            JOptionPane.showMessageDialog(null,"Bienvenido, siga las instrucciones para determinar su edad. ");
            texto = JOptionPane.showInputDialog("Ingrese el a\u00f1o de nacimiento");
        }else{

        JOptionPane.showMessageDialog(null,"Bienvenido, siga las instrucciones para determinar su edad. ");
        texto = JOptionPane.showInputDialog("Ingrese su a\u00f1o actual");

        a1 = Integer.parseInt(texto);
        }

        JOptionPane.showMessageDialog(null,"Bienvenido, siga las instrucciones para determinar su edad. ");
            texto = JOptionPane.showInputDialog("Ingrese el a\u00f1o actual");

        if(a1<2020 || a1>2050){
            JOptionPane.showMessageDialog(null,"Por favor, ingrese un a\u00f1o valido. ");

            JOptionPane.showMessageDialog(null,"Bienvenido, siga las instrucciones para determinar su edad. ");
            texto = JOptionPane.showInputDialog("Ingrese el a\u00f1o actual");
        }else{

        edad = a1 - a;

        JOptionPane.showMessageDialog(null,"Usted tiene " + edad + " a\u00f1os aproximadamente. :)) ");
        }

    }
}