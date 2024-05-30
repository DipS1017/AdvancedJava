/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//key event is triggered when ever a keyboard is typed,pressed and released
//method which should be handeled 
class KeyControls {
JTextArea t1;
JLabel l1;
JFrame f1;
public void setKey(){
    t1=new JTextArea (20,20);
    l1= new JLabel("result");
    f1= new JFrame();
    f1.add(t1);f1.add(l1);
    f1.setVisible(true);
    f1.setSize(500,500);
    f1.setLayout(new FlowLayout());
    f1.setDefaultCloseOperation(3);
    
    //handeling key event in TextArea
    t1.addKeyListener(new KeyListener(){
        //contains three method
        public void keyTyped(KeyEvent e){
            //when key is pressed continiously
            l1.setText("Key is continiously Pressed");
        }
        public void keyPressed(KeyEvent e){
            //when key is pressed and release
            //it is triggered when control key are pressed and released
            l1.setText("when key is pressed and released");
                    
        }
        public void keyReleased(KeyEvent e){
            l1.setText("when key is released");
        }
    });
}
}

public class KeyEventDemo {
    public static void main(String[] args) {
        KeyControls K1=new KeyControls ();
        K1.setKey();
    }
    
}
