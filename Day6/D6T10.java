package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class D6T10 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/day5";
        String username = "root";
        String password = "password@123";

        try {

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection successful");

            String query = "insert into patients values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Kishore");
            ps.setInt(3, 21);
            ps.setString(4, "Fever");
            ps.setString(5, "Dr.Ramesh");

            ps.executeUpdate();

            String query1 = "select * from patients";
            PreparedStatement ps1 = con.prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();

            while(rs1.next()){
                System.out.println(
                        rs1.getInt("patient_id") + " " +
                        rs1.getString("patient_name") + " " +
                        rs1.getInt("age") + " " +
                        rs1.getString("disease") + " " +
                        rs1.getString("doctor_name")
                );
            }

            String query2 = "select * from patients where patient_id=101";
            PreparedStatement ps2 = con.prepareStatement(query2);
            ResultSet rs2 = ps2.executeQuery();

            while(rs2.next()){
                System.out.println(
                        rs2.getInt("patient_id") + " " +
                        rs2.getString("patient_name") + " " +
                        rs2.getInt("age") + " " +
                        rs2.getString("disease") + " " +
                        rs2.getString("doctor_name")
                );
            }

            String query3 = "select * from patients where disease='Fever'";
            PreparedStatement ps3 = con.prepareStatement(query3);
            ResultSet rs3 = ps3.executeQuery();

            while(rs3.next()){
                System.out.println(
                        rs3.getInt("patient_id") + " " +
                        rs3.getString("patient_name")
                );
            }

            String query4 = "update patients set doctor_name='Dr.Suresh' where patient_id=101";
            PreparedStatement ps4 = con.prepareStatement(query4);
            ps4.executeUpdate();

            String query5 = "delete from patients where patient_id=101";
            PreparedStatement ps5 = con.prepareStatement(query5);
            ps5.executeUpdate();

            String query6 = "select * from patients where doctor_name='Dr.Suresh'";
            PreparedStatement ps6 = con.prepareStatement(query6);
            ResultSet rs6 = ps6.executeQuery();

            while(rs6.next()){
                System.out.println(
                        rs6.getInt("patient_id") + " " +
                        rs6.getString("patient_name")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}