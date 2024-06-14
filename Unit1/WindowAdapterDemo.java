
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowAdapterExample {
    JFrame f1;
    public void setWindowAdapter(){
        f1 = new JFrame();
        
        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(3);
        
        f1.addWindowListener(new WindowAdapter(){
              @Override
            public void windowOpened(WindowEvent e){
                //when window is open and start working
                System.out.println("Window working");
            }
            @Override
            public void windowClosed(WindowEvent e){
                //when window is exceptionally closed
                System.out.println("Window closed");
            }
            @Override
            public void windowActivated(WindowEvent e){
                //when window is working
                System.out.println("Window activated");
            }
            @Override
            public void windowDeactivated(WindowEvent e){
                //when window is not working
                System.out.println("Window deactivated");
            }
        });
    }
}
public class WindowAdapterDemo {
    public static void main(String[] args) {
        WindowAdapterExample w = new WindowAdapterExample();
        w.setWindowAdapter();
    }
}
