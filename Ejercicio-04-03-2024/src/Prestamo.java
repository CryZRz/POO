public class Prestamo {
    private String nombre;
    private String direccion;
    private String correo;
    private String tipoPago;
    private double monto;
    private double pagoMensual;
    private int tipo;

    public Prestamo(String nombre, String direccion, String correo, double monto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.monto = monto;
        this.tipoPago = "El prestamo es a 24 meses con un 5% de intereses";
        this.tipo = 1;
        this.pagoMensual = (monto/24)+(monto*0.05);
    }

    public Prestamo(String nombre, String direccion, double monto, String correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.monto = monto;
        this.tipoPago = "El prestamo es a 36 meses con un 5% de intereses";
        this.tipo = 2;
        this.pagoMensual = (this.monto/36)+(this.monto*.1);
    }

    public Prestamo(String nombre, double monto, String direccion, String correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.monto = monto;
        this.tipoPago = "El prestamo es a 48 meses con un 5% de intereses";
        this.tipo = 3;
        this.pagoMensual = (this.monto/48)+(this.monto*0.12);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public double getMonto() {
        return monto;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public int getTipo() {
        return tipo;
    }
}
