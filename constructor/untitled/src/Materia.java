public class Materia {

    private String nombre;
    private int calif;

    public Materia(){
        this.nombre = "";
        this.calif = 0;
    }

    public Materia(String nombre, int calif){
        this.nombre= nombre;
        this.calif = calif;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }
}
