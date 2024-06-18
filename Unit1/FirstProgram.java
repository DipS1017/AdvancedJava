/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
import java.awt.*;//for awt component
import java.awt.event.*;
import javax.swing.*;//for swing component
//creating basic swing controls;
//in gui there should be one main window in which all the controls are shown
//for window JFrame is used, for sub window JPanel is used
class Controls extends JFrame{
    //label shows the text in window
    JLabel l1,l2,l3;//label
    JTextField t1,t2;//text field
    JButton b1;//button->generates even when clicked
    JButton b2;//button to generate the sum of prime number
    public void setControls(){
        l1=new JLabel( "Enter First Number");
        l2=new JLabel( "Enter Second Number");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton( "FindSum");
        b2=new JButton("Find SumPrime");
        l3=new JLabel("result");
        
        //adding componet (control) into window
        add(l1);add (t1);
        add(l2);add (t2);
        add(b1);add(b2);
        add(l3);
  
        
        
            b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        //when t1 button is clicked action event is generated to handle
        //such event acion listener ineterface is used.Action listener 
        //contains one method named as action performend which should be 
        //compulsary override to handle aciton method
        //extracting form's field
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int sum= num1+num2;
        l3.setText("sum is "+sum);
        
    }
    });
       
             b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        //when t1 button is clicked action event is generated to handle
        //such event acion listener ineterface is used.Action listener 
        //contains one method named as action performend which should be 
        //compulsary override to handle aciton method
        //extracting form's field
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int sum= num1+num2;
        l3.setText("sum is "+sum);
        
    }
    });
            
//setting windows (Jframe) properties
        setVisible(true);//shows the window
        setSize(200,200);//set area of window
        setLayout(new FlowLayout());//descrbes how content should be shown in 
        //window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //when window is closed then program will end
        
        

    
    // for every action like typing , click even is generated
    //when button is clicked action event is generated in swing, to listen 
    //appropriate event listener interface is used

    }

public class FirstProgram {
    public static void main(String[]args){
        Controls C1=new Controls();
        C1.setControls();
    }
}
