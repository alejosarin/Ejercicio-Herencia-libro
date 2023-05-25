package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Biblioteca;
import vista.VentanaPrincipal;
import modelo.*;


public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Biblioteca model;
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Biblioteca pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("calcular"))
        {
            //calcular
            
            String nombreLibro = venPrin.miPanelEntradaDatos.getNombreLibro();
            String nombreAutor = venPrin.miPanelEntradaDatos.getNombreAutor();
            int añoEdicion = Integer.parseInt(venPrin.miPanelEntradaDatos.getAñoEdicion());
            Boolean lujo = venPrin.miPanelEntradaDatos.getDeLujo();

            Libros nLibro = new Libros(nombreLibro, nombreAutor, añoEdicion, lujo);
            
            int k;
            

            venPrin.miPanelResultados.mostrarResultado( "Nombre del Libro : " + nLibro.getNombre() + "\nAutor : "+nLibro.getAutor() + "\nAño Edicion :: "+nLibro.getAñoEdicion() + "\nEdicion de lijo  " + (nLibro.getEdicionLujo()? "Si" : "No"));

            
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
        
        
        
    }    
}

