/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Giuseppe Saavedra
 */
public abstract class Empleado implements IbonusCalculable {
    
    private String idEmpleado, nombre;
    private double sueldoBase;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombre, double sueldoBase) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public abstract String toString();
    
    public double calcularSalario(){
        //los porcentajes estan expresados de la forma (1 - (porcentaje de reduccion de sueldo / 100))
        if(idEmpleado.contains("ADMIN")){
            sueldoBase = sueldoBase * 0.865;
        }if(idEmpleado.contains("IT")){
            sueldoBase = sueldoBase * 0.8025;
        }if(idEmpleado.contains("TEC")){
            sueldoBase = sueldoBase * 0.8223;
        }
        return sueldoBase;
    }
        
    @Override
    public double calcularBonus(){
        return 0.0;
    }
    
    
    
}
