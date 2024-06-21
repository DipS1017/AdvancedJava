//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import java.util.*; //to take input from user
import java.sql.*;
//Prepared statement is used to manipulate dynamic data
/**
 *
 * @author sthbb
 */
class PreparedExample{
    Connection conn;
    public void preparedInsert(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";
            conn = DriverManager.getConnection(url,susername,spassword);
            //inserting data using prepared statement
            //1.take input form user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter you id: ");
            int id = sc.nextInt();
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your gender: ");
            String gender = sc.next();
            System.out.print("Enter your faculty: ");
            String faculty = sc.next();
            System.out.print("Enter your fee: ");
            String fee = sc.next();
            
            //2. use prepared statement to insert data
            String insQuery = "insert into tbl_std values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insQuery);
            
            //sending data into prepare statement
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, gender);
            ps.setString(4,faculty);
            ps.setString(5, fee);
            
            //execute
            int res = ps.executeUpdate();
            if(res>0){
                System.out.println(res + "data inserted");
            }
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
}

public class PreparedStatementDemo {
    public static void main(String[] args) {
        PreparedExample p = new PreparedExample();
        p.preparedInsert();
    }
}
