/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestion;

import cl.duoc.models.Departamento;
import cl.duoc.models.Empleado;
import cl.duoc.models.EmpleadoAsalariado;
import cl.duoc.models.EmpleadoPorHora;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Giuseppe Saavedra
 */
public class SistemaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        //creo 2 listas de empleados para mejor manejo
        List<Empleado> lista1 = new ArrayList<>();
        List<Empleado> lista2 = new ArrayList<>();
        
        //creacion de departamentos
        Departamento deptoadmin = new Departamento("ADM0102", "administracion");
        Departamento deptoit = new Departamento("IT0102", "informatica");
        Departamento deptotec = new Departamento("TEC0102", "tecnicos");
        Departamento deptopartime = new Departamento("PT1234", "part-time");
        
        //creacion de empleados vacios
        EmpleadoAsalariado empas0 = new EmpleadoAsalariado();
        EmpleadoPorHora emphr0 = new EmpleadoPorHora();
        
        //creacion de empleados
        EmpleadoAsalariado empas1 = new EmpleadoAsalariado("ADMIN1814", "Louis Lagrange", 1500000);
        EmpleadoAsalariado empas4 = new EmpleadoAsalariado("ADMIN4578", "Srinivasa Ramanujan", 1200000);
        
        EmpleadoAsalariado empas2 = new EmpleadoAsalariado("IT6758", "Leonhard Euler", 800000);
        EmpleadoAsalariado empas5 = new EmpleadoAsalariado("IT7522", "Brook Taylor", 850000);
        
        EmpleadoAsalariado empas3 = new EmpleadoAsalariado("TEC7485", "Pierre-Simon Laplace", 600000);
        EmpleadoAsalariado empas6 = new EmpleadoAsalariado("TEC0001", "Isaac Newton", 500000);
        
        EmpleadoPorHora emphr1 = new EmpleadoPorHora("HR8990", "Adios Gareca", 15000);
        
        //agrego los empleados a las listas de empleados para mejor manejo (no lo piden en el problema)
        lista1.add(empas1);
        lista1.add(empas2);
        lista1.add(empas3);
        lista1.add(empas4);
        lista1.add(empas5);
        lista1.add(empas6);
        
        lista2.add(emphr1);
        
        //agrego cada empleado a un departamento en concreto
        deptoadmin.agregarEmpleado(empas1);
        deptoadmin.agregarEmpleado(empas4);
        
        deptoit.agregarEmpleado(empas2);
        deptoit.agregarEmpleado(empas5);
        
        deptotec.agregarEmpleado(empas3);
        deptotec.agregarEmpleado(empas6);
        
        deptopartime.agregarEmpleado(emphr1);
        
        //creacion de menu
        int opcion = 0;
        
        while (opcion != 6){
            System.out.println("***** MENU *****");
            System.out.println("Opcion 1: Ver lista de empleados por departamento");
            System.out.println("Opcion 2: Calcular salario liquido de empleado");
            System.out.println("Opcion 3: Calcular bonificaciones");
            System.out.println("Opcion 4: Agregar nuevo empleado");
            System.out.println("Opcion 5: Calcular sueldo bruto total de nomina por departamento");
            System.out.println("Opcion 6: Salir ");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    //esto no lo pedian pero encontré que el programa debía tenerlo
                    System.out.println("Ingrese el nombre del departamento (administracion, informatica, tecnicos, part-time)");
                    String departamento = entrada.next();
                    if (departamento.equals(deptoadmin.getNombre())){
                        deptoadmin.conocerEmpleados();
                        break;
                    }if (departamento.equals(deptoit.getNombre())){
                        deptoit.conocerEmpleados();
                        break;
                    }if (departamento.equals(deptotec.getNombre())){
                        deptotec.conocerEmpleados();
                        break;
                    }if (departamento.equals(deptopartime.getNombre())){
                        System.out.println("El sueldo base se expresa por horas");
                        deptopartime.conocerEmpleados();
                        break;
                    }else{
                        System.out.println("Departamento no encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del departamento (administracion, informatica, tecnicos)");
                    String accion2 = entrada.next();
                    if (accion2.equals("administracion")){
                        System.out.println("El sueldo de los adminitradores por impuestos se reduce en un 23,5% de su sueldo base");
                        for (Empleado i : deptoadmin.getNomina()){
                            System.out.println("El sueldo del empleado " + i.getNombre() + " es de: $" + i.calcularSalario());
                        }
                        break;
                        
                    }if (accion2.equals("informatica")){ 
                        System.out.println("El sueldo de los informaticos por impuestos se reduce un 19,75% de su sueldo base");
                        for (Empleado i : deptoit.getNomina()){
                            System.out.println("El sueldo empleado " + i.getNombre() + " es de: $" + i.calcularSalario());
                        }
                        break;
                        
                    }if (accion2.equals("tecnicos")){
                        System.out.println("El sueldo de los tecnicos por impuestos se reduce en un 17,77% de su sueldo base");
                        for (Empleado i : deptotec.getNomina()){
                            System.out.println("El sueldo empleado " + i.getNombre() + " es de: $" + i.calcularSalario());
                        }
                        break;
                    }else{
                        System.out.println("Departamento no encontrado");                     
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el tipo de contrato del empleado (contratado / honorarios)");
                    String accion3 = entrada.next();
                    if (accion3.equals("contratado")){ 
                        System.out.println("La bonificacion corresponde al 5% del sueldo base");
                        for (Empleado i : lista1){
                            System.out.println("La bonificacion entregada al empleado " + i.getNombre() + " es de: $" + i.calcularBonus());
                        }
                        break;
                    }if (accion3.equals("honorarios")){
                        System.out.println("La bonificacion corresponde al 2% del valor por hora");
                        for (Empleado j : lista2){
                            System.out.println("La bonificacion entregada al empleado " + j.getNombre() + " por hora es de: $" + j.calcularBonus());
                        }
                        break;
                    }
                    break;
                case 4:
                    //el programa permite solo el ingreso de 1 nuevo empleado
                    System.out.println("Ingrese el tipo de contrato del nuevo empleado (contratado / honorarios)");
                    String accion4 = entrada.next();
                    if (accion4.equals("contratado")){
                        System.out.println("Ingrese el nombre del nuevo empleado");
                        String name = entrada.next();
                        empas0.setNombre(name);
                        
                        System.out.println("Ingrese el sueldo base del nuevo empleado");
                        double pay = entrada.nextDouble();
                        empas0.setSueldoBase(pay);
                        
                        System.out.println("Ingrese el area del nuevo empleado (administrador, informatico, tecnico");
                        String area = entrada.next();
                        if (area.equals("administrador")){
                            empas0.setIdEmpleado("ADMIN5511");
                            deptoadmin.agregarEmpleado(empas0);
                            break;
                        }if (area.equals("informatico")){
                            empas0.setIdEmpleado("IT5511");
                            deptoadmin.agregarEmpleado(empas0);
                            break;
                        }if (area.equals("tecnico")){
                            empas0.setIdEmpleado("IT5511");
                            deptoadmin.agregarEmpleado(empas0);
                            break;
                        }else{
                            System.out.println("Area no encontrada");
                        }
                 
                    }if (accion4.equals("honorarios")){
                        System.out.println("Ingrese el nombre del nuevo empleado");
                        String name2 = entrada.next();
                        emphr0.setNombre(name2);
                        
                        System.out.println("Ingrese el sueldo base del nuevo empleado");
                        double pay2 = entrada.nextDouble();
                        emphr0.setSueldoBase(pay2);
                        
                        emphr0.setIdEmpleado("PT5511");
                        deptopartime.agregarEmpleado(emphr0);
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del departamento (administracion, informatica, tecnicos)");
                    String accion5 = entrada.next();
                    if (accion5.equals("administracion")){
                        System.out.println("El costo bruto total de la nomina es de: $" + deptoadmin.calcularCostoTotalSalarios());
                        break;
                    }if (accion5.equals("informatica")){
                        System.out.println("El costo bruto total de la nomina es de: $" + deptoit.calcularCostoTotalSalarios());
                        break;
                    }if (accion5.equals("tecnicos")){
                        System.out.println("El costo total bruto de la nomina es de: $" + deptotec.calcularCostoTotalSalarios());
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        
        }
    }
    
}
