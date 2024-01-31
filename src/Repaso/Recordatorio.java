package Repaso;

public class Recordatorio {

    int edad;
    String nombre;

    public Recordatorio(int edad, String nombre) throws Error {
        if(edad<0){
            throw new Error("Edad invalida");
        }
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Recordatorio{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
