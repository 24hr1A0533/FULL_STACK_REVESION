class Calculator{
  int add(int a , int b){
    return a+b;
  }
   int add(int a , int b,int c){
    return a+b+c;
  }
   float add(float a , float b){
    return a+b;
  }
}
class CompilePloymorphism{
  public static void main(String[] args) {
    Calculator obj = new Calculator();
    System.out.println(obj.add(2,2));
    System.out.println(obj.add(2,2,6));
    System.out.println(obj.add(2.3f,2.4f));
  }
}