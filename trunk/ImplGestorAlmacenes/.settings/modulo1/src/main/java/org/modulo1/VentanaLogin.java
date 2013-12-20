package main.java.org.modulo1;

import javax.swing.*;

import dominio.AgenteUsuario;

import java.io.*;
import java.sql.*;
import java.awt.Panel.*;
import java.awt.*;
import java.awt.event.*;
 
public class VentanaLogin extends JFrame
{
        private JTextField txtUser, txtPass;
        private JLabel lblUser, lblPass;
        String usuario, elPassword;
        private JLabel label;
        private JButton btnCancelar;
        private JButton btnAceptar;
 
    public VentanaLogin()    {
 
        Container contenedor = getContentPane();
               getContentPane().setLayout(null);
               
               label = new JLabel("");
               label.setBounds(33, 11, 410, 180);
               label.setHorizontalAlignment(SwingConstants.CENTER);
               label.setIcon(new ImageIcon("img/mercadona.gif"));
               getContentPane().add(label);
               Component verticalStrut = Box.createVerticalStrut(50);
               verticalStrut.setBounds(0, 0, 0, 0);
               contenedor.add( verticalStrut );
               lblUser = new JLabel("Usuario: ");
               lblUser.setBounds(33, 202, 65, 14);
               contenedor.add(lblUser);
        
               // crear etiqueta y cuadro de texxto del usuario
               txtUser = new JTextField(10);
               txtUser.setBounds(108, 199, 81, 20);
               txtUser.setToolTipText("Escriba su nombre de usuario");
               contenedor.add(txtUser);
               lblPass = new JLabel("Contraseña: ");
               lblPass.setBounds(199, 202, 81, 14);
               contenedor.add(lblPass);
        
               //crear etiqueta y cuadro de texxto del pw
               txtPass = new JPasswordField(10);
               txtPass.setBounds(290, 199, 81, 20);
               txtPass.setToolTipText("Escriba su contraseña");
               contenedor.add(txtPass);
               
                      //Crear y agregar los botones 
                      btnAceptar = new JButton("Aceptar");
                      btnAceptar.setBounds(133, 230, 100, 60);
                      //establecer Boton aceptar por defecto
                      getRootPane().setDefaultButton(btnAceptar);
                      contenedor.add(btnAceptar);
                      
                             btnCancelar = new JButton("Cancelar");
                             btnCancelar.setBounds(242, 230, 100, 60);
                             contenedor.add(btnCancelar);
                             btnCancelar.addActionListener(new escuchadorbtnCancelar());      // Asociar escuchador para el boton Cancelar
                             btnAceptar.addActionListener(new escuchadorbtnAceptar());      // Asociar escuchador para el boton Aceptar
 
 
 
      // Crear un escuchador al boton Aceptar 
      
 
 
      // Agregar escuchador al boton Cancelar
        
        
        setTitle("Autentificacion de usuarios");
        setSize(482,326);           // Tamanio del Frame 
        setResizable(false);       // que no se le pueda cambiar el tamanio 
        //Centrar la ventana de autentificacion en la pantalla
        Dimension tamFrame=this.getSize();//para obtener las dimensiones del frame
        Dimension tamPantalla=Toolkit.getDefaultToolkit().getScreenSize();      //para obtener el tamanio de la pantalla
        setLocation((tamPantalla.width-tamFrame.width)/2, (tamPantalla.height-tamFrame.height)/2);  //para posicionar
        setVisible(true);           // Hacer visible al frame 
 
    }   // fin de constructor
 
    // Metodo que conecta con el servidor MYSQL y valida los usuarios
    boolean validarUsuario(String elUsr, String elPw)  throws IOException
    {
        try
        {
        	boolean valido=false;
            AgenteUsuario agentUser= new AgenteUsuario();
            valido= agentUser.consultUsuario(elUsr).getPassword().equals(elPw); 
            return valido;
        } catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
 
    }
    
    class escuchadorbtnAceptar implements ActionListener {
  	  public void actionPerformed(ActionEvent e) {
          
              try
              {                    
                  //chekar si el usuario escrbio el nombre de usuario y pw
                  if (txtUser.getText().length() > 0 && txtPass.getText().length() > 0 )
                  {
                      // Si el usuario si fue validado correctamente
                      if( validarUsuario( txtUser.getText(), txtPass.getText() ) )    //enviar datos a validar
                      {
                          // Codigo para mostrar la ventana principal
                          JOptionPane.showMessageDialog(null, "Bienvenido "+txtUser.getText());
                          setVisible(false);
                          MenuPrincipal ventana1 = new MenuPrincipal();
                          ventana1.main(null);

                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contrasenia no son validos.");
                          JOptionPane.showMessageDialog(null, txtUser.getText()+" " +txtPass.getText() );
                          txtUser.setText("");    //limpiar campos
                          txtPass.setText("");        
                           
                          txtUser.requestFocusInWindow();
                      }

                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contrasenia.\n" +
                          "NO puede dejar ningun campo vacio");
                  }

              } catch (Exception ex)
              {
                  ex.printStackTrace();
              }
               
          }
      }
     
    public static void main(String[] args)
    {
        VentanaLogin prueba = new VentanaLogin();
        prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
    }
    
    class escuchadorbtnCancelar implements ActionListener {
        public void actionPerformed(ActionEvent evt)
        {
            System.exit(0);         // terminar el programa
        }
    }
 
}