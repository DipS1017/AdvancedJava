/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
//to creat basic 2d shape java.awt.graphics package should be imported. it
//contains paint method // that is used to draw 2d shape

import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
class shapeExample{
   JFrame fr;
   JPanel p;
   public void setShapes(){
       fr=new JFrame();
       p = new JPanel(){
           //using graphcis method to draw shape
         public void paint (Graphics g){
             //drawing rectangle 
             g.drawRect(50, 50, 50,300);
              g.setColor(Color.red);


//initial point // size
        //drawing circle
        g.drawOval(400, 400,600 ,600 );
        //drawing circle with red color
        //draw arc 
        g.drawArc(200,200,200,200,20);
       g.setColor(Color.GREEN);
       g.setFont(new Font("arial",Font.BOLD, 12));
       g.drawString("Hello BCCA", 100, 100);
        
         }  
       };
       p.setSize(800,800);
       fr.add (p);
       fr.setVisible(true);
       fr.setSize(900,900);
//       fr.setLayout(new FlowLayout());
       fr.setDefaultCloseOperation(3);
   }
}
public class BasicShapeDemo {
    public static void main(String[] args) {
        shapeExample s=new shapeExample();
        s.setShapes();
    }
}
