package mformulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class jsFormulario extends JFrame implements ActionListener{
    
    public jsFormulario(){
        
    }
    
    public void ventana(){
        JPanel no = new JPanel();
        setBounds(50, 50, 750, 800);
        setTitle("Formulario");
        setBackground(Color.green);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        componentes();
    }

    public void componentes(){
        JLabel titulo = new JLabel("Formulario");
        titulo.setBounds(350, 50, 100, 50);
        add(titulo);
        
        JLabel nombre = new JLabel("Nombre");
        nombre.setBounds(200, 200, 100, 50);
        add(nombre);
        
        JLabel apePa = new JLabel("Apellido Paterno");
        apePa.setBounds(200, 300, 100, 50);
        add(apePa);
        
        JLabel apeMa = new JLabel("Apellido Materno");
        apeMa.setBounds(200, 400, 100, 50);
        add(apeMa);
        
        JLabel escuela = new JLabel("Escuela");
        escuela.setBounds(200, 500, 100, 50);
        add(escuela);
        
        JTextField name = new JTextField();
        name.setBounds(350, 200, 150, 50);
        add(name);
        
        JTextField subPa = new JTextField();
        subPa.setBounds(350, 300, 150, 50);
        add(subPa);
        
        JTextField subMa = new JTextField();
        subMa.setBounds(350, 400, 150, 50);
        add(subMa);
        
        JTextField school = new JTextField();
        school.setBounds(350, 500, 150, 50);
        add(school);
        
        JButton enviar = new JButton("Enviar");
        enviar.setBounds(350, 600, 100, 50);
        enviar.setBackground(Color.cyan);
        add(enviar);
        
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
