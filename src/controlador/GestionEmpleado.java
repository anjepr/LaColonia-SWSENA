/**
 *
 * @author fragata
 */
public class GestionEmpleado {
    private static ArrayList<Trabajador> datos;
    
    public GestionEmpleado(){
        datos=new ArrayList<>();
        Empleado e1 = new Empleado(1,"Anjelly","Katalina","Pelaez","Colmenares","famisanar",1);
        Empleado e2 = new Empleado(2,"Edward","Adrian","Cabezas","Pelaez","famisanar",2);
        datos.add(e1);
        datos.add(e2);
    }
    
    public ArrayList<Empleado> mostrarTodosLosUsusarios(){
        return datos;
    }
    
    public Boolean existe(Integer identificacion){
        for(int i=0; i <datos.size(); i++){
            if(datos.get(i).getNumident()==(identificacion)){
                return true;
            }
        }
        return false;
    }

    
}

