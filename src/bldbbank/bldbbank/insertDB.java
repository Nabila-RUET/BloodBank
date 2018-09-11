
package bldbbank;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class insertDB {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost/ranj";


   static final String USER = "root";
   static final String PASS = "";
     Connection conn = null;
   Statement stmt = null;
  public  insertDB()
  {


   try{

      Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to a selected database...");
      conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");



   }catch(SQLException se){

      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }

  }

  public void insert(String name,int age,int weight,String district,String mobileNo,String bloodgroup)
  {

      try{
  stmt = (Statement) conn.createStatement();
  String sql = "INSERT INTO ranj " +
                   "VALUES ('"+name+"',"+age+","+weight+",'"+district+"','"+mobileNo+"','"+bloodgroup+"')";
     // stmt.executeUpdate(sql);
      }catch(SQLException se)
      {

      }
  }

  public void update(String mobileNo)
  {
  try
  {
  stmt =(Statement) conn.createStatement();
      String sql = "UPDATE ranj " +
              "WHERE Mobile = " +mobileNo;
  }catch(SQLException se)
      {

      }
  }

  public int check(String bloodgroup)
  {
  int result=0,count=0;
       try{
  stmt = (Statement) conn.createStatement();
 String sql = "SELECT * FROM ranj"+
                   " WHERE BGroup =  "+bloodgroup;
 ResultSet rs = stmt.executeQuery(sql);
  while(rs.next()){
         
         result = rs.getInt("age");
        count++;
      }

      }catch(SQLException se)
      {

      }

  return count;
  }




}
  

