
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//focus event is triggeres when any component ngets focus of mouse or keyboard.
//to handle focus listener is used. it has two methods
//i.e. focusGained, focusllots
class FocusExample extends JFrame{
    JButton b1, b2;
    JLabel l1;
    public void setFocus(){
        b1 = new JButton("button 1");
        b2 = new JButton("button 2");
        l1 = new JLabel("Result");
        
        add(b1); add(b2); add(l1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        
        //handling focus event in b1
        b1.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){
                l1.setText("b1 gets focused");
            }
            @Override
            public void focusLost(FocusEvent e){
                l1.setText("b1 lost the focus");
            }
        });
    }
}
public class FocusEventDemo {
    public static void main(String[] args) {
        FocusExample f1 = new FocusExample();
        f1.setFocus();
    }
}
