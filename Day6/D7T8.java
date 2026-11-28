package Day6;

import java.sql.*;
import java.util.Scanner;

public class D7T8 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/day5";
        String username = "root";
        String password = "password@123";

        Scanner sc = new Scanner(System.in);

        try {

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection successful");

            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book By ID");
            System.out.println("4. Update Available Copies");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    String bookName = sc.nextLine();

                    System.out.print("Enter Author : ");
                    String author = sc.nextLine();

                    System.out.print("Enter Category : ");
                    String category = sc.nextLine();

                    System.out.print("Enter Available Copies : ");
                    int copies = sc.nextInt();

                    String q1 = "insert into books(book_name,author,category,available_copies) values(?,?,?,?)";

                    PreparedStatement ps = con.prepareStatement(q1);

                    ps.setString(1, bookName);
                    ps.setString(2, author);
                    ps.setString(3, category);
                    ps.setInt(4, copies);

                    ps.executeUpdate();

                    System.out.println("Book Added Successfully");
                    break;

                case 2:

                    String q2 = "select * from books";

                    Statement st = con.createStatement();

                    ResultSet rs = st.executeQuery(q2);

                    while (rs.next()) {

                        System.out.println(
                                rs.getInt("book_id") + " " +
                                rs.getString("book_name") + " " +
                                rs.getString("author") + " " +
                                rs.getString("category") + " " +
                                rs.getInt("available_copies"));
                    }
                    break;

                case 3:

                    System.out.print("Enter Book ID : ");
                    int id = sc.nextInt();

                    String q3 = "select * from books where book_id=?";

                    PreparedStatement ps2 = con.prepareStatement(q3);

                    ps2.setInt(1, id);

                    ResultSet rs2 = ps2.executeQuery();

                    while (rs2.next()) {

                        System.out.println(
                                rs2.getInt("book_id") + " " +
                                rs2.getString("book_name") + " " +
                                rs2.getString("author") + " " +
                                rs2.getString("category") + " " +
                                rs2.getInt("available_copies"));
                    }
                    break;

                case 4:

                    System.out.print("Enter Book ID : ");
                    int bid = sc.nextInt();

                    System.out.print("Enter New Copies : ");
                    int newCopies = sc.nextInt();

                    String q4 = "update books set available_copies=? where book_id=?";

                    PreparedStatement ps3 = con.prepareStatement(q4);

                    ps3.setInt(1, newCopies);
                    ps3.setInt(2, bid);

                    ps3.executeUpdate();

                    System.out.println("Copies Updated Successfully");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}