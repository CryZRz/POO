public class RegistroBoleto {
    private String fecha;
    private int numBoletos;
    private String grupo;
    private int costo;
    private int total;

    RegistroBoleto (String fecha, int numBoletos){
        this.fecha = fecha;
        this.numBoletos = numBoletos;
        this.grupo = "Caifanes";
        this.costo = 350;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumBoletos() {
        return numBoletos;
    }

    public String getGrupo() {
        return grupo;
    }

    public int getCosto() {
        return costo;
    }

    public int getTotal(){
        this.total = this.numBoletos*350;
        return this.total;
    }

    public String regalo(){
        String reg = "Tienes derecho a un boleto gratos";
        if (this.total > 5000){
            return reg;
        }else{
            reg = "el monto no te da derecho a un boleto gratis";
            return reg;
        }
    }

    public void setNumBoletos(int numBoletos){
        this.numBoletos = numBoletos;
    }
}
