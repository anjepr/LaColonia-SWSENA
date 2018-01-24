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
public class Factura  extends RepLegal {
    private int idfactura;
    private String fecha;
    private String cantidad;
    private String tipopago;
    private String producto;
    private String subtotal;
    private String totalpagar;
    

    public Factura () {    
    }

    
 
    public Factura(Persona represenate) {
        super(represenate);
    }

    public Factura(int idfactura, String fecha, String cantidad, String tipopago, String producto, String subtotal, String totalpagar) {
        this.idfactura = idfactura;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipopago = tipopago;
        this.producto = producto;
        this.subtotal = subtotal;
        this.totalpagar = totalpagar;
    }

    public Factura(int idfactura , String fecha, String cantidad, String tipòpago, String producto, String subtotal, String totalpagar, Persona represenate) {
        super(represenate);
        this.idfactura = idfactura;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipopago = tipopago;
        this.producto = producto;
        this.subtotal = subtotal;
        this.totalpagar = totalpagar;

    public int getidfactura() {
        return idfactura;
    }

    public String getfecha() {
        return fecha;
    }

    public String getcantidad() {
        return cantidad;
    }

    public String gettipopago() {
        return tipopago;
    }

    public String getproducto() {
        return producto;
    }

    public String getsubtotal() {
        return subtotal;
    }
    
    public String gettotalpagar() {
        return totalpagar;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setTotalpagar(String totalpagar) {
        this.totalpagar = totalpagar;
    }

   
    
                                             
 
 
    
}                        
                                                         

