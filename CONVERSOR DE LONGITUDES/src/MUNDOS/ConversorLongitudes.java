package MUNDOS;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import GUI.calculo;

public class ConversorLongitudes extends JFrame {
     //Elementos de la ventana
 Container C;
 //Etiquetas
 JLabel lblMetros, lblImagen, lblCalcular, lblPulgadas, lblResultados,lblTitulo, lblCm, lblPies, lblKilometros;
 //Campos de texto
 JTextField tfMetros, tfPulgadas, tfCm, tfPies, tfKilometros;
 //Area de texto
 JTextArea taResultado;
 //Botones
 JButton btCalcular,btBorrar;

 //objeto de tipo circulo
 calculo miCalculo;
public String m;

 //constructor de la ventana
 public ConversorLongitudes()
 { //Titulo Ventana
 super("Conversor 1.0");

 //Contenedor De la Ventana
 C = getContentPane();
 C.setBackground(new Color(250,250,250));
 C.setLayout(null);

 //Creacion de elementos de la Ventana

 lblTitulo=new JLabel("Conversor de Longitudes",JLabel.LEFT);
 C.add(lblTitulo);
 lblTitulo.setBounds(60,5,450,40);
 lblTitulo.setFont(new Font("Arial",Font.BOLD,30));
 lblTitulo.setForeground(Color.BLUE);


 lblMetros=new JLabel("Metros:",JLabel.RIGHT);
 C.add(lblMetros);
 lblMetros.setBounds(300,100,120,30);
 lblMetros.setFont(new Font("Arial",Font.BOLD,25));
 lblMetros.setForeground(Color.BLUE);

 tfMetros = new JTextField(20);
 C.add(tfMetros);
 tfMetros.setBounds(430,100,150,30);
 tfMetros.setFont(new Font("Arial",Font.BOLD,30));
 tfMetros.setBackground(Color.PINK);

 lblResultados = new JLabel ("RESULTADOS:", JLabel. CENTER);
 C.add(lblResultados);
 lblResultados.setBounds (10, 320,300,30);
 lblResultados.setFont(new Font("Arial",Font.BOLD,30));
 lblResultados.setForeground(Color.BLUE);

 taResultado = new JTextArea (20,200);
 C.add (taResultado);
 taResultado.setBounds(5,380,500,130);
 taResultado.setForeground(Color.blue);
 taResultado.setFont(new Font("Arial",Font.BOLD,20));
 taResultado.setBackground(Color.PINK);
 taResultado.setText("Aqui se registrarán los resultados...");


 btCalcular = new JButton ( "Calcular");
 C.add (btCalcular);
 btCalcular.setBounds(380,320,100,30);
 btCalcular.addActionListener (new OyenteBotonCalcular());



 btBorrar = new JButton("Borrar");
 C.add (btBorrar);
 btBorrar.setBounds(480,320,100,30);
 btBorrar.addActionListener (new OyenteBotonBorrar());


 /*lblImagen=new JLabel(new ImageIcon(getClass().getResource("/imagenes/a.jpg")));
 lblImagen.setBounds(0,0,250,400);
 C.add(lblImagen);*/

 //caracteristicas de la ventana
 setSize(600,550);
 setLocation(0,0);
 setVisible(true);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setResizable(false);

 //creacion del objeto mi circulo
 miCalculo=new calculo();
 }

 //Oyentes de los botones
 class OyenteBotonCalcular implements ActionListener
 {
 public void actionPerformed (ActionEvent ae)
 {
 try
 {
double m =Double.parseDouble(tfMetros.getText());
miCalculo.leerDatos(m);
//operaciones
miCalculo.calcularPulgadas();
miCalculo.calcularCm();
miCalculo.calcularPies();
miCalculo.calcularKilometros();
//salida
taResultado.append("\nlas pulgadas son: "+miCalculo.darPulgadas());
taResultado.append("\nlos cm son: "+miCalculo.darCm());
taResultado.append("\nlos pies son: "+miCalculo.darPies());
taResultado.append("\nlos Kilometros son: "+miCalculo.darKilometros());

}
 catch (Exception e)
{
// TODO: handle exception
 JOptionPane.showMessageDialog(null, "Datos de ingreso no valido",
"error",JOptionPane.ERROR_MESSAGE);
}
 }
 }

 class OyenteBotonBorrar implements ActionListener
 {
 
 public void actionPerformed (ActionEvent ae)
 {
 //Operacion del boton bt borrar
 tfMetros.setText ("");
 taResultado.setText(" ");
 }
 }

 //metodo principal
 public static void main(String[]args)
 {
 ConversorLongitudes miVentana=new ConversorLongitudes();
 }
}
    
