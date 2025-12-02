public class Despensa {
    private String nombreS;
    private String fechaC;
    private String formaPago;
    private float monto;
    private double iva;
    private double totalPago;

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getNombreS() {
        return nombreS;
    }

    public String getFechaC() {
        return fechaC;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public float getMonto() {
        return monto;
    }

    public double getIva() {
        this.iva = this.monto * 0.16;
        return this.iva;
    }

    public double getTotalPago() {
        this.totalPago = this.monto + this.iva;
        return totalPago;
    }
}
