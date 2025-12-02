import javax.swing.*;

public class PruebaPrestamo {
    public static void main(String[] args) {
        Prestamo objPrestamo = null;
        PruebaPrestamo objPruebaPrestamo = new PruebaPrestamo();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige" + "\n n1.Capturar \n 2Imprmir \nSalir"));
            switch (opcion){
                case 1:
                    objPrestamo = objPruebaPrestamo.capturar(objPrestamo);
                    break;
                case 2:
                    objPruebaPrestamo.imprimir(objPrestamo);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta elige una entre 1 y 2");
                    break;
            }
        }while (opcion != 3);
    }

    public Prestamo capturar(Prestamo objPrestamo){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String direccion = JOptionPane.showInputDialog("INgrese su direccion");
        String correo = JOptionPane.showInputDialog("INgrese su correo");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto"));
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("ELige 1 a 24 meses, 2 a 36 meses, 3 a 48 meses"));


        switch (tipo){
            case 1:
                objPrestamo =  new Prestamo(nombre, direccion, correo, monto);
                break;
            case 2:
                objPrestamo =  new Prestamo(nombre, direccion, monto, correo);
                break;
            case 3:
                objPrestamo =  new Prestamo(nombre, monto,direccion, correo);
                break;
        }

        return objPrestamo;
    }

    public void imprimir(Prestamo prestamo){
        JOptionPane.showMessageDialog(null, "Datos del prestamo "
                + "\n Nombre: " + prestamo.getNombre()
                + "\n Direccion: " + prestamo.getDireccion()
                + "\n Correo: " + prestamo.getCorreo()
                + "\n Monto: " + prestamo.getMonto()
                + "\n Pago inicial: " + prestamo.getPagoMensual()
                + "\n Metodo de pago: " + prestamo.getTipoPago()
        );
    }
}
