/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import ModeloDAO.Empleado;

/**
 *
 * @author fragata
 */
public interface GestionEmpleadoInterface {
    public Boolean Registrar (Empleado t );
    public Boolean Actualizar (Empleado t);
    public Boolean Eliminar (Integer identificacion);
    public Empleado Buscar (Integer identificacion);
}
