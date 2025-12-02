import javax.swing.*;

public class PruebaDespensa {
    public static void main(String[] args) {
        Despensa despensa = new Despensa();
        PruebaDespensa pruebaDespensa = new PruebaDespensa();
        int option;
        ImageIcon icon = new ImageIcon("./js.png");
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Elige \n1 para capturar, \n2 para imprimir, \n3 para salir"));
            switch (option){
                case 1:
                    pruebaDespensa.capturar(despensa);
                    break;
                case 2:
                    pruebaDespensa.imprimir(despensa);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Elaborador por cryz");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error en opcion solo 1-3");
            }
        }while (option != 3);
    }

    public void capturar(Despensa despensa){
        despensa.setNombreS(JOptionPane.showInputDialog("Registra el nombre del supermercado"));
        despensa.setFechaC(JOptionPane.showInputDialog("Registra la fecha de compra"));
        despensa.setMonto(Float.parseFloat(JOptionPane.showInputDialog("Registra el monto de la compra")));
        despensa.setFormaPago(JOptionPane.showInputDialog("Forma de pagio efectivo/tarjeta"));
    }

    public void imprimir(Despensa despensa){
        JOptionPane.showMessageDialog(null,despensa.getNombreS());
        JOptionPane.showMessageDialog(null,despensa.getFechaC());
        JOptionPane.showMessageDialog(null,despensa.getFormaPago());
        JOptionPane.showMessageDialog(null,String.valueOf(despensa.getMonto()));
        JOptionPane.showMessageDialog(null,despensa.getIva());
        JOptionPane.showMessageDialog(null,despensa.getTotalPago());
    }
}
