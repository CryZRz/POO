public abstract class ServicioFunerario {
    private String nombre;
    private String telefono;
    private String correo;
    private int cantidad;
    public ServicioFunerario(String nombre, String telefono, String correo, int cantidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cantidad = cantidad;
    }

    public abstract String leyenda();

    public abstract int costo();

    public abstract int costoTotal();

    public abstract double descuento();

    public abstract double pagoFinal();

    public abstract String urna();

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCantidad(){
        return this.cantidad;
    }
}