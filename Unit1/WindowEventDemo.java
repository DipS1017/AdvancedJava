/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//window is triggered whenever a window (JFrame, Jpanel)is active (working),
//minimize, back to //active ,deactivate,close)
class WindowExample{
    JFrame f1;
    public void setWindow(){
        f1=new JFrame();
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(3);
        //handeling window event in JFrame
        f1.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e){
                //when window is open and start working
                System.out.println("window working");
            }
           @Override
           public void windowClosing(WindowEvent e){
               System.out.println("When window is closing");
           }
            @Override
            public void windowClosed(WindowEvent e){
                //when window is exceptionally closed
                System.out.println("window closed");
                        
            }
            @Override
            public void windowIconified(WindowEvent e){
                //when window is minimized
                System.out.println("window is minimized (iconified)");
            }
            @Override
            public void windowDeiconified(WindowEvent e){
                //when window is back to active after minimmized
                System.out.println("Window back to normal"+"after minimized");
            }
            @Override
            public void windowActivated(WindowEvent e){
                //when window is workign  
                System.out.println("Window is active ");
            }
            @Override
            public void windowDeactivated(WindowEvent e){
                //window is not working
                System.out.println("window is deactivated");
            }
        });
    }
}
public class WindowEventDemo {
    public static void main(String[] args) {
        WindowExample W1=new WindowExample();
    W1.setWindow();
    }
    
}
