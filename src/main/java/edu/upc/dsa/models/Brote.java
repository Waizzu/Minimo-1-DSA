package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;
import java.util.List;


public class Brote {

    String id;
    String nombre;//nombre brote
    String fecha; //año brote
    String genero;
    String correo;
    String telefono;
    String direccion;
    String clasificacion;// confirmado,sospechoso, negativo;


    public Brote(String id, String nombre, String fecha, String genero, String correo, String telefono,String direccion,String clasificacion) {
        this.id=id;
        this.nombre=nombre;
        this.fecha=fecha;
        this.genero=genero;
        this.correo=correo;
        this.telefono=telefono;
        this.direccion=direccion;
        this.clasificacion=clasificacion;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }


    @Override
    public String toString() {
        return "Brote [id="+id+",nombre=" + nombre + ",fecha="+fecha+",genero="+genero+"correo="+correo+",telefono"+telefono+"direccion="+direccion+"clasificacion="+clasificacion+"]";
    }

}