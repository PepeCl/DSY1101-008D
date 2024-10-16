/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Giuseppe Saavedra
 */
public class EmpleadoPorHora extends Empleado {

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }

    @Override
    public String toString() {
        return "Nombre Empleado por hora{" + super.getNombre() + '}';
    }
    
    @Override
    public double calcularBonus(){
        double bonushr = 0.02 * super.getSueldoBase();
        return bonushr;
    }
    
}
