
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//window event is triggered whenever window (JFrame, Jpanel ) is active (working),
//minimize, back to Active, deactivate, close)
class WindowExample{
    JFrame f1;
    public void setWindow(){
        f1 = new JFrame();
        
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(3);
        //handling window event in JFrame
        f1.addWindowListener(new WindowListener(){
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
            public void windowClosing(WindowEvent e){
                //when window is closed using menu bar
                System.out.println("Window closing");
            }
            @Override
            public void windowIconified(WindowEvent e){
                //when window is minimized
                System.out.println("Window minimized(iconified)");
            }
            @Override
            public void windowDeiconified(WindowEvent e){
                //when window is back to active after minimizing
                System.out.println("Window Back to normal after minimizing");
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
public class WindowEventDemo {
    public static void main(String[] args) {
        WindowExample w1 = new WindowExample();
        w1.setWindow();
    }
}
