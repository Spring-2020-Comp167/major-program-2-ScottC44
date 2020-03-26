import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    public JButton jcomp1;
    public JButton jcomp2;
    public JComboBox jcomp3;
    public JTextField jcomp4;
    public JLabel jcomp5;
    public JLabel jcomp6;
    public JLabel jcomp7;
    public JTextField jcomp8;
    public static JTextArea jcomp9;
    public JLabel jcomp10;
    public JLabel jcomp11;

    public MyPanel() {
        //construct preComponents
        String[] jcomp3Items = {"Car", "Truck", "SUV", "Van"};

        //construct components
        jcomp1 = new JButton ("Remove");
        jcomp2 = new JButton ("Add");
        jcomp3 = new JComboBox (jcomp3Items);
        jcomp4 = new JTextField (5);
        jcomp5 = new JLabel ("Remove (ID):");
        jcomp6 = new JLabel ("Add a(n):");
        jcomp7 = new JLabel ("CARMAX");
        jcomp8 = new JTextField (5);
        jcomp9 = new JTextArea (5, 5);
        jcomp10 = new JLabel ("Add a vehicle:");
        jcomp11 = new JLabel ("Vehicle Database");

        //adjust size and set layout
        setPreferredSize (new Dimension (463, 568));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (325, 35, 100, 20);
        jcomp2.setBounds (325, 65, 100, 20);
        jcomp3.setBounds (110, 60, 170, 25);
        jcomp4.setBounds (110, 30, 170, 25);
        jcomp5.setBounds (5, 30, 100, 25);
        jcomp6.setBounds (5, 60, 65, 25);
        jcomp7.setBounds (5, 5, 100, 25);
        jcomp8.setBounds (25, 130, 360, 160);
        jcomp9.setBounds (25, 320, 360, 225);
        jcomp10.setBounds (25, 105, 100, 25);
        jcomp11.setBounds (25, 290, 100, 25);
    }



}
