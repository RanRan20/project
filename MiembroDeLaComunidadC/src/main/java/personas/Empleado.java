/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import com.mycompany.miembrodelacomunidad.MiembroDeLaComunidad;

/**
 *
 * @author ranxl
 */
public class Empleado implements MiembroDeLaComunidad{
    private int id;
    public String cargo;
    public double salario; 
    public String nombre;
    public String apellido;
    public int edad;
    
    
    @Override
    public void saludar(){
      System.out.println("soy un empleado");  
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setId(int id){
        this.id = id;
    }
            
   public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setNombre(String nombre){
     this.nombre = nombre;
 }
 
 public void setApellido(String apellido){
     this.apellido = apellido;
 }
 
 public void SetEdad(int edad){
     this.edad = edad;
 }
 
 public String getNombre(){
     return nombre;
 }
 
 public String getApellido(){
     return apellido;
 }
 
 public int getEdad(){
     return edad;
 }
 
    
}
