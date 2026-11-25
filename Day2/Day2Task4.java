class Shape{
  void draw(){
    System.out.println("Drawing a shape");
  }
}
class Circle extends Shape{
  void draw(){
    System.out.println("drawing a Circle");
  }
}
class Square extends Shape{
   void draw(){
    System.out.println("drawing a Square");
  }
}
public class Day2Task4 {
  public static void main(String[] args) {
    Shape s ;
    s=new Circle();
    s.draw();
    s=new Square();
    s.draw();
  }
}
