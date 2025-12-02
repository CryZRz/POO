import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaMantenimientoEquipo {
    public static void main(String[] args) {

        int opcion;
        int claveMan = 1;
        List<ManteniemientoEquipos> equipos = new ArrayList<ManteniemientoEquipos>();
        PruebaMantenimientoEquipo pruebaMantenimientoEquipo = new PruebaMantenimientoEquipo();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Capturar \n " +
                    "2.-Imprimir \n 3.-Asigndar costo servico \n 4.-Salir"));
            switch (opcion){
                case 1:
                    pruebaMantenimientoEquipo.capturar(equipos, claveMan);
                    claveMan++;
                    break;
                case 2:
                    pruebaMantenimientoEquipo.imprimir(equipos);
                    break;
                case 3:
                    pruebaMantenimientoEquipo.asiganarCosto(equipos);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
            }
        } while (opcion != 4);
    }

    public void capturar(List<ManteniemientoEquipos> equipos, int claveMan) {
        int tipoServicio = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.-Mantenimeinto" +
                "\n 2.-Vender"));
        ManteniemientoEquipos manteniemientoEquipos1 = null;
        switch (tipoServicio){
            case 1:
                String nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente");
                String numTelefono = JOptionPane.showInputDialog(null, "Ingrese el numero de telefono");
                String marcaEquip = JOptionPane.showInputDialog(null, "Ingrese la marca del equipo");
                String modeloEquip = JOptionPane.showInputDialog(null, "Ingrese el modelo del equipo");
                String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripcion de la falla");
                manteniemientoEquipos1 =  new ManteniemientoEquipos(nombreCliente, numTelefono, marcaEquip, modeloEquip, descripcion, claveMan);
                break;
            case 2:
                String rfc = JOptionPane.showInputDialog(null, "Ingrese su RFC");
                String marcaEquip2 = JOptionPane.showInputDialog(null, "Ingrese la marca del equipo");
                String modeloEquip2 = JOptionPane.showInputDialog(null, "Ingrese el modelo del equipo");
                double precioEquipo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del equipo"));
                manteniemientoEquipos1 = new ManteniemientoEquipos(rfc, marcaEquip2, modeloEquip2, precioEquipo);
                break;
        }
        equipos.add(manteniemientoEquipos1);
    }

    private void imprimir(List<ManteniemientoEquipos> equipos) {
        for (ManteniemientoEquipos equipo : equipos){
            if (equipo.getTipoServicio().equals("Mantenimiento")){
                String monto = "";
                if (equipo.getCostoMantenimiento() == 0){
                    monto = "Aun no ha sido asignado";
                }else{
                    monto = String.valueOf(equipo.getCostoMantenimiento());
                }
                JOptionPane.showMessageDialog(null,
                        "\nClave del servicio: " + equipo.getClaveServicio()+
                                "\nNombre del cliente: " + equipo.getNombreCliente()+
                                "\nTelefono del cliente: " + equipo.getNumTelefono()+
                                "\nMarca del equipo: " + equipo.getMarcaEquipo()+
                                "\nModelo del equipo: " + equipo.getModeloEquipo()+
                                "\nDescripcion de la falla: " + equipo.getDescripcionFalla()+
                                "\nCosto del mantenimiento: "+ monto+
                                "\nLeyenda: " + equipo.getLeyenda()
                );
            }else{
                JOptionPane.showMessageDialog(null,
                                "\nRFC del cliente: " + equipo.getRfc()+
                                "\nMarca del equipo: " + equipo.getMarcaEquipo()+
                                "\nModelo del equipo: " + equipo.getModeloEquipo()+
                                "\nPrecio del equipo: " + equipo.getPrecio()+
                                "\nPrecio del equipo mas iva: " + equipo.getPrecio(8)+
                                "\nLeyenda: " + equipo.getLeyenda()
                );
            }
        }
    }

    private void asiganarCosto(List<ManteniemientoEquipos> equipos) {
        if (!equipos.isEmpty()){
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id de mantenimiento"));
            for (ManteniemientoEquipos equipo : equipos){
                if (equipo.getClaveServicio() == id){
                    double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto de servicio"));
                    equipo.setCostoMantenimiento(monto);
                }else{
                    JOptionPane.showMessageDialog(null, "NO hay equipo con ese id");
                }
            }
        }else{
         JOptionPane.showMessageDialog(null, "NO se han registrado equipos");
        }
    }

}
