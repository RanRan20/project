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
public abstract class Docente extends Empleado{
  public String horario;
  
  public abstract void trabajar();
      

  public void setHorario(String horario){
      this.horario = horario;
  }
   public String getHorario(){
       return horario;
   }
}
