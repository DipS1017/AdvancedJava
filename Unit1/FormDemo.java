/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Forms extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
   JButton b1;
    JCheckBox c1,c2,c3;
    JComboBox cb1;
 public void setForms(){
l1 =new JLabel("Username");
l2=new JLabel("Password");
l3=new JLabel("Re Password");
b1=new JButton("submit");
        l4=new JLabel("Gender");
        l5=new JLabel("Course");
        l6=new JLabel("Country");
        l7=new JLabel("Submit");
        
        t1=new JTextField(20);
        p1=new JPasswordField(20);
        p2=new JPasswordField(20);
r1=new JRadioButton("male");
r2=new JRadioButton("Female");

//for readio button, buttongroup should be used
    //it makes to click only one item
    ButtonGroup bg =new ButtonGroup();
    bg.add(r1);bg.add(r2);
    c1=new JCheckBox("C++");    
    c2=new JCheckBox("Java");    
    c3=new JCheckBox("DotNet");
    
    String[]Country={"Nepal","Japan","Other"};
    cb1=new JComboBox(Country);
   b1=new JButton("Submit"); 
   
   //adding components to window JFRAME
    add(l1);add(t1);
    add(l2);add(p1);
    add(l3);add(p2);
    add(l4);add(r1);add(r2);
    add(l5);add(c1);add(c2);add(c3);
    add(l6);add(cb1);
    add(l7);add(b1);
    
    //setting visibel properties to window;
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(3);
 }
}
/**
 *
 * @author DipS
 */
public class FormDemo {
    
    public static void main(String[] args) {
        Forms myForms=new Forms();
        myForms.setForms();
    }
}
