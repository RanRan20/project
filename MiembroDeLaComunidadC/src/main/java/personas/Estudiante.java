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
public class Estudiante implements MiembroDeLaComunidad {
    private int matricula;
    public String nombre;
    public String apellido;
    public int edad;
    
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
