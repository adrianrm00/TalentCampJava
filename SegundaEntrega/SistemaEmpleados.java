package Ejercicios.SegundaEntrega;

import javax.swing.*;

public class SistemaEmpleados {
    public static void main(String[] args) {
        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de empleados"));

        EmpleadoImpl[] empleados = new EmpleadoImpl[numeroEmpleados];

        for(int i = 0; i < numeroEmpleados; i++){
            String tipoEmpleado = JOptionPane.showInputDialog("El empleado es gerente o empleado normal? (gerente/normal)");

            if(tipoEmpleado.equalsIgnoreCase("gerente")){
                String nombre = JOptionPane.showInputDialog("Introduzca el nombre del gerente: ");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del gerente: "));
                double bono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el bono del gerente: "));

                empleados[i] = new Gerente(nombre, salario, bono);
            }else if( tipoEmpleado.equalsIgnoreCase("normal")){
                String nombre = JOptionPane.showInputDialog("Introduzca el nombre del empleado: ");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del empleado: "));
                double tarifaPorHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tafida de horas extra del empleado: "));

                int horasExtra = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de horas extra del empleado: "));

                empleados[i] = new EmpleadoNormal(nombre, salario, horasExtra, tarifaPorHoras);
            }else{
                throw new PuestoEmpleadoException("Opción no valida");
            }

        }

        for(EmpleadoImpl emp : empleados){
            System.out.println(emp.toString());
        }


    }
}
