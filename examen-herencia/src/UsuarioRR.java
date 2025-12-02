public class UsuarioRR {
    private String nombreRR;
    private String telefonoFijoRR;
    private String telefonoMovilRR;
    private int numSeguroSocialRR;

    //CONSTRUCTOR CLASE PADRE
    public UsuarioRR(String nombre, String telefonoFijo, String telefonoMovil, int numSeguroSocial) {
        this.nombreRR = nombre;
        this.telefonoFijoRR = telefonoFijo;
        this.telefonoMovilRR = telefonoMovil;
        this.numSeguroSocialRR = numSeguroSocial;
    }

    public String getNombre() {
        return nombreRR;
    }

    //ESTOS SON LOS METODOS SOBRECARGADOS
    public String getTelefono(){
        return telefonoFijoRR;
    }

    public String getTelefono(int a){
        return telefonoMovilRR;
    }

    public int getNumSeguroSocial() {
        return numSeguroSocialRR;
    }
}
