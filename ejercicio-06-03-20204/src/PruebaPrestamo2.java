import javax.swing.*;

public class PruebaPrestamo2 {
    public static void main(String[] args) {
        Prestamo objPrestamos[] = new Prestamo[100];
        int pos = 0;
        PruebaPrestamo2 objPruebaPrestamo = new PruebaPrestamo2();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige" + "\n n1.Capturar \n 2Imprmir \nSalir"));
            switch (opcion){
                case 1:
                    pos = objPruebaPrestamo.capturar(objPrestamos, pos);
                    break;
                case 2:
                    objPruebaPrestamo.imprimir(objPrestamos, pos);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta elige una entre 1 y 2");
                    break;
            }
        }while (opcion != 3);
    }

    public int capturar(Prestamo[] objPrestamo, int pos){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String direccion = JOptionPane.showInputDialog("INgrese su direccion");
        String correo = JOptionPane.showInputDialog("INgrese su correo");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto"));
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("ELige 1 a 24 meses, 2 a 36 meses, 3 a 48 meses"));


        switch (tipo) {
            case 1:
                objPrestamo[pos] = new Prestamo(nombre, direccion, correo, monto);
                break;
            case 2:
                objPrestamo[pos] = new Prestamo(nombre, direccion, monto, correo);
                break;
            case 3:
                objPrestamo[pos] = new Prestamo(nombre, monto, direccion, correo);
                break;
        }

        return ++pos;
    }

    public void imprimir(Prestamo[] prestamo, int pos){
        double pago = 0;
        for (int i = 0; i < pos; i++) {
            if (prestamo[i].getTipo() == 1) {
                pago = prestamo[i].getPagoMensual();
            }
            if (prestamo[i].getTipo() == 2) {
                pago = prestamo[i].getPagoMensual(1);
            }
            if (prestamo[i].getTipo() == 3) {
                pago = prestamo[i].getPagoMensual("a");
            }
            JOptionPane.showMessageDialog(null, "Datos del prestamo "
                    + "\n Nombre: " + prestamo[i].getNombre()
                    + "\n Direccion: " + prestamo[i].getDireccion()
                    + "\n Correo: " + prestamo[i].getCorreo()
                    + "\n Monto: " + prestamo[i].getMonto()
                    + "\n Pago inicial: " + prestamo[i].getPagoMensual()
                    + "\n Metodo de pago: " + pago
            );
        }
    }
}
