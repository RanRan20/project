/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miembrodelacomunidad;

/**
 *
 * @author ranxl
 */
public abstract class MiembroDeLaComunidad {
 public String nombre;
 public String apellido;
 public int edad;

 
 public void saludar(){
     System.out.println("soy un miembro de la comunidad");
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
 
 
    
    public static void main(String[] args) {
      
    }
}
