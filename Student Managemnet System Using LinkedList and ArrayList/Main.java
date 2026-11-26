import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
  ArrayList<String> sn=new ArrayList<>();
  ArrayList<Integer> sm=new ArrayList<>();
  LinkedList<String> at=new LinkedList<>();
  Scanner sc = new Scanner(System.in);
  int chooise=0;
   

  System.out.println("==================================== \n\n");
  System.out.println("       STUDENT MANAGEMENT SYSTEM     \n ");
  System.out.println("====================================");

  do{
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
    if(chooise==11){
      break;
    }else{
      System.out.println("Enter a Correct chooise");
    }
  }while(true);
  }
}
