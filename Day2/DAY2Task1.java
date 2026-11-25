class Calculator{
  int add(int a ,int b){
    return a+b;
  }
  int add(int a ,int b,int c){
    return a+b+c;
  }
}
public class DAY2Task1 {
  public static void main(String[] args) {
    Calculator obj = new Calculator();
    System.out.println(obj.add(2,2));
    System.out.println(obj.add(2,2,5));
  }
  
}
