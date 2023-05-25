package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class EntradaDeDatos extends JPanel
// Atributos

{
    private  JLabel lbNombreLibro;
    private JTextField  autor;
    private JTextField tfNombreLibro;
    private JTextField tfAñoDeEdicion;
    private JTextField tfvalorMinutos;
    private JLabel lbnumeroCelular;
    private JLabel lbcantidadMinutos;
    private JLabel lbvalorMinutos;
    private JCheckBox ckBoton;
    public EntradaDeDatos()
    {

    
    //Definición del contenedor del panel
    this.setLayout(null);
    this.setBackground(Color.WHITE);

    //Borde y titulo del panel
    TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
    borde.setTitleColor(Color.black);
    this.setBorder(borde);

    //labels-------
    lbnumeroCelular = new JLabel("Nombre Del Libro");
    lbnumeroCelular.setBounds(25,30,120,20);
    add(lbnumeroCelular);

    //labels-------
    lbcantidadMinutos = new JLabel("Año de edicion");
    lbcantidadMinutos.setBounds(25,110,120,20);
    add(lbcantidadMinutos);
    
     //labels-------
    lbvalorMinutos = new JLabel("Edicion de lujo : ");
    lbvalorMinutos.setBounds(25,150,120,20);
    add(lbvalorMinutos);

    //Crear y agregar etiqueta operadores
    lbNombreLibro = new JLabel("Nombre del autor : ");
    lbNombreLibro.setBounds(25,70,120,20);
    this.add(lbNombreLibro);

    //Cajas de texto 
    tfNombreLibro = new JTextField();
    tfNombreLibro.setBounds(130,30,120,20);
    add(tfNombreLibro);
    
    //Cajas de texto 
    tfAñoDeEdicion = new JTextField();
    tfAñoDeEdicion.setBounds(150,110,120,20);
    add(tfAñoDeEdicion);

    //Cajas de texto 
    ckBoton = new JCheckBox();
    ckBoton.setBounds(150,150,20,20);
    add(ckBoton);


    //Crear y agregar combo lista Empleados
    autor = new JTextField();
    autor.setBounds(150,70,120,20);
    this.add(autor);


    }
    //Metodos de acceso a la informacion 
    public String getNombreLibro()
    {
        return tfNombreLibro.getText();
    }
    public String getNombreAutor()
    {
        return autor.getText();
    }
    public String getAñoEdicion()
    {
        return tfAñoDeEdicion.getText();
    }
    public Boolean getDeLujo()
    {
        return ckBoton.isSelected();
    }
    
}


