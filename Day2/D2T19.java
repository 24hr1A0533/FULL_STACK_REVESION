class Rectangle{
  double length;
  double width;
  Rectangle(){
    length=1.0;
    width=1.0;
  }
  Rectangle(double side){
    length=side;
    width=side;
  }
  Rectangle (double length,double width){
    this.length=length;
    this.width=width;
  }
  void CalculateArea(){
    System.out.println("Area:"+(length*width));
  }
}
public class D2T19 {
  public static void main(String[] args) {
    Rectangle obj=new Rectangle();
    obj.CalculateArea();
     Rectangle obj1=new Rectangle(22.2);
    obj1.CalculateArea();
     Rectangle obj3=new Rectangle(99.2,88.2);
    obj3.CalculateArea();

  }
  
}
