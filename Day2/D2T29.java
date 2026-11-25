class Mobile{
  String brand;
  double price;
  Mobile(){
    brand = "Samsung";
    price = 25000;
  }
  void displayDetails(){
    System.out.println("brand:"+brand  +" price:"+ price);
  }
}
public class D2T29 {
  public static void main(String[] args) {
    Mobile obj = new Mobile();
    obj.displayDetails();
  }
  
}
