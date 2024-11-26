/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bd.Conexion;
import Models.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Cetecom
 */
public class PacienteController {
    
    HelperController h = new HelperController();
    Conexion cx;
    
    public PacienteController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    //AGREGAR
    public void agregarPaciente(String rut, String nombre, String fechaNacimiento, String direccion, String numeroContacto){
        String sql = "INSERT INTO `paciente` (rut,nombre,fecha_de_nacimiento,direccion,numero_contacto) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement st = cx.getConnection().prepareStatement(sql);
            st.setString(1, rut);
            st.setString(2, nombre);
            st.setString(3, fechaNacimiento);
            st.setString(4, direccion);
            st.setString(5, numeroContacto);
            st.executeUpdate();
            h.showInformation("Paciente agregado correctamente");
        }catch (Exception e){
            h.showError(e.getMessage());
        }
    }
    
    //BUSCAR POR RUT
    public Paciente buscarPaciente(String rut){
        Paciente pacienteEncontrado = null;
        String sql = "SELECT * FROM `paciente` WHERE rut = '" + rut + "';";
        try{
            ResultSet rs = cx.EjecutarQuery(sql);
            if (rs.next()){
                pacienteEncontrado = new Paciente();
                pacienteEncontrado.setNombre(rs.getString("nombre"));
                pacienteEncontrado.setFechaNacimiento(rs.getString("fecha_de_nacimiento"));
                pacienteEncontrado.setDireccion(rs.getString("direccion"));
                pacienteEncontrado.setNumeroContacto(rs.getString("numero_contacto"));
            }
        }catch (Exception e){
            h.showError(e.getMessage());
        }return pacienteEncontrado;
    }
    
    
    //MODIFICAR
    public boolean modificarPaciente(String rut, String nombre, String fechaNacimiento, String direccion, String numeroContacto){
        String sql = "UPDATE `paciente` SET nombre = '" + nombre + "', fecha_de_nacimiento = '" + fechaNacimiento + "', direccion = '" + direccion 
                + "', numero_contacto = '" + numeroContacto + "' WHERE rut = '" + rut + "';";
        try{
            Paciente pacienteEncontrado = buscarPaciente(rut);
            if(pacienteEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(sql);
                h.showInformation("Paciente actualizado correctamente");
                return filasAfectadas > 0;
            }else{
                h.showError("Paciente no encontrado");
                return false;
            }
        }catch (Exception e){
            h.showError(e.getMessage());
        }return false;
                
    }
    
    //LISTAR
    public List<Paciente> listarPaciente(){
        List<Paciente> listaPaciente = new ArrayList<>();
        try{
            ResultSet rs = cx.EjecutarQuery("SELECT * FROM `paciente` ORDER BY nombre DESC");
            while (rs.next()){
                listaPaciente.add(new Paciente(rs.getString("rut"),
                rs.getString("nombre"),
                rs.getString("fecha_de_nacimiento"),
                rs.getString("direccion"),
                rs.getString("numero_contacto"))
                );
            }
        }catch (Exception e){
            h.showError(e.getMessage());
        }return listaPaciente;
    }
    
    //ELIMINAR
    public void eliminarPaciente(String rut){
        String query = "DELETE FROM `paciente` WHERE rut = '" + rut + "';";
        try{
            Paciente pacienteEncontrado = buscarPaciente(rut);
            if(pacienteEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                st.executeUpdate(query);
                h.showInformation("Paciente eliminado");
            }else{
                h.showError("Paciente no encontrado");
            }
        } catch (Exception e){
            h.showError(e.getMessage());
        }
    }
}
