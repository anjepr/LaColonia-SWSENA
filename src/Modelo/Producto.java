/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Portatil
 */
public class Producto extends RepLegal {
    private int cod;
    private String nombre;
    private String valorunitario;
    private String descripcion;
    private String fabricante;
    private String registroinvima;
    
    
 public Producto () {
 }

    public Producto(Persona represenate) {
        super(represenate);
    }

    public Producto(int cod, String nombre, String valorunitario, String descripcion, String fabricante, String registroinvima) {
        this.cod = cod;
        this.nombre = nombre;
        this.valorunitario = valorunitario;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.registroinvima = registroinvima;
    }

    public Producto(int cod, String nombre, String valorunitario, String descripcion, String fabricante, String registroinvima, Persona represenate) {
        super(represenate);
        this.cod = cod;
        this.nombre = nombre;
        this.valorunitario = valorunitario;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.registroinvima = registroinvima;
    }

    public int getCod() {
        return cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValorunitario() {
        return valorunitario;
    }

    public String getRegistroinvima() {
        return registroinvima;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegistroinvima(String registroinvima) {
        this.registroinvima = registroinvima;
    }

    public void setValorunitario(String valorunitario) {
        this.valorunitario = valorunitario;
    }
 
 
    
}
