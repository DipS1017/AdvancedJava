package Unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//mouse event is generated whenever user press
//mouse, release mouse, clicked, enter into comp,
//exited from componetn. to handle mouse event,
//mouse listener is used and contains 5 method which
//should be overridden by class
class MouseControls extends JFrame{
    JTextArea t1;//used fro multi line text
    JLabel l1;
    public void setMouse(){
        t1= new JTextArea(20, 20);
        l1= new JLabel("Result");
        add(t1);add(l1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        //handling mouse event in JTextArea
        t1.addMouseListener(new MouseListener(){
        //contains 5 method which should be compulsary override
          @Override
          public void mouseClicked(MouseEvent e){
              //when mouse is cliked and released
              l1.setText("mouse is clicked");
          }
          @Override
           public void mouseReleased(MouseEvent e){
                //when mouse is clicked inside componetnt
               //and released out of component
              l1.setText("mouse is released");
          }
           @Override 
           public void mousePressed(MouseEvent e){
             //mouse is continously clicked
               l1.setText("mouse pressed");
           }
           @Override
           public void mouseEntered(MouseEvent e){
               //when mouse cursor enter into component
               l1.setText("mouse enetered in text area");
           }
           @Override
           public void mouseExited(MouseEvent e){
               //when mouse cursir exits from component
               l1.setText("mouse exited from txtarea");
           }
    });
        
    }
}
public class MouseEventDemo {
    public static void main(String[] args){
        MouseControls m1 = new MouseControls();
        m1.setMouse();
    }
}