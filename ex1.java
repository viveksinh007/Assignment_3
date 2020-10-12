
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ex1 extends JApplet {

    
    JRadioButton red = new JRadioButton("Red");
    JRadioButton green = new JRadioButton("Green");
    JRadioButton blue = new JRadioButton("Blue");
    ButtonGroup gp = new ButtonGroup();
    
    public void init() {
        
        
        setLayout(new FlowLayout());
        gp.add(red);
        gp.add(green);
        gp.add(blue);
        JPanel p1 = new JPanel();
        
        p1.add(red);
        p1.add(green);
        p1.add(blue);
        add(p1);
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               p1.setBackground(Color.red);
            }
        });
	green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               p1.setBackground(Color.green);
            }
        });
	blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               p1.setBackground(Color.blue);
            }
        });     
    }
}
