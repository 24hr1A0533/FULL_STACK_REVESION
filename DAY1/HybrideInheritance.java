class Device{
  String powerSource;
  void turnOn(){
    System.out.println("turned onn");
  }
}
class Mobile extends Device{
  double screensize=6.5;
  void makecall(){
    System.out.println("ringing");
  }
}
class Andriod extends Mobile{
   void openplaystore(){
    System.out.println("opened play store");
  }
}
class iphone extends Mobile{
  void openAppStore(){
    System.out.println("openeddd app store");
  }
}
public class HybrideInheritance {
  public static void main(String[] args) {
    Andriod obj = new Andriod();
    Mobile obj1 = new Mobile();
    obj.turnOn();
    obj1.turnOn();
    obj.makecall();
    obj1.makecall();
    obj.openplaystore();
    
  }
  
}
