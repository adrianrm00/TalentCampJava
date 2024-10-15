package Ejercicios.SegundaEntrega;

public class Gerente extends EmpleadoImpl{

    private double bonoGerente;

    public Gerente(String nombre, double salario, double bonoGerente) {
        super(nombre, salario);
        this.bonoGerente = bonoGerente;
    }

    @Override
    public double calcularSalario(){
        return (salario + bonoGerente);
    }

    @Override
    public String toString(){
        return "Puesto Gerente " + mostarDetalles() + ", Bono: " + bonoGerente + "€, Sueldo Final: " + calcularSalario() + "€";
    }

}
