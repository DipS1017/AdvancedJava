/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
//to connect with wxternal data source like sql server
//xml file etc we need jar file to connect with sql database jdbc  driver is required whic h is provided by jar file ,
//following steps are required to connect with database
//step1: initialize jdbc dribver using class , forName
//step2: 
/**
 *
 * @author sthbb
 */
import java.sql.*;

class JDBCExample {
    Connection conn;
    public void createTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";
            conn = DriverManager.getConnection(url, susername, spassword);
            if(conn != null){
                System.out.println("Database connected");
            }else{
                System.out.println("not connected");
            }
            String tblQuery = "create table tbl_std("
                    + "id int primary key,"
                    + "name varchar(50), gender varchar(50),"
                    +"faculty varchar(50), fee varchar(50))";
            Statement st = conn.createStatement();
            st.execute(tblQuery);
            System.out.println("table created");
                    
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    public void insertData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";
            conn = DriverManager.getConnection(url, susername, spassword);
            if(conn != null){
                System.out.println("Database connected");
            }else{
                System.out.println("not connected");
            }
            //query for inserting data
            String insQuery = "insert into tbl_std "
                    +"values (4,'jake','male','bba','50k')";
            //execute query
            Statement st = conn.createStatement();
            //executeUpdate return int value 0 or 1
            //1refer to 1 record inserted and 0 refers to no record inserted
            int res = st.executeUpdate(insQuery);
            if(res>0){                
                System.out.println(res + "row inserted");
            }else{
                System.out.println("data not inserted");
            }
            conn.close();
                    
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    
    public void displayData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";
            conn = DriverManager.getConnection(url, susername, spassword);
            if(conn != null){
                System.out.println("Database connected");
            }else{
                System.out.println("not connected");
            }
            //query for inserting data
            String disQuery = "select * from tbl_std ";
                    
            //execute query
            Statement st = conn.createStatement();
           //to fetch data executeQuery is used that return one row at a time 
            ResultSet rs = st.executeQuery(disQuery);
            //in resultset all the row will be extracted to show one data at a time rs.next() is used
           while(rs.next()){
               System.out.println("id is " + rs.getInt("id"));
               System.out.println("name is " + rs.getString("name"));
               System.out.println("gender is " + rs.getString("gender"));
               System.out.println("faculty is " + rs.getString("faculty"));
               System.out.println("fee is " + rs.getString("fee"));
               System.out.println();
           }
             
           conn.close();
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    
    //updating data: update name to hari and gender to male of person whose id is 1
    public void updateData (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";
            conn = DriverManager.getConnection(url, susername, spassword);
            if(conn != null){
                System.out.println("Database connected");
            }else{
                System.out.println("not connected");
            }
            
            //updating data
            String upQuery = "update tbl_std set name='hari', gender='male' where id=1";
            Statement st = conn.createStatement();
            int res1 = st.executeUpdate(upQuery);
            if(res1>0){
                System.out.println(res1 + " data updated");
            }
             
           conn.close();
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    
    //delete record of student whosse id is 2
    public void deleteData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/primebcasix";
            String susername = "root";
            String spassword = "";
            conn = DriverManager.getConnection(url, susername, spassword);
            if(conn != null){
                System.out.println("Database connected");
            }else{
                System.out.println("not connected");
            }
            
            //deleting data
            String delQuery = "delete from tbl_std where id=2";
            Statement st = conn.createStatement();
            int res1 = st.executeUpdate(delQuery);
            if(res1>0){
                System.out.println(res1 + " data deleted");
            }
             
           conn.close();
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
}

public class JDBCDemo{
    public static void main(String[] args) {
        JDBCExample j = new JDBCExample();
        //j.createTable(); 
//        j.insertData();
        j.displayData();
//        j.updateData();
        j.deleteData();
        j.displayData();
    }
}
