
package Unit2;

//connnect with external data source  like sql server 
//sml etc we need jar file. to connect with sql database DJBC driver is 
//required which is provied by jar file. following steps are required to 
//connect with database;
//step 1: initialize JDBC driver using class.forName
//step 2: create a required variable to connect with database it includes URL 
//username and password
//step 3:connect with database using connection class
//step 4: write appropriate query and execute it in object of statement
//step 5 : close the connection

import java.sql.*;//to used jdbc 
class JDBCExample{
    Connection conn;
    
    
    public void createTable(){
    //initializing driver it will throw class not found exception 
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/primebcasix";
    //protocol                  //server:port //database name
    String susername="root";
    String spassword="";
    conn =DriverManager.getConnection(url, susername, spassword);
    if(conn!=null){
        System.out.println("database connected");
    }else{
        System.out.println("not connected");
    }
    }catch(ClassNotFoundException c){
        System.out.println(c);
    }catch(SQLException s){
        //if error is query and connection
        System.out.println(s);
    }
    }

}

public class JDBCDemo {
    public static void main(String[] args) {
        JDBCExample j= new JDBCExample();
        j.createTable();
    }
}
