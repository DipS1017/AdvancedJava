
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//gridLayout places the component like component row and column 
//here we have to specifyu particular row and column with component
class GridEg extends JFrame{
     JButton b1, b2, b3, b4, b5, b6;
     public void setGrid(){
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        b5 = new JButton("Button5");
        b6 = new JButton("Button6");
        
        add(b1); add(b2); add(b3);
        add(b4); add(b5); add(b6);
        setVisible(true);
        setSize(500, 500);
        setLayout(new GridLayout(2, 3, 10, 10));
        //here fiorst two parameter indicates number of row and column 
        //and last two parameter indicates horizontal gap and vetical gap betwn each component
        
        setDefaultCloseOperation(3);
        
        
     }
}
public class GridLayoutDemo {
    public static void main(String[] args) {
        GridEg G1 = new GridEg();
        G1.setGrid();
    }
}
