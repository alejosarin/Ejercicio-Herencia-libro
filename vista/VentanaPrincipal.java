package vista;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public EntradaDeDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    
    private JLabel lbImagen;
    private ImageIcon iImagen;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //añadimos panel entrada datos
        miPanelEntradaDatos = new EntradaDeDatos();
        miPanelEntradaDatos.setBounds(0,10,385,200);
        this.add(miPanelEntradaDatos);
        
        //añadimos panel operaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(0, 250, 810, 235);
        this.add(miPanelOperaciones);
        

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(390,10,420,200);
        this.add(miPanelResultados);

       
        
        //Caracteristicas de la ventana
        setTitle("Alejandro Salazar Rincon");
        setSize(830,800);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
    }
    //Crear menu
    /*public void crearMenu()
    {
        miPanelMenu = new PanelMenu();
    }*/
    
}