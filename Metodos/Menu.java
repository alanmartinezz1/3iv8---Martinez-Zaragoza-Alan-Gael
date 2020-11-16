//libreria
import javax.swing.JOptionPane;

public class Menu{

    //metodo principal
    public static void main(String[] args){

        int op, letra;

        JOptionPane.showMessageDialog(null,"Martinez Zaragoza Alan Gael, 3IV8 ");

        do{

            
            op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un programa. \n1. Edad. \n2. Area y perimetro. \n3.Llamadas. "));
            

            switch(op){
                case 1:
                    do{
                        caledad m1 = new caledad();
                        m1.caledad();

                        letra = Integer.parseInt(JOptionPane.showInputDialog("Si desea repetir presione 1. "));
                    }while(letra == 1);

                break;
                case 2:
                    do{
                        AyP m2 = new AyP();
                        m2.AyP();

                        letra = Integer.parseInt(JOptionPane.showInputDialog("Si desea repetir presione 1. "));
                    }while(letra == 1);

                break;
                case 3:
                    do{
                        LTel m3 = new LTel();
                        m3.LTel();
                        letra = Integer.parseInt(JOptionPane.showInputDialog("Si desea repetir presione 1. "));
                    }while(letra == 1);

                break;
            }
            letra = Integer.parseInt(JOptionPane.showInputDialog("Si desea regresar al menu presione 2. "));
            
        }while(letra == 2);

        JOptionPane.showMessageDialog(null,"Gracias por ver. uwu");
    }

}