package sample;
import java.sql.*;

public class selectquery 
{

    public static void main(String[] args) 
    {
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Mumiza@270107");
        System.out.println("Database has been connected");
        //String query = "Select * from student_marks where total_marks>=300 order by std_name asc";
        //String query = "Select * from student_marks where std_name regexp '^[aeiouAEIOU]'";
        String query = "Select * from student_marks where std_name regexp '[aeiouAEIOU]$'";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
         String std_id = rs.getString("std_id");
         String std_name = rs.getString("std_name");
         int total_marks = rs.getInt("total_marks");
         System.out.println(std_id+"|"+std_name+"|"+total_marks);   
        }

     }   
     catch (Exception ex)
     {
        System.out.println(ex.getMessage());
     }
    }
}
