/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Giuseppe Saavedra
 */
public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }

    @Override
    public String toString() {
        return "Nombre Empleado Asalariado{" + super.getNombre() + '}';
    }
    
    @Override
    public double calcularBonus(){
        //calculo un bonus del 5% pero no se lo sumo al sueldo base, solo obtengo el bonus.
        double bonus = 0.05 * super.getSueldoBase();
        return bonus;
    }
    
}
