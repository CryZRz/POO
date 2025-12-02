import javax.swing.*;

public class PruebaFunerario {
    public static void main(String[] args) {
        int opcion;
        PruebaFunerario pruebaFunerario = new PruebaFunerario();
        ServicioFunerario servicioFunerario = null;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Capturar \n 2.-Imprimir \n 3.-Salir"));
            switch (opcion){
                case 1:
                    servicioFunerario = pruebaFunerario.capturar();
                    break;
                case 2:
                    pruebaFunerario.imprimir(servicioFunerario);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
            }
        }while (opcion != 3);
    }

    private void imprimir(ServicioFunerario servicioFunerario) {
        try{
            JOptionPane.showMessageDialog(null, "Ticket de compra: " +
                    "\n Nombre: " + servicioFunerario.getNombre()+
                    "\n Telefono: " + servicioFunerario.getTelefono()+
                    "\n Correo: " + servicioFunerario.getCorreo()+
                    "\n Leyenda: " + servicioFunerario.leyenda()+
                    "\n Cantidad: " + servicioFunerario.getCantidad()+
                    "\n Costo por serivicio: " + servicioFunerario.costo()+
                    "\n Costo total: " + servicioFunerario.costoTotal()+
                    "\n Descuento: " + servicioFunerario.descuento()+
                    "\n Pago final: "+ servicioFunerario.pagoFinal()+
                    "\n Urna: " + servicioFunerario.urna()
            );
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Debes capturar antes de imprimir");
            return;
        }
    }

    private ServicioFunerario capturar() {
        ServicioFunerario servicioFunerario = null;
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
        String numeroTelefono = JOptionPane.showInputDialog("Ingrese el numero de telefono");
        String correo = JOptionPane.showInputDialog("Ingrese el correo");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de servicios"));
        int tipoServicio = Integer.parseInt(JOptionPane.showInputDialog("1.-Basico \n 2.-Completo"));
        switch (tipoServicio){
            case 1:
                servicioFunerario = new ServicioBasico(nombre, numeroTelefono, correo, cantidad);
                break;
            case 2:
                int tipoUrna = Integer.parseInt(JOptionPane.showInputDialog("1.-Madera \n 2.-Metal"));
                servicioFunerario = new ServicioCompleto(nombre, numeroTelefono, correo, cantidad, tipoUrna);
        }
        return servicioFunerario;
    }
}
