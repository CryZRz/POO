import javax.swing.*;
import java.util.Objects;

public class PruebaAutoSeguro {

    public static void main(String[] args) {
        Servicios servicios = null;
        PruebaAutoSeguro prueb = new PruebaAutoSeguro();
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("INGRESE: \n1. Capturar\n"
                    + "2. Imprimir\n3. Salir"));
            switch(opcion){
                case 1:
                    servicios = prueb.capturar();
                    break;
                case 2:
                    prueb.imprimir(servicios);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias :)");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCIÓN INCORRECTA. " +
                            "\nINGRESE UNA OPCION VÁLIDA");
                    break;
            }
        }while(opcion!=3);
    }

    public Servicios capturar(){
        Servicios servicios = null;
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del carro");
        int kilometros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje"));
        int tipoServicio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tipo de servico \n1.-Mayor \n 2.-Menor"));
        int tipoVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de vehiculo \n1.Camioneta \n 2.Auto"));
        switch(tipoServicio){
            case 1:
                String frenosS = JOptionPane.showInputDialog("Quiere revision de frenos con costo extra de 2500 Si/No");
                boolean frenos = frenosS.equalsIgnoreCase("si");
                servicios = new Servicios(marca, kilometros, nombre, tipoVehiculo, frenos);
                break;
            case 2:
                servicios = new Servicios(marca, kilometros, nombre, tipoVehiculo);
                break;
        }

        return servicios;
    }

    public void imprimir(Servicios servicios){
        if (Objects.isNull(servicios)){
            JOptionPane.showMessageDialog(null, "Debes registar un vehiculo antes de imprimir");
            return;
        }
        String frenos = "No";
        if (servicios.getTipoServicio().equals("Mayor") && servicios.getFrenos() != 0){
            frenos = "Si";
        } else if (servicios.getTipoServicio().equals("Menor")) {
            frenos = "El servicio menor no ofrece frenos";
        }
        JOptionPane.showMessageDialog(null, "Ticket:" +
                "\n Nombre: " + servicios.getNombre()
                +"\n Marca: " + servicios.getMarca()
                +"\n Kilometraje: " + servicios.getKilometros()
                +"\n Tipo de servicio: " + servicios.getTipoServicio()
                +"\n Tipo vehiculo: " + servicios.getTipoVehiculo()
                +"\n Se agrego frenos: " + frenos
                +"\n Precio por el vehiculo: " +servicios.getPrecio()
                +"\n Precio final: " + servicios.getTotal()
                +"\n Entrega: " + servicios.getEntrega()
        );
    }
}