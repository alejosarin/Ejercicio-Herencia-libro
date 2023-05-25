package ejecutable;
import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.Libro;
public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Libro miModelo =null;
        Controlador miControlador = new Controlador(miVentana,miModelo);
    }    
}
 