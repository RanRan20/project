/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import personas.Empleado;

/**
 *
 * @author ranxl
 */
public class Administrativo extends Empleado{
    public String departamento;
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
       return departamento;
    }
    
    
}
