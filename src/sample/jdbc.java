package sample;

import java.sql.*;

public class jdbc
{
    public static void main(String[] args) {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Mumiza@270107");
         System.out.println("Database connected successfully");
         //String query = "insert into students(name,city) values('Tharik','Chennai'),('Gokul','chennai')";
         String query = "update students set city = 'Madurai' where id= 3";
         Statement st =con.createStatement();
         st.execute(query);
         System.out.println("Row has been updated");
      } catch (Exception ex) 
      {
         System.out.println(ex.getMessage());
      }

   }
}

