class BankAccount{
  private String accountHolder;
  private double balance=100000;
  public void getBalance() {
    if(balance<0){
      System.out.println("invalid balance");
    }else {
    System.out.println(balance);
    }
  }
  void Deposit(double nums){
    balance +=nums;
  }
  void withdraw(double s){
    System.out.println("withdrawed "+s);
    balance -=s;
  }
}
public class Encapsulationtask2 {
  public static void main(String[] args) {
    BankAccount obj = new BankAccount();
    obj.getBalance();
    
    obj.Deposit(1000000);
    obj.withdraw(5);
    obj.getBalance();
  }
  
}
