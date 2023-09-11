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
public class Estudiante extends MiembroDeLaComunidad {
    public int matricula;
    
    @Override
    public void saludar(){
        System.out.println("soy un estudiante");
    }
    
    
   public void setMatricula(int matricula){
       this.matricula = matricula;
   }
   
   public int getMatricula(){
       return matricula;
   }
}
