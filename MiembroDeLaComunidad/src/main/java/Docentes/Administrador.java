/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docentes;

import Empleados.Docente;

/**
 *
 * @author ranxl
 */
public class Administrador extends Docente{
    
    private String username;
    private String contraseña;
    
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
}
