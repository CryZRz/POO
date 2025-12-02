public class ManteniemientoEquipos {
    private String nombreCliente;
    private String numTelefono;
    private String marcaEquipo;
    private String modeloEquipo;
    private String descripcionFalla;
    private String leyenda;
    private String rfc;
    private double precio;

    private int claveServicio;
    private String tipoServicio;
    private double costoMantenimiento;

    public ManteniemientoEquipos(String nombreCliente, String numTelefono, String marcaEquipo,
                                 String modeloEquipo, String descripcionFalla, int claveServicio) {
        this.nombreCliente = nombreCliente;
        this.numTelefono = numTelefono;
        this.marcaEquipo = marcaEquipo;
        this.modeloEquipo = modeloEquipo;
        this.descripcionFalla = descripcionFalla;
        this.claveServicio = claveServicio;
        this.leyenda = "Llamar al 4775236589 un dia despues de la entrega del equipo";
        this.tipoServicio = "Mantenimiento";
        this.costoMantenimiento = 0;
    }

    public ManteniemientoEquipos(String rfc, String marcaEquipo, String modeloEquipo, double precio) {
        this.rfc = rfc;
        this.marcaEquipo = marcaEquipo;
        this.modeloEquipo = modeloEquipo;
        this.leyenda = "Gracias por su compro vuelva pronto";
        this.precio = precio;
        this.tipoServicio = "Vender";
    }
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getMarcaEquipo() {
        return marcaEquipo;
    }

    public String getModeloEquipo() {
        return modeloEquipo;
    }

    public String getDescripcionFalla() {
        return descripcionFalla;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public String getRfc() {
        return rfc;
    }

    public double getPrecio() {
        return precio;
    }
    public double getPrecio(int iva) {
        return precio + precio*.16;
    }

    public double getClaveServicio() {
        return claveServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costo){
        this.costoMantenimiento = costo;
    }
}
