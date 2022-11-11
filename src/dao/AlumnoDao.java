
package dao;

import java.util.List;
import entity.Alumno;
import java.util.ArrayList;

public class AlumnoDao {
    private List<Alumno> lista;
    
    public AlumnoDao(){
        lista = new ArrayList<>(); 
    }
    
    public void add(Alumno alum){
        lista.add(alum);
    }

    public List<Alumno> getLista() {
        return lista;
    }
    
    public void actualizar(int index, Alumno alum) {
        lista.get(index).setNombre(alum.getNombre());
        lista.get(index).setApellidos(alum.getApellidos());
        lista.get(index).setCarrera(alum.getCarrera());
        lista.get(index).setCiclo(alum.getCiclo());
        lista.get(index).setTurno(alum.getTurno());
        lista.get(index).setFecha(alum.getFecha());
        lista.get(index).setModalidad(alum.getModalidad());
    }
    
    public void eliminar(int index){
        lista.remove(index);
    }
    
    public int buscar(String nombre){
        int index=-1;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getNombre().equals(nombre));
            index=i;
        }
        return index;
    }
}