public class Animal {
    private String peso;
    private int edad;
    private String color;

    public Animal(String peso, int edad, String color) {
        this.peso = peso;
        this.edad = edad;
        this.color = color;
    }

    public Animal(String peso, int edad) {
        this.peso = peso;
        this.edad = edad;
        this.color = "Naranja";
    }

    public String getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
