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
public class Maestro extends Docente {
    private int experienciaLaboral;
    private  String asignatura;
    
    
    @Override
     public void trabajar(){
       System.out.println("el maestro trabaja");
    }
     
     
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }
    
    public String getAsignatura(){
        return asignatura;
    }
    
    public void setExperienciaLaboral(int experienciaLaboral){
        this.experienciaLaboral= experienciaLaboral;
    }
    
    public int getExperienciaLaboral(){
        return experienciaLaboral;
    }
}
