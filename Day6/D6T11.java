package Day6;

import java.util.Scanner;

import java.sql.*;

public class D6T11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String url="jdbc:mysql://localhost:3306/day6";
    String username="root";
    String password="password@123";

    try{
       Connection con =DriverManager.getConnection(url,username,password);
       

      String query="select * from students";

     PreparedStatement ps1=con.prepareStatement(query);

     ResultSet rs=ps1.executeQuery();

     System.out.println("----- ALL STUDENTS-------");

      while (rs.next()) {
                System.out.println(
                    rs.getInt("student_id") + " " +
                    rs.getString("student_name") + " " +
                    rs.getString("department") + " " +
                    rs.getInt("year")
                );
            }

            rs.close();
            ps1.close();

             System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();

            String deleteQuery = "DELETE FROM students WHERE student_id=?";

            PreparedStatement ps2=con.prepareStatement(deleteQuery);

            ps2.setInt(1, id);

            int rows=ps2.executeUpdate();
            if(rows>0){
              System.out.println("Student deleted success");
            }else{
              System.out.println("no student found id:"+id);
            }
            ps2.close();



      String lastquery="select * from students";

     PreparedStatement ps3=con.prepareStatement(lastquery);

     ResultSet rs2=ps3.executeQuery();

     System.out.println("----- ALL STUDENTS-------");

      while (rs2.next()) {
                System.out.println(
                    rs2.getInt("student_id") + " " +
                    rs2.getString("student_name") + " " +
                    rs2.getString("department") + " " +
                    rs2.getInt("year")
                );
            }

              rs2.close();
              ps3.close();
              con.close();
              sc.close();







    }catch (Exception e)
    {
      System.out.println(e);
    }
  }
  
}

