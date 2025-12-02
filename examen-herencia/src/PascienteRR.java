/*
AQUI ES DONDE SE INCLUYE LA SINTAXIS PARA HACER LA HERENCIA
*/
public class PascienteRR extends UsuarioRR{
    private String padecimiento;
    private String medicamento;
    private String doctor;
    private String sintomas;

    //ESTE ES EL CONSTRUCTOR DE LA CLASE HIJA
    public PascienteRR(String nombre, String telefonoFijo, String telefonoMovil, int numSeguroSocial, int a) {
        super(nombre, telefonoFijo, telefonoMovil, numSeguroSocial);
        this.padecimiento = "Posible presion arterial alta";
        this.medicamento = "Nifepideno - Tomar una cada 8 horas";
        this.doctor = "Mauricio Rodriguez Lopez - 4775689636 contactelo";
        this.sintomas = "Dolor de cabeza, zumbido de oido y ver estrellitas";
    }

    //ESTE ES EL CONSTRUCTOR SOBRECARGADO DE LA CLASE HIJA
    public PascienteRR(String nombre, String telefonoFijo, String telefonoMovil, int numSeguroSocial, String b) {
        super(nombre, telefonoFijo, telefonoMovil, numSeguroSocial);
        this.padecimiento = "Posible migraña";
        this.medicamento = "Diclofenaco - Tomar 1 en la mañana y 1 en la noche";
        this.doctor = "Rosario Diaz - 4778569856 contactala";
        this.sintomas = "Dolor de cabeza, sensibilidad a la luz,sensibilidad al ruido";
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getSintomas() {
        return sintomas;
    }
}
