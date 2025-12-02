import javax.swing.*;

public class PruebaEquipo {
    public static void main(String[] args) {
     Equipos equipo = null;
     PruebaEquipo otro = new PruebaEquipo();
     int menu;
     do {
         menu = Integer.parseInt(JOptionPane.showInputDialog("Elige "
                 + "\n1.Capturar" + "\n2.Imprimir" + "\n3.Salir"));
         switch (menu){
             case 1:
                    equipo = otro.capturar(equipo);
                 break;
             case 2:
                 otro.imprimir(equipo);
                 break;
             default:

         }
     }while (menu != 3);
    }

    public Equipos capturar(Equipos objEquipos){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Registro de 1 Computadora \n 2. Celular"));
        switch (tipo){
            case 1:
                String vel = JOptionPane.showInputDialog("Registra la velocidad de tu computadora");
                String dd = JOptionPane.showInputDialog("Registra la capacidad de tu disco duro");
                String ram = JOptionPane.showInputDialog("Registra la capacidad de tu ram");
                String pulgadas = JOptionPane.showInputDialog("Registra las pulgadas de tu pnatalla");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Registra el precio de la computadora"));
                objEquipos = new Equipos(vel, dd, ram, pulgadas, precio, tipo);

                break;
            case 2:
                String so = JOptionPane.showInputDialog("Registra el S.O:");
                String marca = JOptionPane.showInputDialog("Registra la marca:");
                double p = Double.parseDouble(JOptionPane.showInputDialog("Registra el precio del celular"));
                objEquipos = new Equipos(so, marca, p, tipo);

                break;
        }

        return objEquipos;
    }

    public void imprimir(Equipos objEquipos){
        if (objEquipos.getTipo2() == 1){
            JOptionPane.showMessageDialog(null, "Velocidad " +
                    objEquipos.getVel()+ "\n Disco duro: " + objEquipos.getDd()+
                    "\n RAM: " + objEquipos.getRam()+
                    "\n Pulgadas: " + objEquipos.getPuulgadas()+
                    "\n Precio: " + objEquipos.getPrecio()+
                    "\n Tipo: " + objEquipos.getTipo()
                    );
        }else{
            JOptionPane.showMessageDialog(null, "SO: " +
                    objEquipos.getSo()+ "\n Marca: " + objEquipos.getMarca()+
                            "\n Precio: " + objEquipos.getPrecio()+
                    "\n Tipo: " + objEquipos.getTipo());
        }
    }
}
