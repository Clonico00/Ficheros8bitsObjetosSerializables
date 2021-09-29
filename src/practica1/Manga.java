package practica1;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Manga implements Serializable{
    protected int id;
    protected String nombre;
    protected double precio;
    protected Date fechaPublicacion;
    protected int numeroCapitulos;
    protected String nombreAutor;

    public Manga(int id,String nombre,double precio,Date fechaPublicacion,int numeroCapitulos,String nombreAutor){
        this.id = id;
        this.nombre=nombre;
        this.precio=precio;
        this.fechaPublicacion=fechaPublicacion;
        this.numeroCapitulos=numeroCapitulos;
        this.nombreAutor=nombreAutor;
    }

    public Manga() {

    }

    public int getId() {

        return id;
    }

    public String getNombre() {

        return nombre;
    }

    public String getNombreAutor() {

        return nombreAutor;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setNumeroCapitulos(int numeroCapitulos){
        this.numeroCapitulos=numeroCapitulos;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }

 
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

   

    public void setNombreAutor(String nombreAutor){
        this.nombreAutor=nombreAutor;
    }
   
}


