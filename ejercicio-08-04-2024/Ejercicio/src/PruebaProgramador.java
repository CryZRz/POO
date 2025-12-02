import javax.swing.*;

public class PruebaProgramador {
    public static void main(String[] args) {
        int menu;
        PruebaProgramador eclipse = new PruebaProgramador();
        Programador objP = null;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Elige " + "\n1.-capturar \n2.-imprimir \n3.-salir"));
            switch (menu){
                case 1:
                    objP = eclipse.capturar();
                    break;
                case 2:
                    eclipse.imprimir(objP);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, ":)");
                    break;
            }
        }while (menu != 3);
    }

    private Programador capturar() {
        int clave = Integer.parseInt(JOptionPane.showInputDialog("Registra la clave"));
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        String direccion = JOptionPane.showInputDialog("Ingresa tu direccion");
        int years = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en que ngreso"));
        String emrpesa = JOptionPane.showInputDialog("Ingrese la ultima empresa de trabajo");
        String leanguajes = JOptionPane.showInputDialog("Resgistra los lengaujes que conce?");

        return new Programador(clave, nombre, direccion, years, emrpesa, leanguajes);
    }

    private void imprimir(Programador objP) {
        JOptionPane.showMessageDialog(null, "Informacion del empleado: \n"
        +"Clave: " + objP.getClave()
                +"\nNombre: " + objP.getNombre()
                +"\nDireccion: " + objP.getDireccion()
                +"\nAño de ingreso: " + objP.getYears()
                +"\nUltima empresa en la que trabajo: " + objP.getEmpresa()
                +"\nLenguajes que domina: " + objP.getLenagujes()
                );
    }
}
