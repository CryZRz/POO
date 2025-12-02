import javax.swing.*;

public class PruebaPascienteRR {
    public static void main(String[] args) {
        PruebaPascienteRR pruebaPasciente = new PruebaPascienteRR();
        //ESTE ES EL OBJETO QUE PERMITE IR A LOS METODOS
        PascienteRR pasciente = null;
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Capturar \n 2.-Imprimir \n 3.-Imprimir con costo"));
            switch (opcion){
                case 1:
                    pasciente = pruebaPasciente.capturar();
                    break;
                case 2:
                    pruebaPasciente.imprimirSinCosto(pasciente);
                    break;
                case 3:
                    pruebaPasciente.imprimirConCosto(pasciente);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, ":)");
                    break;
            }
        }while (opcion != 4);
    }

    private void imprimirConCosto(PascienteRR pasciente) {
        if (pasciente == null){
            JOptionPane.showMessageDialog(null, "Debes capturar antes de impirmir");
            return;
        }
        int numeroSeguro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de seguro social: "));
        if (numeroSeguro == pasciente.getNumSeguroSocial()){
            this.imprimir(300, pasciente);
        }else {
            JOptionPane.showMessageDialog(null,"Numero de seguro social incorrecto");
        }

    }

    private void imprimirSinCosto(PascienteRR pasciente) {
        if (pasciente == null){
            JOptionPane.showMessageDialog(null, "Debes capturar antes de impirmir");
            return;
        }
        this.imprimir(0, pasciente);
    }

    private void imprimir(int costo, PascienteRR pasciente){
        String impresion = "Ticket: " +
                "\nNombre: " + pasciente.getNombre()+
                "\nTelefono fijo: " + pasciente.getTelefono()+
                "\nTelefono movil" + pasciente.getTelefono(20)+
                "\nNumero de seguro social: " + pasciente.getNumSeguroSocial()+
                "\nSintomas: "+ pasciente.getSintomas()+
                "\nPadecimiento: " + pasciente.getPadecimiento()+
                "\nMedicamento: " + pasciente.getMedicamento()+
                "\nDr.Recomendado: " + pasciente.getDoctor();

        if (costo > 0){
            impresion += "\nCosto del servicio por consulta: " + costo;
        }

        JOptionPane.showMessageDialog(null, impresion);
    }

    private PascienteRR capturar() {
        PascienteRR pasciente = null;
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String telefonoFijo = JOptionPane.showInputDialog("Ingrese su numero de telefono fijo");
        String telefonoMovil = JOptionPane.showInputDialog("Ingrese su numero de telefono movil");
        int numeroSeguroSocial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de seguro social"));
        int tipoSintomas = Integer.parseInt(JOptionPane.showInputDialog("Indique que sintomas padece: " +
                "\n1.-Dolor de cabeza, zumbido de oido y ver estrellitas" +
                "\n2.-Dolor de cabeza, sensibilidad a la luz,sensibilidad al ruido"));
        switch (tipoSintomas){
            case 1:
                pasciente = new PascienteRR(nombre, telefonoFijo, telefonoMovil, numeroSeguroSocial, 1);
                break;
            case 2:
                pasciente = new PascienteRR(nombre, telefonoFijo, telefonoMovil, numeroSeguroSocial, "Lesly");
                break;
        }


        return pasciente;
    }
}
