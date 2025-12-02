public class ServicioCompleto extends ServicioFunerario {
    private int tipoUrna;
    public ServicioCompleto(String nombre, String telefono, String correo, int cantidad, int tipoUrna) {
        super(nombre, telefono, correo, cantidad);
        this.tipoUrna = tipoUrna;
    }

    @Override
    public String leyenda() {
        return "inclute traslado del sitio a la funeraria, velatorio, cafe y pan, traslado a" +
                "\n cremacion, cremacion con urna y entrega a sus parientes la entrega sera el mismo" +
                "\n dia de la cremacion pero a las 6:00 pm";
    }

    @Override
    public int costo() {
        return 18500;
    }

    @Override
    public int costoTotal() {
        return this.getCantidad()*this.costo();
    }

    @Override
    public double descuento() {
        if (this.getCantidad() > 2){
            int descuento = this.getCantidad()-2;//4-2=2

            return this.costo()*descuento*.15;
        }
        return 0;
    }

    @Override
    public double pagoFinal() {
        return this.costoTotal()-descuento();
    }

    @Override
    public String urna() {
        String urna = "";
        switch (tipoUrna){
            case 1:
                urna="madera";
                break;
            case 2:
                urna="metla";
                break;
        }
        return urna;
    }
}
