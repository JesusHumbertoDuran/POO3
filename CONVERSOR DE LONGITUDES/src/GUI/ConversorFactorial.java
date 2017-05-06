package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import MUNDOS.mifacto;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConversorFactorial extends JFrame
{
 //Elementos de la ventana
 Container C;
 //Etiquetas
 JLabel lblNumero, lblCalcular, lblResultados, lblTitulo;
 //Campos de texto
 JTextField tfNumero, tfCalcular, tfResultado;
 //Area de texto
 JTextArea taResultado;
 //Botones
 JButton btCalcular,btBorrar;

 //objeto de tipo circulo
 mifacto mifacto;
 
public String m;

 //constructor de la ventana
 public ConversorFactorial()
 { //Titulo Ventana
 super("Conversor 1.0");

 //Contenedor De la Ventana
 C = getContentPane();
 C.setBackground(new Color(250,250,250));
 C.setLayout(null);
 
 lblNumero=new JLabel("NUMERO:",JLabel.RIGHT);
 C.add(lblNumero);
 lblNumero.setBounds(10,100,150,30);
 lblNumero.setFont(new Font("Arial",Font.BOLD,25));
 lblNumero.setForeground(Color.BLUE);

 tfNumero = new JTextField(20);
 C.add(tfNumero);
 tfNumero.setBounds(200,100,150,30);
 tfNumero.setFont(new Font("Arial",Font.BOLD,30));
 tfNumero.setBackground(Color.PINK);

 //Creacion de elementos de la Ventana

 lblTitulo=new JLabel("FACTORIAL",JLabel.LEFT);
 C.add(lblTitulo);
 lblTitulo.setBounds(200,5,450,40);
 lblTitulo.setFont(new Font("Arial",Font.BOLD,30));
 lblTitulo.setForeground(Color.BLUE);


 lblResultados = new JLabel ("RESULTADOS:", JLabel. CENTER);
 C.add(lblResultados);
 lblResultados.setBounds (150, 300,300,30);
 lblResultados.setFont(new Font("Arial",Font.BOLD,30));
 lblResultados.setForeground(Color.BLUE);

 taResultado = new JTextArea (20,200);
 C.add (taResultado);
 taResultado.setBounds(50,380,500,130);
 taResultado.setForeground(Color.blue);
 taResultado.setFont(new Font("Arial",Font.BOLD,20));
 taResultado.setBackground(Color.PINK);
 taResultado.setText("");


 btCalcular = new JButton ( "Calcular");
 C.add (btCalcular);
 btCalcular.setBounds(150,200,100,30);
 btCalcular.addActionListener (new OyenteBotonCalcular());



 btBorrar = new JButton("Borrar");
 C.add (btBorrar);
 btBorrar.setBounds(350,200,100,30);
 btBorrar.addActionListener (new OyenteBotonBorrar());

 //caracteristicas de la ventana
 setSize(600,550);
 setLocation(0,0);
 setVisible(true);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setResizable(false);

 //creacion del objeto mi circulo
 ConversorFactorial mifacto= new ConversorFactorial();
 }
 //Oyentes de los botones
 class OyenteBotonCalcular implements ActionListener
 {
 public void actionPerformed (ActionEvent ae)
 {
 try
 {
     double m =Double.parseDouble(tfNumero.getText());
mifacto.darFactorial();

//operaciones

taResultado.append("EL NUMERO FACTORIAL DE: " + mifacto.darFactorial()+" ES: ");
taResultado.append("\n: "+mifacto.darFactorial());

}
 catch (Exception e)
{
// TODO: handle exception

}
 }
 }

 class OyenteBotonBorrar implements ActionListener
 {
 public void actionPerformed (ActionEvent ae)
 {
 //Operacion del boton bt borrar
 tfNumero.setText ("");
 taResultado.setText(" ");
 }
 }

 //metodo principal
 public static void main(String[]args){
 
 ConversorFactorial miVentana=new  ConversorFactorial();
 
 
 

 }
}