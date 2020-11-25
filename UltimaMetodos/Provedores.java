import javax.swing.JOptionPane;

public class Provedores{

    String nombrecliente;
    String productos[] = {"Agua", "Cuadernos", "Computadora", "Impresora", "Televisi\u00f3n", "Hojas", "Monster", "Salsa", "Audifonos", "Cargador"};
    int suma=0;
    int menor=0;
    int mayor=0;
    float promedio=0;
    String productomayor, productomenor;
    int precios[] = {13, 25, 8000, 2000, 14000, 100, 20, 26, 20, 40};
    int existencias[] = {1000, 500, 10, 30, 1000, 2000, 500, 400, 200, 300};
    
    public void pedirdatos(){
        nombrecliente = JOptionPane.showInputDialog("Inserte su nombre: ");
        JOptionPane.showMessageDialog(null,"Estos son los productos disponibles");
        
        for(int i=0; i<10; i++){
            JOptionPane.showMessageDialog(null, "-"+productos[i]+ " tiene un precio de: "+ precios[i]+ " MXN, y hay "+existencias[i]+" existencias.");
        
            suma=suma+precios[i]*existencias[i];
            if(i==0){
                menor=precios[i];
                mayor=precios[i];
                productomayor=productos[i];
                productomenor=productos[i];
            }else{
                if(precios[i]>mayor){
                    mayor=precios[i];
                    productomayor=productos[i];
                }
                if(precios[i]<menor){
                    menor=precios[i];
                    productomenor=productos[i];
                }
            }
        }
    }

}