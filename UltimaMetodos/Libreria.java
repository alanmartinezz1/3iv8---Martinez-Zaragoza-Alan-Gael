import javax.swing.JOptionPane;

public class Libreria{


    protected String Libro[] = {"Bajo la misma estrella", "El diario de Ana Frank", "Scott Pilgrim vs The World Vol. 1"};
    protected String Autor[] = {"John Green", "Ana Frank", "Bryan Lee O'Malley"};
    protected int Ejemplares[] = {10, 30, 2};
    protected int Prestamos[] = new int[1];
   
    
    public String[] getLibro(){
        return Libro;
    }
    //envia u establecer
    public void setLibro(String Libro[]){
        this.Libro = Libro;
    }

    //recibe obtiene
    public String[] getAutor(){
        return Autor;
    }
    //envia u establecer
    public void setAutor(String Autor[]){
        this.Autor = Autor;
    }

    //recibe obtiene
    public int[] getEjemplares(){
        return Ejemplares;
    }
    //envia u establecer
    public void setEjemplares(int Ejemplares[]){
        this.Ejemplares = Ejemplares;
    }

    //recibe obtiene
    public int[] getPrestamos(){
        return Prestamos;
    }
    //envia u establecer
    public void setPrestamos(int Pretamos[]){
        this.Prestamos = Prestamos;
    }


}