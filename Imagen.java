/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos_pp_aa;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISTLOJA_05
 */
public class Imagen {

    JList l = new JList();
    JLabel ta = new JLabel();
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JTextField tf =new JTextField() ;
    JPanel p= new JPanel() ;
    JButton b = new JButton();

    public void Imagen() {
        setVisible(true);
        setBounds(100, 50, 700, 500);//Define posicion en x ,y and la dimencion en una sola linea
        setTitle("Trabajo Grupal");

        p = new JPanel();
        p.setBackground(Color.BLUE);
        setContentPane(p);

        p.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Agregar Los componenetes
        l = new JList();
        b = new JButton(" escoja entre una de las frutas");
        //Etiqueta Image Icon

        l1 = new JLabel(" fruta");
        l2 = new JLabel(" Fruta");
        l3 = new JLabel("Fruta");
        tf = new JTextField();

        //Agregar imagenes 
        l1.setBounds(50, 50, 130, 25);
        p.add(l1);

        String[] cx = {"mora", "fresa", "uva", "sandia"};
        l = new JList(cx);

        //Agregamos todos los componentes con un setBounds x y ancho y largo
        l.setBounds(50, 80, 100, 80);
        p.add(l);

        b.setBounds(50, 170, 120, 20);
        p.add(b);

        l2.setBounds(300, 50, 130, 25);
        p.add(l2);

        l3.setBounds(50, 225, 130, 25);
        p.add(l3);

        tf.setBounds(50, 250, 400, 25);
        p.add(tf);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = lista(l.getSelectedIndex());

            }

            private int lista(int a) {
                if (a == 0) {
                    tf.setText("La mora una fruta pequeña del frio que es muy rica  ");

                    JLabel l1 = new JLabel(new ImageIcon("mora.jpg"));
                    l1.setBounds(300, 80, 150, 150);
                    p.add(l1);

                }
                if (a == 1) {

                    tf.setText("La fresa una fruta que se come con yogurt  ");
                    JLabel l1 = new JLabel(new ImageIcon("fresa.jpg"));
                    l1.setBounds(300, 80, 150, 150);
                    p.add(l1);

                }
                if (a == 2) {
                    tf.setText("La uva es considerada la fruta del placer   ");
                    JLabel l1 = new JLabel(new ImageIcon("uva.jpg"));
                    l1.setBounds(300, 80, 150, 150);
                    p.add(l1);
                }
                if (a == 3) {
                    tf.setText("La sandia es una de las frutas mas grandes y crece en enredadera ");
                    JLabel l1 = new JLabel(new ImageIcon( "mora.jpg"));
                    l1.setBounds(300, 80, 200, 150);
                    p.add(l1);
                }

                return 0;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    
}



