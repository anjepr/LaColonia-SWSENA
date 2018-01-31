/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Empleado;
import java.util.ArrayList;

/**
 *
 * @author fragata
 */
public class GestionEmpleado {
    private static ArrayList<Empleado> datos;
    
    public GestionEmpleado(){
        datos=new ArrayList<>();
        Empleado e1 = new Empleado(1,"Anjelly","Katalina","Pelaez","Colmenares","Restrepo" ,1);
        Empleado e2 = new Empleado(2,"Edward","Adrian","Cabezas","Pelaez","Famisanar",2);
        datos.add(e1);
        datos.add(e2);
    }
    
    public ArrayList<Empleado> mostrarTodosLosUsusarios(){
        return datos;
    }
    
    public Boolean existe(Integer identificacion){
        for (Empleado dato : datos) {
            if (dato.getnumident() == (identificacion)) {
                return true;
            }
        }
        return false;
    }

    
}

