public class Servicios extends AutoSeguro{
    private int total;
    private String tipoServicio;
    private String entrega;
    private int frenos;
    private int precio = 0;
    private String tipoVehiculo;

    public Servicios(String marca, int kilometros, String nombre, int tipoVehiculo, boolean frenos) {
        super(marca, kilometros, nombre);
        this.tipoServicio = "Mayor";
        this.entrega = "El mismo dia 6 horas despues de dejarlo";
        switch(tipoVehiculo){
            case 1:
                this.tipoVehiculo = "Camioneta";
                this.precio = 4600;
                break;
            case 2:
                this.tipoVehiculo = "Carro";
                this.precio = 3800;
                break;
        }
        if (frenos){
            this.frenos = 2500;
        }

    }

    public Servicios(String marca, int kilometros, String nombre, int tipoVehiculo) {
        super(marca, kilometros, nombre);
        this.tipoServicio = "Menor";
        this.entrega = "El mismo dia 4 horas despues de dejarlo";
        switch(tipoVehiculo){
            case 1:
                this.tipoVehiculo = "Camioneta";
                this.precio = 2800;
                break;
            case 2:
                this.tipoVehiculo = "Carro";
                this.precio = 2200;
                break;
        }
    }

    public int getTotal() {
        this.total = this.precio + this.frenos;
        return this.total;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public String getEntrega() {
        return entrega;
    }

    public int getFrenos() {
        return this.frenos;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
}