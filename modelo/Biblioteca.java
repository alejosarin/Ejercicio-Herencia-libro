package modelo;


public class Biblioteca {
    
    //atributos
    protected String nombre;
    protected String autor;
    protected int añoEdicion;
    protected Boolean edicionLujo;
    protected String nombreColeccion;
    protected int numeroColeccion;
    
    
   

    //constructor
    public Biblioteca(String nombre, String autor, int añoEdicion, Boolean edicionLujo,String nombreColeccion , int numeroColeccion) 
    {
        this.nombre = nombre;
        this.autor = autor;
        this.añoEdicion = añoEdicion;
        this.edicionLujo = edicionLujo;
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
        
    }
    public Biblioteca(String nombre, String autor, int añoEdicion, Boolean edicionLujo) 
    {
        this.nombre = nombre;
        this.autor = autor;
        this.añoEdicion = añoEdicion;
        this.edicionLujo = edicionLujo;
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

   


    
    public String toString() {
        return "Libro [nombre=" + nombre + ", autor=" + autor + ", añoEdicion=" + añoEdicion + ", edicionLujo="
                + edicionLujo + "]";
    }
    
    
    
    

    

}
