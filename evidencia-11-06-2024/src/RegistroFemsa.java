public class RegistroFemsa {
    private int numeroPaquete;
    private String nombreEmisor;
    private String lugarOrigen;
    private String lugarDestino;
    private String fecha;
    private int numeroPiezas;
    private float peso;
    private String producto;
    private double precioProducto = 0;
    private String tipoEnvio;
    private double precioEnvio = 0;
    private double precioFinal = 0;
    private double cargo;

    public RegistroFemsa(
            int numeroPaquete, String nombreEmisor, String lugarOrigen,
            String lugarDestino, String fecha, int numeroPiezas, float peso, int tipoProducto, int tipoEnvio
    ) {
        this.numeroPaquete = numeroPaquete;
        this.nombreEmisor = nombreEmisor;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fecha = fecha;
        this.numeroPiezas = numeroPiezas;
        this.peso = peso;
        switch (tipoProducto){
            case 1:
                this.producto = "agua";
                this.precioProducto = 7.00;
                break;
            case 2:
                this.producto = "refresco";
                this.precioProducto = 10.00;
                break;
            case 3:
                this.producto = "jugo";
                this.precioProducto = 8.00;
                break;
        }
        this.tipoEnvio = "terrestre";
        this.precioEnvio = 9500;
    }

    public RegistroFemsa(
            int numeroPaquete, String nombreEmisor, String lugarOrigen,
            String lugarDestino, String fecha, int numeroPiezas, float peso, int tipoProducto, String tipoEnvio
    ) {
        this.numeroPaquete = numeroPaquete;
        this.nombreEmisor = nombreEmisor;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fecha = fecha;
        this.numeroPiezas = numeroPiezas;
        this.peso = peso;
        switch (tipoProducto){
            case 1:
                this.producto = "agua";
                this.precioProducto = 7.00;
                break;
            case 2:
                this.producto = "refresco";
                this.precioProducto = 10.00;
                break;
            case 3:
                this.producto = "jugo";
                this.precioProducto = 8.00;
                break;
        }
        this.tipoEnvio = "aereo";
        this.precioEnvio = 12000;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }

    public float getPeso() {
        return peso;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public double getCargo(){
        this.cargo = (this.precioEnvio/this.numeroPiezas);
        return this.cargo;
    }

    public double getPrecioFinal(){
        this.precioFinal =  (this.cargo+this.precioProducto);
        return this.precioFinal;
    }
}
