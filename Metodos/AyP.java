//libreria
import javax.swing.JOptionPane;

public class AyP{
    //variables
    private int op, a, r, b, h;
    private float b1, r1;

    public void AyP(){

        //el cuerpo del programa
        op = Integer.parseInt(JOptionPane.showInputDialog("Elija la opcion deseada: \n1.- Calcular el area y el perimetro de un cuadrado \n2.- Calcular el area y el perimetro de un triangulo \n5.- Calcular el area y el perimetro de un circulo \n7.- Calcular el area y el perimetro de un rectangulo "));
    
        switch (op){
            case 1:
                
                b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del lado"));
    
                r = b*b;
    
                JOptionPane.showMessageDialog(null,"El area del cuadrado es de: "+r);
    
                r = b*4;
    
                JOptionPane.showMessageDialog(null,"El perímetro del cuadrado es de: "+r);
                break;
    
            case 2:
                b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la base"));
    
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
    
                r = (b*a)/2;
    
                JOptionPane.showMessageDialog(null,"El area del triangulo es de: "+r);
    
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del primer lado"));
    
                h = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del segundo lado"));
    
                r = b+a+h;
    
                JOptionPane.showMessageDialog(null,"El perimetro del triangulo es de: "+r);
            break;
    
            case 3:
                b1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la radio"));
    
                r1 = 3.1416f*b1*b1;

                JOptionPane.showMessageDialog(null,"El area del circulo es de: "+r1);
    
                r1 = (2*3.1416f)*b1;
    
                JOptionPane.showMessageDialog(null,"El perimetro del circulo es de: "+r1);
                break;
    
            case 4:
                b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la base"));
    
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
    
                r = (b*a);
    
                JOptionPane.showMessageDialog(null,"El area del rectangulo es de: "+r);
    
                r = (b*2)+(2*a);
    
                JOptionPane.showMessageDialog(null,"El perimetro del rectangulo es de: "+r);
                break;
    
            default:
            
                    
        }
    
            
    }
}

