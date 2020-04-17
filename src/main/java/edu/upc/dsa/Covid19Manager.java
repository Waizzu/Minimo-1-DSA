package edu.upc.dsa;

import edu.upc.dsa.models.Brote;

import java.util.LinkedList;
import java.util.List;

public interface Covid19Manager {


    public Brote addBrote(String id,String nombre, String fecha,String genero,String correo, String telefono,String direccion,String clasificacion );
    public Brote addBrote(Brote t);
    public Brote getBrotes(String id);
    public Brote getBrotes2(String clasificacion);
    public List<Brote> findAll();


    public int size();
}
