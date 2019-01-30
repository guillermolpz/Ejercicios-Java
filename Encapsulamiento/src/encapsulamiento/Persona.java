/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author alberto
 */
public class Persona {
    public Persona(){}
    
    //Constructor con 3 argumentos
    public Persona(String nombre, String apellido, boolean borrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }
    
    //Atributos privados
    private String nombre;
    private String apellido;
    private boolean borrado;
    
    //Metodo publico para acceder y/o modificar los atributos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(String apellido){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public boolean isBorrado(){
        return borrado;
    }
    public void setBorrado(boolean borrado){
        this.borrado = borrado;
    }
    
    //Método que imprime el estado del objeto
    @Override
    public String toString(){
        return "Persona("+ "nombre=" +nombre+ ", apellido=" +apellido+ ", borrado=" +borrado + ')';
    }
}
