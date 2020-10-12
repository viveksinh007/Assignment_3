
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class ex3 extends JApplet {

    
    public void init() {
        
        JFrame fr = new JFrame();
        fr.setSize(300,300);
        JPanel top = new JPanel();
        String []key = { "1" , "2" , "3" , "4" , "5" };
        for (int i = 0; i < key.length; i++) 
        {
                JButton button = new JButton(key[i]);
                top.add(button);
        }
        top.setLayout(new GridLayout(1,5));
        JPanel mid = new JPanel();
        JButton button1 = new JButton(" mid 1");
        JButton button2 = new JButton(" mid 2");
        mid.add(button1);
        mid.add(button2);
        mid.setLayout(new GridLayout(2,1));
        fr.add(top,BorderLayout.NORTH);
        fr.add(mid,BorderLayout.CENTER);
        fr.setVisible(true);
    }

    
}
