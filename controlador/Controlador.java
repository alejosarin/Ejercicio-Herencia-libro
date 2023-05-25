package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Libro;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Libro model;
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Libro pModel)
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

            Libro nLibro = new Libro(nombreLibro, nombreAutor, añoEdicion, lujo);
            

            venPrin.miPanelResultados.mostrarResultado( "Nombre del Libro : " + nLibro.getNombre() + "\nAutor : "+nLibro.getAutor() + "\nAño Edicion :: "+nLibro.getAñoEdicion() + "\nEdicion de lijo  " + (lujo ? "Si" : "No"));

            
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
        
        
        
    }    
}

