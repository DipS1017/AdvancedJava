package Unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//mousemotion event is triggered when mouse is dragged 
//and cursor is moved inside componet. mouse wheel
//two mwthod
//mouse wheel event is triggered when wheel 
//of mouse is moved i.e. mouse is scrolled. it contains one method

class MouseControls2 extends JFrame{
    JTextArea t1;//used fro multi line text
    JTextField tf1;
    JLabel l1, l2;
    public void setMouse1(){
        t1= new JTextArea(20, 20);
        l1= new JLabel("Result");
        tf1 = new JTextField(20);
        l2= new JLabel("Result for mouse wheel");
        add(t1);add(l1);
        add(tf1);add(l2);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        //handling mouse motion event in TextArea
        t1.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e){
               //when mouse is dragged inside componet
               l1.setText("mouse dragged at" + e.getX()+","+e.getY());
            }
            
             @Override
            public void mouseMoved(MouseEvent e){
                l1.setText("mouse move at" + e.getX()+","+e.getY());
            }
        });
        //handling mouse wheel event in tf1(textfield)
        //this event is triggered when wheel of the mouse is moved
        tf1.addMouseWheelListener(new MouseWheelListener(){
        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
            l2.setText("wheel moved at"+e.getX()+","+e.getY());
        }
    });
}
}
public class MouseMotionAndWheelDemo {
    public static void main(String[] args){
        MouseControls2 m2 = new MouseControls2();
        m2.setMouse1();
    }
}