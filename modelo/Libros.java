package modelo;

import java.util.ArrayList;

public class Libros extends Biblioteca
{   
    //atributos
    private ArrayList<Biblioteca> Libros = new ArrayList<Biblioteca>();

    //controlador
    public Libros(String nombre, String autor, int añoEdicion, Boolean edicionLujo)
    {
        super(nombre, autor, añoEdicion, edicionLujo);
    }
    
    public void agregarLibro(Biblioteca j)
    {
        Libros.add(j);
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAñoEdicion() {
        return añoEdicion;
    }


    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }


    public Boolean getEdicionLujo() {
        return edicionLujo;
    }



    public void setEdicionLujo(Boolean edicionLujo) 
    {
        this.edicionLujo = edicionLujo;
    }


    
}
