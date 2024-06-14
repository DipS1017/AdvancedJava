package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Key event is triggered whenevr key of keyboard istyped, pressed and released.
//It contains three method which should be handeled
class KeyControls{
    JTextArea t1;
    JLabel l1;
    JFrame f1;
    public void setKey(){
        t1 = new JTextArea(20, 20);
        l1 = new JLabel("Result");
        f1 = new JFrame();
        f1.add(t1); f1.add(l1);
        
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(3);
        
        //handling key event in textarea
        t1.addKeyListener(new KeyListener(){
            //contain three method
            public void keyTyped(KeyEvent e){
                //when key is pressed continously
                //it is triggered for primary keys
                l1.setText("Key is continously pressed.");
            }
            public void keyPressed(KeyEvent e){
                //when key is pressed and released
                //it is triggered if control key are pressed and released
                l1.setText("Key is pressed and released.");
            }
            public void keyReleased(KeyEvent e){
                //when key is released out of componennt
                l1.setText("Key is released.");
            }
        });
    }
}
public class KeyEventDemo {
    public static void main(String[] args) {
        KeyControls k = new KeyControls();
        k.setKey();
    }
}
