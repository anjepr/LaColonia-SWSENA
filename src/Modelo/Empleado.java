/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fragata
 */
public class Empleado {
    private int numidentificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefonos;
    private String email;

    public Empleado() {
    }

    public Empleado(int numidentificacion, String nombres, String apellidos, String direccion, String telefonos,String email) {
        this.numidentificacion = numidentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.email = email;
    }

    public int getNumidentificacion() {
        return numidentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public String getEmail() {
        return email;
    }

    public void setNumidentificacion(int numidentificacion) {
        this.numidentificacion = numidentificacion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getnumident() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    