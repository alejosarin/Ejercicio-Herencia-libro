package ejecutable;
import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.Biblioteca;
public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Biblioteca miModelo =null;
        Controlador miControlador = new Controlador(miVentana,miModelo);
    }    
}
 