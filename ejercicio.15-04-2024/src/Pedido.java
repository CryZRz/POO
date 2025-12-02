public class Pedido extends Cliente{
    private String marca;
    private String modelo;
    private int precio;
    private String tonelage;
    private int pedido;
    private int precioF;
    private String leyenda;
    private String estatus;
    private int estatus2;
    private int tipoPedido;
    private String fechaE;
    public Pedido(String nombre, String direccion, String telefono, int clave,
                  String marca, String modelo, String tonelage, int precio, int pedido,
                  int tipoPedido
                  ) {
        super(nombre, direccion, telefono, clave);
        this.marca = marca;
        this.modelo = modelo;
        this.tonelage = tonelage;
        this.pedido = pedido;
        this.precio = precio;
        this.tipoPedido = tipoPedido;
        this.estatus2 = 0;
        this.estatus = "Pendiente";
        switch (tipoPedido){
            case 1:
                this.leyenda = "Recoge cliente, entrega en centro max, " +
                        "dos dias depsues de su pedido, en un horario de " +
                        "9:00 am a 2:00 pm";
                break;
            case 2:
                this.leyenda = "Instalacion en domicilio, dia siguiente a su compra" +
                        "horario de 3:00  a 7:00 PM, estar su domicilio, en caso " +
                        "contrario reprogramar cita";
                break;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTonelage() {
        return tonelage;
    }

    public int getPedido() {
        return pedido;
    }

    public int getPrecioF() {
        return precio+1500;
    }

    public int getPrecioF(int h){
        return precio;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public String getEstatus() {
        return estatus;
    }

    public int getEstatus2() {
        return estatus2;
    }

    public int getTipoPedido() {
        return tipoPedido;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setEstatus2(int estatus2){
        this.estatus2 = estatus2;
        this.estatus = "Entregado";
    }

    public void setFechaE(String fechaE){
        this.fechaE = fechaE;
    }
}
