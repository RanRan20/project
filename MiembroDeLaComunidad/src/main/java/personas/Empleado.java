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
public class Empleado extends MiembroDeLaComunidad{
    public int id;
    public String cargo;
    public double salario; 
    
    
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
    
   
    
}
