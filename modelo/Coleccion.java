package modelo;

import java.util.ArrayList;

public class Coleccion extends Libro
{
    //Atributos
    private ArrayList<Libro> coleccion = new ArrayList<Libro>();
    //constructor
    public Coleccion(String nombre, String autor, int añoEdicion, Boolean edicionLujo,String coleccion)
    {
        super(nombre, autor, añoEdicion, edicionLujo, coleccion);
    }
    public void agregarLibro(Libro j)
    {
        coleccion.add(j);
    }

}
