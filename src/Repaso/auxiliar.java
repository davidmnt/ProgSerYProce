package Repaso;

public class auxiliar extends Recordatorio{

    float salario;

    public auxiliar(int edad, String nombre, float salario) throws Error {
        super(edad, nombre);
        this.salario = salario;
    }

    public final float salario(){

        float EXTRASALARIO = 1000;
        return salario+EXTRASALARIO;
    }

    public void imprimirSalario(){
        System.out.println("El salario es: " + salario);
    }

    @Override
    public String toString() {
        return "familiar{" +
                "salario=" + salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
