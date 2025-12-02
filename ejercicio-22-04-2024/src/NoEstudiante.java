public class NoEstudiante extends Persona{

    public NoEstudiante(String nombre, String edad){
        super(nombre,edad);
    }
    @Override
    public String leyenda() {
        return " debera traer un permiso por parte de sus padres . \n" +
                "Presentarse sabado de 9:00 a 14:00 hrs.";
    }
}
