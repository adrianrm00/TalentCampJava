package Ejercicios.SegundaEntrega;

public class EmpleadoImpl implements Empleado{

    protected String nombre;
    protected double salario;

    public EmpleadoImpl(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String mostarDetalles() {
        return "Nombre: " + nombre + ", Salario Base: " + salario + "€";
    }
}
