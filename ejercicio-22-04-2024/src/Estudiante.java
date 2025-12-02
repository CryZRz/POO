public class Estudiante extends Persona{

    public Estudiante(String nombre, String edad){
        super(nombre,edad);
    }
    @Override
    public String leyenda() {
        return "debera entregar una constancia de estudios" +
                "\n y se debera presentar el viernesel viernes 26 de abril de " +
                "\n 12 a 14 horas";
    }
}
