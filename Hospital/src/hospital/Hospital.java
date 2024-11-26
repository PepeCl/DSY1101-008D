/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import Bd.Conexion;
import View.Menu;

/**
 *
 * @author Cetecom
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Menu m = new Menu();
        m.setVisible(true);
        
        Conexion cx = new Conexion();
        cx.conectar();
        
    }
    
}
