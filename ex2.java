

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ex2 extends JApplet {

    JRadioButton i = new JRadioButton("I");
    JRadioButton you = new JRadioButton("You");
    JRadioButton he = new JRadioButton("He");
    ButtonGroup gp1 = new ButtonGroup();
    
    JRadioButton am = new JRadioButton("Am");
    JRadioButton is = new JRadioButton("Is");
    JRadioButton are = new JRadioButton("Are");
    ButtonGroup gp2 = new ButtonGroup();
    
    JRadioButton sanjay = new JRadioButton("Sanjay");
    JRadioButton chetan = new JRadioButton("Chetan");
    JRadioButton mohan = new JRadioButton("Mohan");
    ButtonGroup gp3 = new ButtonGroup();
    
    JButton gen = new JButton(" Genrate String ");
    JLabel s1 = new JLabel(" Genrated String ");
    
    String s2 = "";
    public void init() {
        //for group 1
        gp1.add(i);
        i.setActionCommand(" I ");
        gp1.add(you);
        you.setActionCommand(" You ");
        gp1.add(he);
        he.setActionCommand(" He ");
        //for group 2
        gp2.add(am);
        am.setActionCommand(" Am ");
        gp2.add(is);
        is.setActionCommand(" Is ");
        gp2.add(are);
        are.setActionCommand(" Are ");
        //for group 3
        gp3.add(sanjay);
        sanjay.setActionCommand(" Sanjay ");
        gp3.add(chetan);
        chetan.setActionCommand(" Chetan ");
        gp3.add(mohan);
        mohan.setActionCommand(" Mohan ");
        JFrame fr = new JFrame();
        fr.setSize(300,250);
        fr.setLayout(null);
      
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        p1.add(i);
        p1.add(am);
        p1.add(sanjay);
        p1.setBounds(0,0,200,30);
        
        p2.add(you);
        p2.add(is);
        p2.add(chetan);
        p2.setBounds(0,40,200,30);
            
        p3.add(he);
        p3.add(are);
        p3.add(mohan);
        p3.setBounds(0,80,200,30);
        
        p4.add(gen);
        p4.add(s1);
        
        p4.setBounds(0,120,300,40);
        
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        fr.setVisible(true);
        gen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    s2 = "";
                    s2 +=  gp1.getSelection().getActionCommand();
                    s2 +=  gp2.getSelection().getActionCommand();
                    s2 +=  gp3.getSelection().getActionCommand(); 
                    s1.setText(s2);
            }
        });
    }
}
