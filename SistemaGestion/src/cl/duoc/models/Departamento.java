/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giuseppe Saavedra
 */
public class Departamento {
    
    private String idDepartamento, nombre;
    private List<Empleado> nomina = new ArrayList<>();

    public Departamento() {
    }

    public Departamento(String idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getNomina() {
        return nomina;
    }

    public void setNomina(List<Empleado> nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Departamento{" + "idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", nomina=" + nomina + '}';
    }
    
    public void agregarEmpleado(Empleado emp){
        nomina.add(emp);
        System.out.println("Empleado agregado correctamente");
        }
    
    public double calcularCostoTotalSalarios(){
        double total = 0.0;
        for (Empleado persona: nomina){
            total += persona.getSueldoBase();
        }
        return total;
    }
    
    public void conocerEmpleados(){
        for (Empleado i:nomina){
            System.out.println("Nombre: " + i.getNombre()+ "\nSueldo Base: $" + i.getSueldoBase());
        }
    }


    }
    

