public class Persona {
    private int clave;
    private String nombre;
    private String direccion;

    Persona(int clave, String nombre, String direccion){
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}