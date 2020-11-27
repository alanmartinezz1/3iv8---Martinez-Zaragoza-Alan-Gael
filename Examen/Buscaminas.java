import java.util.*;

public class Buscaminas{

    protected int bomba = (int)(Math.random()*5+1);
    protected int bomba2 = (int)(Math.random()*5+1);
    protected int bomba3 = (int)(Math.random()*5+1);
    protected int bomba4 = (int)(Math.random()*5+1);
    protected int bomba5 = (int)(Math.random()*5+1);
    protected int bomba6 = (int)(Math.random()*5+1);
    protected int casillax, casillay;
    protected int tablero [][] = new int [5][5];
    Scanner entrada = new Scanner(System.in);

    public int getBomba(){
        return bomba;
    }

    public void setBomba(int bomba){
        this.bomba = bomba;
    }

    public int getBomba2(){
        return bomba2;
    }

    public void setBomba2(int bomba2){
        this.bomba2 = bomba2;
    }

    public int getBomba3(){
        return bomba3;
    }

    public void setBomba3(int bomba3){
        this.bomba3 = bomba3;
    }

    public int getBomba4(){
        return bomba4;
    }

    public void setBomba4(int bomba4){
        this.bomba4 = bomba4;
    }

    public int getBomba5(){
        return bomba5;
    }

    public void setBomba5(int bomba5){
        this.bomba5 = bomba5;
    }

    public int getBomba6(){
        return bomba6;
    }

    public void setBomba6(int bomba6){
        this.bomba6 = bomba6;
    }

    public int getCasillax(){
        return casillax;
    }

    public void setCasillax(int casillax){
        this.casillax = casillax;
    }

    public int getCasillay(){
        return casillay;
    }

    public void setCasillay(int casillay){
        this.casillay = casillay;
    }

    public int[][] getTablero(){
        return tablero;
    }

    public void setTablero(int tablero[][]){
        this.tablero = tablero;
    }
}