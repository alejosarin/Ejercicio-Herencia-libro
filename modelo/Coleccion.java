package modelo;

import java.util.ArrayList;

public class Coleccion extends Biblioteca
{
    //Atributos
    private ArrayList<Biblioteca> coleccion = new ArrayList<Biblioteca>();
    //constructor
    public Coleccion(String nombre, String autor, int añoEdicion, Boolean edicionLujo)
    {
        super(nombre, autor, añoEdicion, edicionLujo);
    }
    public void agregarLibro(Biblioteca j)
    {
        coleccion.add(j);
    }

}
