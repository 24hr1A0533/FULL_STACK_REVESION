
import java.util.Scanner;
import java.sql.*;

public class D6T11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/day6";
        String username = "root";
        String password = "password@123";

        try {

            Connection con = DriverManager.getConnection(
                url, username, password
            );

            String insertquery =
                "insert into electricity_bills values(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(insertquery);

            ps.setInt(1, 101);
            ps.setString(2, "kis");
            ps.setInt(3, 123);
            ps.setDouble(4, 1234);
            ps.setString(5, "not paid");

            ps.executeUpdate();
            ps.close();

            String displayquery =
                "select * from electricity_bills";

            PreparedStatement ps2 =
                con.prepareStatement(displayquery);

            ResultSet rs = ps2.executeQuery();

            System.out.println("========= ALL BILLS ========");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("bill_id") + " " +
                    rs.getString("customer_name") + " " +
                    rs.getInt("units_consumed") + " " +
                    rs.getDouble("amount") + " " +
                    rs.getString("payment_status")
                );
            }

            rs.close();
            ps2.close();

            System.out.println("========= SEARCH BILL ========");

            System.out.println("Enter id to display bill");

            int id = sc.nextInt();

            String searchQuery =
                "select * from electricity_bills where bill_id=?";

            PreparedStatement ps3 =
                con.prepareStatement(searchQuery);

            ps3.setInt(1, id);

            ResultSet rs3 = ps3.executeQuery();

            if (rs3.next()) {
                System.out.println(
                    rs3.getInt("bill_id") + " " +
                    rs3.getString("customer_name") + " " +
                    rs3.getInt("units_consumed") + " " +
                    rs3.getDouble("amount") + " " +
                    rs3.getString("payment_status")
                );
            } else {
                System.out.println("No bill found");
            }

            rs3.close();
            ps3.close();

            System.out.println("========= UNPAID BILL ========");

            String unpaidQuery =
                "select * from electricity_bills where payment_status='not paid'";

            PreparedStatement ps4 =
                con.prepareStatement(unpaidQuery);

            ResultSet rs4 = ps4.executeQuery();

            while (rs4.next()) {
                System.out.println(
                    rs4.getInt("bill_id") + " " +
                    rs4.getString("customer_name") + " " +
                    rs4.getDouble("amount")
                );
            }

            rs4.close();
            ps4.close();

            System.out.println("========= MORE THAN 300 UNITS ========");

            String moreunitsQuery =
                "select * from electricity_bills where units_consumed > 300";

            PreparedStatement ps5 =
                con.prepareStatement(moreunitsQuery);

            ResultSet rs5 = ps5.executeQuery();

            while (rs5.next()) {
                System.out.println(
                    rs5.getInt("bill_id") + " " +
                    rs5.getString("customer_name") + " " +
                    rs5.getInt("units_consumed")
                );
            }

            rs5.close();
            ps5.close();

            System.out.println("===== AFTER PAYMENT UPDATING =====");

            System.out.println("Enter the id who paid the amount:");

            int paidId = sc.nextInt();

            String updatequery =
                "update electricity_bills set payment_status='paid' where bill_id=?";

            PreparedStatement ps6 =
                con.prepareStatement(updatequery);

            ps6.setInt(1, paidId);

            int rows = ps6.executeUpdate();

            if (rows > 0) {
                System.out.println("Payment updated successfully");
            } else {
                System.out.println("Bill ID not found");
            }

            ps6.close();

            System.out.println("========= TOTAL AMOUNT OF UNPAID BILLS ========");

            String totalunpaid =
                "select sum(amount) from electricity_bills where payment_status='not paid'";

            PreparedStatement ps7 =
                con.prepareStatement(totalunpaid);

            ResultSet rs7 = ps7.executeQuery();

            if (rs7.next()) {
                System.out.println(
                    "Total Unpaid Amount: " + rs7.getDouble(1)
                );
            }

            rs7.close();
            ps7.close();

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
