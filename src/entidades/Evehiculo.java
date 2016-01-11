/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Josué
 */
public class Evehiculo {
    
    private String nombre;
    private String ci;
    private String celular;
    private String direccion;
    
    public Evehiculo(){
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Evehiculo(String nombre, String ci, String celular, String direccion) {
        this.nombre = nombre;
        this.ci = ci;
        this.celular = celular;
        this.direccion = direccion;
    }
    
    @Override
	public String toString() {
		return "Nombre: " + nombre + ", C.I:=" + ci + ", Celular: " + celular + ", Direccion: " + direccion
				+ "\n";
	}
}
