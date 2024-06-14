
package Unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//menu bar is a tab that contains sequence of items known menu contsin collection of item known as menu item
//steps to create menu bar and menu item
//create object of menu 
//create list of object of menu item
//add menuitem to menu and menu into menubar
class MenuExample extends JFrame{
    public void setMenu(){
        JMenuBar mb = new JMenuBar();//menubar
        //creating first menu 
        JMenu m1 = new JMenu("File");
        //creating the list of menu item for menu m1
        JMenuItem ma1 = new JMenuItem("NewTab");
        JMenuItem ma2 = new JMenuItem("NewWindow");
        JMenuItem ma3 = new JMenuItem("Open");
        //inserting menu item into menu
        m1.add(ma1); m1.add(ma2); 
        m1.add(ma3);
        //adding menu into menu bar
        mb.add(m1);
        //creating checkbox menu item in menu m2
        JMenu m2 = new JMenu("New");
        JCheckBoxMenuItem c1 = new JCheckBoxMenuItem("Copy");
        JCheckBoxMenuItem c2 = new JCheckBoxMenuItem("paste");
        JCheckBoxMenuItem c3 = new JCheckBoxMenuItem("cut");
        
        m2.add(c1); m2.add(c2);
        m2.add(c3);
        mb.add(m2);
        //creating radiobutton menu item in menu m3
        JMenu m3 = new JMenu("View");
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("Zoom");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("Status");
        
        m3.add(r1); m3.add(r2);
        mb.add(m3);
        //adding menubar to window
        add(mb);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
}
public class MenuBarDemo {
    public static void main(String[] args) {
        MenuExample me = new MenuExample();
        me.setMenu();
    }
}
