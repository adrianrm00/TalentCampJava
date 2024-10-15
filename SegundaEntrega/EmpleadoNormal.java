package Ejercicios.SegundaEntrega;

public class EmpleadoNormal extends EmpleadoImpl{

    private int horasExtra;
    private double tarifaPorHora;

    public EmpleadoNormal(String nombre, double salario, int horasExtra, double tarifaPorHora ){
        super(nombre, salario);
        this.tarifaPorHora = tarifaPorHora;
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario(){
        return (salario + (horasExtra * tarifaPorHora));
    }

    @Override
    public String toString(){
        return "Puesto Empleado " + mostarDetalles() + ", Horas Extra: " + horasExtra + " horas, Tarifa horas extra: " + horasExtra + " Sueldo Final:" + calcularSalario();
    }

}
