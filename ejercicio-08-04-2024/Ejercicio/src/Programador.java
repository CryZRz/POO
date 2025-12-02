public class Programador extends Persona{
    private int years;
    public String empresa;
    public String lenagujes;


    Programador(int clave, String nombre, String direccion, int years, String empresa, String lenagujes) {
        super(clave, nombre, direccion);
        this.years = years;
        this.empresa = empresa;
        this.lenagujes = lenagujes;
    }

    public int getYears() {
        return years;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getLenagujes() {
        return lenagujes;
    }
}
