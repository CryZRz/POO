public class AutoSeguro {
    private String marca;
    private int kilometros;
    private String nombre;

    public AutoSeguro(String marca, int kilometros, String nombre) {
        this.marca = marca;
        this.kilometros = kilometros;
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public String getNombre() {
        return nombre;
    }

}