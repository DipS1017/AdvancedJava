
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//card layout places the content as a sequence of card that is one component is placed after another component.
//for eg: after first button, second is placed
//first component visible where as other is hide
class CardEg extends JFrame{
    JButton b1, b2, b3, b4;
    //sreating sub window panel
    JPanel p1;
    public void setCards(){
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        
        //adding component into pannel 
        p1 = new JPanel();
        CardLayout c1 = new CardLayout();
        p1.setLayout(c1);
        p1.add(b1, "but1"); 
        p1.add(b2,"but2");
        p1.add(b3,"but3"); 
        p1.add(b4, "but4");
        //creating card layout
       
        add(p1);
        
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(3);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
             //to display next component
             //c1.next(p1);
             //to display last event
             //c1.last(p1);
             //to move back
             //c1.previous(p1);
             //to move on any component out our choice
             c1.show(p1, "but3");
            }
        });
    }
}
public class CardLayoutDemo {
    public static void main(String[] args) {
        CardEg ca1 = new CardEg();
        ca1.setCards();
                
    }
}
