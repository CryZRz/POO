import javax.swing.*;

public class PruebaMateria {
    public static void main(String[] args) {
        /*Materia terror = new Materia("POO", 100);
        JOptionPane.showMessageDialog(null, "Materia: "
                + terror.getNombre()+ " Calificacion: " + terror.getCalif()
        );*/
        PruebaMateria ira = new PruebaMateria();
        Materia terror = null;
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Elige "
                    + "\n1. Capturar" + "\n2. Imprimir" + "\n3. modificar" + "\n4. Salir"));
            switch (num){
                case 1:
                    terror = ira.capturar(terror);
                    break;
                case 2:
                    ira.imprimir(terror);
                    break;
                case 3:
                    ira.modificar(terror);
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

    public Materia capturar(Materia terror){
        String nombreMateria = JOptionPane.showInputDialog(null, "Registra el nombre de la materia?");
        int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Registra la calificacion"));
        terror = new Materia(nombreMateria, calificacion);
        return  terror;
    }

    public void imprimir(Materia terror){
        JOptionPane.showMessageDialog(null, "Materia: "
                + terror.getNombre()+ " Calificacion: " + terror.getCalif()
        );
    }

    public void modificar(Materia terror){
        terror.setCalif(Integer.parseInt(JOptionPane.showInputDialog(null, "Registra la nueva calificacion")));
    }
}
