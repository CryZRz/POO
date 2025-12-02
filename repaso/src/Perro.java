import java.util.function.BinaryOperator;

public class Perro extends Animal {
    private String nombre;
    public String raza;

    public Perro(String peso, int edad, String color, String nombre, String raza){
        super(peso, edad, color);
        this.nombre =  nombre;
        this.raza = raza;
    }

    public Perro(String peso, String nombre, int edad){
        super(peso, edad);
        this.nombre = nombre;
    }

    public Perro(String peso, String color, String raza, int edad, int doa){
        super(peso, edad, color);
        this.raza = raza;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

}


