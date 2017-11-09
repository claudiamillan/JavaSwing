/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaJavaSwing;
//PASO 1 - IMPORTAMOS LAS LIBRERIAS
import javax.swing.*;//Importamos TODO de swing
import java.awt.*;

/**
 *
 * @author lab12
 */
public class miventana extends JFrame 
   
//PASO 2 - HEREDAR LA CLASE DESDE JFRAME

{
 //PASO 3 - DECLARAR ELEMENTOS A UTILIZAR
 JPanel panel;
 JLabel label;
 JTextField text;
 JButton boton;
 JCheckBox verificación;
 JRadioButton presionar;
 
 
//PASO 4 - DEFINIR EL CONSTRUCTOR
public miventana()
{
//PASO 5 - CREAR E INICIALIZAR LOS OBJETOS
panel = new JPanel();//Creo un objeto tipo JPanel
label = new JLabel();
text = new JTextField(10);//10 es la cant de caracteres
boton = new JButton();
verificación= new JCheckBox();
presionar = new JRadioButton();

//PASO 6 - AGREGAR LOS ELEMENTOS AL JFRAME
this.add(panel);//Recomendable agregar el JPanel al JFrame
panel.add(label);
panel.add(text);
panel.add(boton);
panel.add((verificación)
panel.add(presionar)
        
//PASO 7 - PROPIEDADES DE LOS OBJETOS
label.setText("Nombre");
boton.setText("Enviar");
panel.setBackground(Color.red);//Color de fondo de JPanel
    
}
