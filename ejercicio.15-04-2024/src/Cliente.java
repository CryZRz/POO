public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private int clave;

    public Cliente(String nombre, String direccion, String telefono, int clave) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getClave() {
        return clave;
    }
}
