
package Unit1;

import java.awt.*;//for awt component
import java.awt.event.*;//for event
import javax.swing.*;//for event

class Forms extends JFrame{
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1;
    JPasswordField p1, p2;
    JRadioButton r1, r2;
    
    JCheckBox c1,c2,c3;
    JComboBox cb1;
    JButton b1;
    
    public void setForms(){
    l1 = new JLabel("Username");
    l2 = new JLabel("Password");
    l3 = new JLabel("RePassword");
    l4 = new JLabel("Gender");
    l5 = new JLabel("Course");
    l6 = new JLabel("COuntry");
    l7 = new JLabel("Result");
    
    
    t1= new JTextField(20);
    
    p1=new JPasswordField(20);
    p2=new JPasswordField(20);
    
    r1 = new JRadioButton("Male");
    r2 = new JRadioButton("Female");
    //for radiobutton, buttongroup should be used
    //it makes to click only one item
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1); bg.add(r2);
    
    c1 = new JCheckBox("C++");    
    c2 = new JCheckBox("Java");    
    c3 = new JCheckBox("DotNet"); 
    //for combo box, items should be created first
    String []country = {"Nepal","Japan","Other"};
    cb1 = new JComboBox(country);
    
    b1 = new JButton("Submit");
    //adding components to the window(JFrame)
    add(l1); add(t1);
    add(l2); add(p1);
    add(l3); add(p2);
    add(l4); add(r1); add (r2);
    add(l5); add(c1); add(c2); add(c3);
    add(l6); add(cb1);
    add(b1); add(l7);
    //setting properties of window(JFrame)
    setVisible(true);//making window visible
    setSize(500,500);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame.EXIT_ON_CLOSE=3  =it means same
   
   
    b1.addActionListener(new ActionListener(){
        
    public void actionPerformed(ActionEvent e){        
        String Username = t1.getText();
        String Password = p1.getText();
        String RePassword = p2.getText();
        
        l7.setText("Username: " + Username + ", Password: " + Password + ", Re-Password: " + RePassword);
        
    }
    }
);
}
}
public class FormField {
      public static void main(String[] args) {
      Forms f1=new Forms();
      f1.setForms();
    }
}
