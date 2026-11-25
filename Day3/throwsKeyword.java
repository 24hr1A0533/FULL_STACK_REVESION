package Day3;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class throwsKeyword {
  public static void OpenFile() throws Exception{
    FileReader obj = new FileReader("index.txt");
  }
  public static void main(String[] args) {
    try{
      OpenFile();
    }catch(Exception e){
      System.out.println("error found wile opening"+e);
    }
  }
  
}
