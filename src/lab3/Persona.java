/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author user
 */
public class Persona {

    
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    
    //Metodos Getter y Setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Constructor
    public Persona(String nombre,String apellido,String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
}
