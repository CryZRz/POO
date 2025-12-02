import javax.swing.*;

public class BoletoPrueba {
    public static void main(String[] args) {
        BoletoPrueba boletoPrueba = new BoletoPrueba();
        RegistroBoleto registroBoleto = null;
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Elige "
                    + "\n1. Capturar" + "\n2. Imprimir" + "\n3. modificar" + "\n4. Salir"));
            switch (num){
                case 1:
                    registroBoleto = boletoPrueba.capturar();
                    break;
                case 2:
                    boletoPrueba.imprimir(registroBoleto);
                    break;
                case 3:
                    boletoPrueba.modificar(registroBoleto);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"hecho por el padrino");
                    break;
                default :
                    JOptionPane.showMessageDialog(null, "ERROR EN OPCION");
                    break;
            }
        }while (num != 4);
    }
    
    public RegistroBoleto capturar(){
        String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha del concierto");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de boletos"));
        return  new RegistroBoleto(fecha, cantidad);
    }

    public void imprimir(RegistroBoleto registroBoleto){
        JOptionPane.showMessageDialog(null, "Ticket de compra" +
                "\n Nombre del artista: "+ registroBoleto.getGrupo()+
                "\n fecha del concierto " + registroBoleto.getFecha() +
                "\n numero de boletos de boletos: " + registroBoleto.getNumBoletos()+
                "\n el costo de cada boleto es "+ registroBoleto.getCosto()+
                "\n total de la compra " + registroBoleto.getTotal()+
                "\n" + registroBoleto.regalo());
    }

    public void modificar(RegistroBoleto registroBoleto){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la nueva canttidad"));
        registroBoleto.setNumBoletos(cantidad);
    }
}
