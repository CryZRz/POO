import javax.swing.*;

public class PruebaPersona {
    public static void main(String[] args) {
        int queQueres;
        PruebaPersona ira = new PruebaPersona();
        Persona ojbPadre = null;
        do{
            queQueres = Integer.parseInt(JOptionPane.showInputDialog("Elige " +
                    "\n 1.-Capturar" +
                    "\n 2.-Imprimir" +
                    "\n 3.-Salir"));
            switch (queQueres){
                case 1:
                    ojbPadre = ira.capturar();
                    break;
                case 2:
                    ira.imprimir(ojbPadre);
                    break;
            }
        }while (queQueres != 3);
    }

    private Persona capturar() {
        Persona objPadre = null;
        String nombre = JOptionPane.showInputDialog("Registra tu nombre");
        String edad = JOptionPane.showInputDialog("Registrar edad?");
        int queEres = Integer.parseInt(JOptionPane.showInputDialog("Eres 1.-Estudiante " +
                "\n 2.-No estudiante"));
        switch (queEres){
            case 1:
                objPadre = new Estudiante(nombre, edad);
                break;
            case 2:
                objPadre = new NoEstudiante(nombre, edad);
                break;
        }

        return objPadre;
    }

    public void imprimir(Persona persona){
        JOptionPane.showMessageDialog(null, "Nombre: " +
                persona.getNombre()+ "\nEdad: " +persona.getEdad() + "\n" +persona.leyenda());
    }
}
