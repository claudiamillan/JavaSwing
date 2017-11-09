/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
//PASO 8 - IMPORTAR LA CLASE CON LA VENTANA
import VentanaJavaSwing.miventana;// import paquete.miventana
import javax.swing.JFrame;

/**
 *
 * @author lab12
 */
public class JavaSwing 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //PASO 9 - LLAMADO A LA CLASE JFRAME
        miventana ventana = new miventana();//Creo un objeto tipo Window 
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 600, 800);
        //La siguiente inst. le pone titulo a la ventana
        ventana.setTitle("Mi primer interfaz grafica");
        //La siguiente sentencia es para finalizar el proyecto al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
