
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//using delegation event (listener) we have to use all the pre-defined method
//But by using adapter class we can impplement any  number of pre-defined method
//i.e if event contains 5 method then we can have choice like we can 1,, 2 , 3 ore all method
//Example on MouseAdapter, here we will handle anu two out of 5 methods
class MouseAdapterExample extends JFrame{
    JTextArea t1;
    JLabel l1;
    public void setMouseAdapter(){
        t1 = new JTextArea(20, 20);
        l1 = new JLabel("Result");
        
        add(t1); add(l1);
        
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        
        //handling mouseEvent using adapter class in t1
        t1.addMouseListener(new MouseAdapter(){
            //handling mouseEnter and mouseExit
            @Override
            public void mouseEntered(MouseEvent e){
                l1.setText("Mouse Entered");
            }
             @Override
            public void mouseExited(MouseEvent e){
                l1.setText("Mouse Exited");
            }
        });
    }
}
public class MouseAdapterDemo {
    public static void main(String[] args) {
        MouseAdapterExample ma1 = new MouseAdapterExample();
        ma1.setMouseAdapter();
    }
}
