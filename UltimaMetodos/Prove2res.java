import javax.swing.JOptionPane;

public class Prove2res extends Provedores{
    public void pedirysuma(){
        pedirdatos();
        sumatotal();
    }
    public void sumatotal(){
        promedio=suma/10;
        JOptionPane.showMessageDialog(null, "Resumen del pedido:"
                                            + "\nSu nombre es: "+nombrecliente
                                            + "\nLa sumatoria total de los costos de todas las existencias es: "+suma+ " MXN"
                                            + "\nEl producto con el costo mas bajo es: "+productomenor+" que tiene un precio de: "+ menor+" MXN"
                                            + "\nEl producto con el costo mas alto es: "+productomayor+" que tiene un precio de: "+ mayor+" MXN"
                                            + "\nEl promedio del costo total es: "+promedio+" MXN");
    }
}