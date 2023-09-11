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
public class ExAlumno extends MiembroDeLaComunidad {
   public int añoDeGraduación;
   
   @Override
   public void saludar(){
       System.out.println("soy un exAlumno");
   }
    
    public void setAñoDeGraduacion(int añoDeGraduación){
       this.añoDeGraduación = añoDeGraduación; 
    }
            
    public int getAñoDeGraduación(){
        return añoDeGraduación;
    }
    
}
