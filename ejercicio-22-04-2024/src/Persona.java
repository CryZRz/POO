public abstract class Persona {
    private String nombre;
    private String edad;

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public abstract String leyenda();
}
