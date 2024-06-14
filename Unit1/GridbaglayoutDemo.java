
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//gridbag layout also places content in rectangular grie
//i.e row and coloumn but here we specify the coordinate for content
//and we also can specify number cell to be given to each component
//to set properties of  layout gridbag constraint is used
class GridBagExample extends JFrame{
    JButton b1, b2, b3,b4;
    public void setGridBag(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        //creating grid bag layout
        GridBagLayout gb1 = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb1);
        //adding b1 in coordinate 0,0 and assigning only one 
        gbc.gridx=0;//setting x coordinate
        gbc.gridy=0;//setting y coordinate
        //inserting content in horizontal direction
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b1, gbc);
        //adding button 2 on coordinate 1,0
        gbc.gridx = 1;
        gbc.gridy = 0;
        //allocating 2 cell for b2
        //gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b2, gbc);
       
        //adding button b3 on coordinate 0,1
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth=2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b3, gbc);
        //adding button b4 on coordinate 2,0
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.gridwidth=4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b4, gbc);
        
        setVisible(true);
        setSize(500, 500);
        
        setDefaultCloseOperation(3);
    }
}
public class GridbagLayoutDemo {
    public static void main(String[] args) {
        GridBagExample gbe =new GridBagExample();
        gbe.setGridBag();
    }
}
