public class ServicioBasico extends ServicioFunerario {
    public ServicioBasico(String nombre, String telefono, String correo, int cantidad) {
        super(nombre, telefono, correo, cantidad);
    }

    @Override
    public String leyenda() {
        return "Inclute traslado del sitio a la funeraria, velatorio, cafe y pan, traslado de" +
                "\nvelatorio a sitio, panteon o crematorio";
    }

    @Override
    public int costo() {
        return 15200;
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
        return this.costoTotal()-this.descuento();
    }

    @Override
    public String urna() {
        return "No aplica";
    }
}
