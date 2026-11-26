import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
  static ArrayList<String> studentNames = new ArrayList<>();
  static ArrayList<Integer> studentIds = new ArrayList<>();
  static ArrayList<Integer> studentMarks = new ArrayList<>();
  static LinkedList<String> attendance = new LinkedList<>();
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
  
  int choise=0;
   

  System.out.println("==================================== \n\n");
  System.out.println("       STUDENT MANAGEMENT SYSTEM     \n ");
  System.out.println("====================================");

  
    System.out.println("1. Add Student");
    System.out.println("2. Display All Students");
    System.out.println("3. Search Student");
    System.out.println("4. Update Student Marks");
    System.out.println("5. Remove Student");
    System.out.println("6. Add Student Attendance");
    System.out.println("7. Display Attendance");
    System.out.println("8. Remove Attendance");
    System.out.println("9. Display Student Statistics");
    System.out.println("10. Sort Student Names");
    System.out.println("11. Exit \n \n \n ");

    System.out.println("Enter Your Choise :");

    choise=sc.nextInt();

    System.out.println("your choise is :"+choise);

    if (choise == 1) {
    addStudent();
    }
    else if (choise == 2) {
    displayStudents();
    }else if (choise == 3) {
    searchStudent();
    }else if (choise == 4) {
    updateStudentMarks();
    }


   
   

    
  }
  public static void addStudent() {

    System.out.println("========== ADD STUDENT ==========");
     
    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    if (studentIds.contains(id)) {
    System.out.println("Student ID already exists!");
    return;
    }
 
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Student Marks: ");
    int marks = sc.nextInt();

      if (marks < 0 || marks > 100) {
        System.out.println("Invalid Marks! Enter marks between 0 and 100.");
        return;
    }

     
    studentIds.add(id);
    studentNames.add(name);
    studentMarks.add(marks);

    System.out.println("Student Added Successfully!");

}
public static void displayStudents() {

    System.out.println("========== ALL STUDENTS ==========");

    if (studentNames.isEmpty()) {
        System.out.println("No students found!");
        return;
    }

    for (int i = 0; i < studentNames.size(); i++) {

        System.out.println("Student ID: " + studentIds.get(i));
        System.out.println("Student Name: " + studentNames.get(i));
        System.out.println("Student Marks: " + studentMarks.get(i));

        System.out.println("--------------------------------");
    }
}
public static void searchStudent() {

    System.out.println("========== SEARCH STUDENT ==========");

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();

    int index = studentIds.indexOf(id);

    if (index == -1) {
        System.out.println("Student Not Found!");
        return;
    }

    System.out.println("Student Found!");
    System.out.println("Student ID: " + studentIds.get(index));
    System.out.println("Student Name: " + studentNames.get(index));
    System.out.println("Student Marks: " + studentMarks.get(index));
}
public static void updateStudentMarks() {
    System.out.println("========== UDATE STUDENT MARKS ==========");
  System.out.print("Enter Student ID: ");
    int id = sc.nextInt();

    int index = studentIds.indexOf(id);

    if (index == -1) {
        System.out.println("Student Not Found!");
        return;
    }
    System.out.println("Enter new Marks to update:");

    int marks=sc.nextInt();

     if (marks < 0 || marks > 100) {
        System.out.println("Invalid Marks! Enter marks between 0 and 100.");
        return;
    }

    studentMarks.set(index, marks);
    System.out.println("marks update is success");

}
}
