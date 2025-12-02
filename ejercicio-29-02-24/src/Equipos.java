public class Equipos {
    private String vel;
    private String dd;
    private String puulgadas;
    private String marca;
    private String ram;
    private String so;
    private String tipo;
    private double precio;
    private int tipo2;


    public Equipos(String vel, String dd, String ram, String pulgadas, double precio, int tipo){
        this.vel = vel;
        this.dd = dd;
        this.ram = ram;
        this.puulgadas = pulgadas;
        this.precio = precio;
        this.tipo = "computadora";
        this.tipo2 = tipo;
    }

    public Equipos(String so, String marca, double precio, int tipo){
        this.so = so;
        this.marca = marca;
        this.precio = precio;
        this.tipo = "celuar";
        this.tipo2 = tipo;
    }
    public String getVel() {
        return vel;
    }

    public String getDd() {
        return dd;
    }

    public String getPuulgadas() {
        return puulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public String getRam() {
        return ram;
    }

    public String getSo() {
        return so;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo(){
        return  this.tipo;
    }

    public int getTipo2() {
        return tipo2;
    }
}
