/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//mouse even is generated whenever user press mouse, releasemouse,clicked,
//enter into comp,//exited from compononet ,to handle mouse event,
//mouse listener is used and contains 5 method which should be overriden by class
class MouseControls extends JFrame{
    JTextArea t1;
    JLabel l1;
    public void setMouse(){
        t1 = new JTextArea(20,20);
        l1=new JLabel("Result");
        add(t1);add(l1);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        
        //when handeling mouse event in JTextArea
        
        t1.addMouseListener(new MouseListener(){
            //contains 5 methods which should be compulsary override
            
            @Override
            public void mouseClicked(MouseEvent e){
                //when mouse is clicked and released 
                l1.setText("mosue is clicked");
            }
            @Override
            public void mouseReleased(MouseEvent e){
               //when mouse is clicked inside component and released out of 
                //component
                l1.setText("mouse is released");
            }
            @Override
            public void  mousePressed(MouseEvent e){
                
                //when mosue is continiously clicked
                l1.setText("Mouse is pressed");
            }
            @Override 
            public void mouseEntered(MouseEvent e){
                //when mosue enter into the componet
                l1.setText("mouse entered in text area");
            }
            @Override
            public void mouseExited (MouseEvent e){
                //when mouse cursor exits from componet
                l1.setText("mouse exited from textarea");
            }
        });
        
    }
    
    
}
public class MouseEventDemo {
    public static void main(String[] args) {
        MouseControls m1= new MouseControls();
            m1.setMouse();
        }
    }

