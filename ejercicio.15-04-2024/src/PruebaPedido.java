import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaPedido {
    public static void main(String[] args) {
        int menu;
        List<Pedido> pedidos = new ArrayList<>();
        PruebaPedido pruebaPedido = new PruebaPedido();

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1.Registrar pedido\n" +
                    "2.-Imprimir pedidos\n" +
                    "3.-Cambiar estatus\n" +
                    "4.-Ver lista de pedidos para instalar\n" +
                    "5.-Ver lista de pedidos para entregar\n" +
                    "6.-Ver lista de pedidos por instalar consluidos\n" +
                    "7.-Ver lista de pedidos por entregar conluidos\n" +
                    "8.-Salir"));

            switch (menu){
                case 1:
                    pruebaPedido.capturar(pedidos);
                    break;
                case 2:
                    pruebaPedido.imprimir(pedidos);
                    break;
                case 3:
                    pruebaPedido.cambiarEstatus(pedidos);
                    break;
                case 4:
                    pruebaPedido.pedidosParaInstalar(pedidos);
                    break;
                case 5:
                    pruebaPedido.pedidosParaEntregar(pedidos);
                    break;
                case 6:
                    pruebaPedido.pedidosParaInstalarConcluidos(pedidos);
                    break;
                case 7:
                    pruebaPedido.pedidosParaEntregarConcluidos(pedidos);
                    break;
            }
        }while (menu != 8);
    }

    private void pedidosParaEntregarConcluidos(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos){
            if (pedido.getTipoPedido() == 1 && pedido.getEstatus2() == 1){
                this.imprimirUno(pedido);
            }
        }
    }

    private void pedidosParaInstalarConcluidos(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos){
            if (pedido.getTipoPedido() == 2 && pedido.getEstatus2() == 1){
                this.imprimirUno(pedido);
            }
        }
    }

    private void pedidosParaEntregar(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos){
            if (pedido.getTipoPedido() == 1){
                this.imprimirUno(pedido);
            }
        }
    }

    private void pedidosParaInstalar(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos){
            if (pedido.getTipoPedido() == 2){
                this.imprimirUno(pedido);
            }
        }
    }

    public void capturar(List<Pedido> pedidos){
        String nombre = JOptionPane.showInputDialog("Registra nombre: ");
        String direccion = JOptionPane.showInputDialog("Registra la direccion: ");
        String telefono = JOptionPane.showInputDialog("Regstra tu telefono");
        int clave = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la clave de la persona"));
        String marca = JOptionPane.showInputDialog("Registra marca del aire");
        String modelo = JOptionPane.showInputDialog("Registra modelo del aire");
        String tonelaje = JOptionPane.showInputDialog("Registra tonelaje");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Registra el precio del aire"));
        int pedido = Integer.parseInt(JOptionPane.showInputDialog("Registra el numero de pedido"));
        int tpedido = Integer.parseInt(JOptionPane.showInputDialog("Elige \n1.-Entrega en sucursal " +
                "\n2.Instalar en domicilio "));
        pedidos.add(new Pedido(nombre, direccion, telefono, clave, marca, modelo, tonelaje,precio,pedido,tpedido));
    }

    private void imprimir(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos){
            this.imprimirUno(pedido);
        }
    }

    private void imprimirUno(Pedido pedido){
        int p= pedido.getTipoPedido()== 1 ? pedido.getPrecioF(3) : pedido.getPrecioF();;
        JOptionPane.showMessageDialog(null,
                "Clave cliente: " + pedido.getClave()+
                        "\nNombre: " + pedido.getNombre()+
                        "\nDireccion: " + pedido.getDireccion()+
                        "\nTelefono: " + pedido.getTelefono()+
                        "\nNUMERO DE PEDIDO: " + pedido.getPedido()+
                        "\nMarca: " + pedido.getMarca()+
                        "\nModelo: " +  pedido.getModelo()+
                        "\nTonelaje: " + pedido.getTonelage()+
                        "\nPrecio: " + pedido.getPrecio()+
                        "\n" + pedido.getLeyenda()+
                        "\nPrecio final de la compra: " + p+
                        "\nEstatus: " + pedido.getEstatus()
        );
    }

    private void cambiarEstatus(List<Pedido> pedidos) {
        int numPedido = Integer.parseInt(JOptionPane.showInputDialog("Registra el numero de pedido a modificar"));
        boolean b=false;
        for (Pedido pedido : pedidos){
            if (numPedido == pedido.getPedido()){
                b=true;
                pedido.setEstatus2(1);
                pedido.setFechaE(JOptionPane.showInputDialog("Registra la fecha de instalacion/Entrega"));
            }
        }
        if (!b){
            JOptionPane.showMessageDialog(null, "Pedido no encontrado");
        }
    }
}
