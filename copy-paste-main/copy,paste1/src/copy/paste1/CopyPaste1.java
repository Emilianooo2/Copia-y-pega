package copy.paste1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyPaste1 extends JFrame {
    private JLabel Texto = new JLabel("Copiar y pegar");
    private JTextField textcopy = new JTextField(10);
    private JTextField textPaste = new JTextField(10);  
    private JButton copy = new JButton("copiar");
    private JButton paste = new JButton("pegar");
    private String textbox; 

    public CopyPaste1() {
       setTitle("Operaciones Básicas");
       setSize(350, 300);
       setLocationRelativeTo(null); 
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
       
       
       addComponentes();
    }

    private void addComponentes() {
       
        add(Texto);
        add(textcopy);
        add(copy);
        add(paste);
        add(textPaste); 

        // Evento para el botón copiar
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textbox = textcopy.getText();
            }
        });

        // Evento para el botón pegar
        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPaste.setText(textbox);  
            }
        });
    }

    public static void main(String[] args) {
       CopyPaste1 ventana = new CopyPaste1();
       ventana.setBackground(Color.yellow);
       ventana.setVisible(true);
    }
}
