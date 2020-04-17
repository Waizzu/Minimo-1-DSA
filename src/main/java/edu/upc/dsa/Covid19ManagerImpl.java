package edu.upc.dsa;

import edu.upc.dsa.models.Brote;


import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class Covid19ManagerImpl implements Covid19Manager {
    private static Covid19Manager instance;
    protected List<Brote> Brotes;
    final static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);

    private Covid19ManagerImpl() {
        this.Brotes = new LinkedList<>();
    }

    public static Covid19Manager getInstance() {
        if (instance==null) instance = new Covid19ManagerImpl();
        return instance;
    }

    public int size() {
        int ret = this.Brotes.size();
        logger.info("size " + ret);

        return ret;
    }

  /*  public Brote addBrote (Brote t) { //AÑADIR BROTES
        logger.info("Nuevo Brote " + t);

        this.Brotes.add (t);
        logger.info("Se ha añadido un brote nuevo");
        return t;
    }
    */
    public Brote addBrote(String id,String nombre, String fecha,String genero,String correo, String telefono,String direccion,String clasificacion ) {
        return this.addBrote(new Brote(id,nombre,fecha,genero,correo,telefono,direccion,clasificacion));
    }

    public Brote getBrote(String id) {
        logger.info("getBrote("+id+")");

        for (Brote t: this.Brotes) {
            if (t.getId().equals(id)) {
                logger.info("getBrotes("+id+"): "+t);

                return t;
            }
        }

        logger.warn("not found " + id);
        return null;
    }

    @Override
    public Brote addBrote(Brote t) {
        return null;
    }

    public List<Brote> findAll() {
        return this.Brotes;
    }



}