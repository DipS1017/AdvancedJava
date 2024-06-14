
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//border layout placea the swing controls (content) in term of direction
//It divides the window into five parts.
//i.e. top(north), button(south), left(east), right(west), middle(centre)
//the content are placed in such partition

class BorderExample extends JFrame{
    JButton b1, b2, b3, b4;
    JTextArea t1;
    public void setBorders(){
        b1 = new JButton("NorthButton");
        b2 = new JButton("SouthButton");
        b3 = new JButton("EastButton");
        b4 = new JButton("WestButton");
        t1 = new JTextArea(20, 20);
        
        setVisible(true);
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(3);
        
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(t1,BorderLayout.CENTER);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("North Pressed");
            }
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("South Pressed");
            }
        });
         b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("East Pressed");
            }
        });
         b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("West Pressed");
            }
        });
    }
}
public class BorderLayoutDemo {
    public static void main(String[] args) {
        BorderExample be1 = new BorderExample();
        be1.setBorders();
    }
}
