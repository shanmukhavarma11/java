import java.io.File;
import java.io.FileInputStream;
public class NumberOfLines {
   public static void main(String args[]) throws Exception{
   
      File file = new File("c://users//varma//desktop//java//numbercount.txt");
      FileInputStream fis = new FileInputStream(file);
      byte[] byteArray = new byte[(int)file.length()];
      fis.read(byteArray);
      String data = new String(byteArray);
      String[] stringArray = data.split("\r\n");
      System.out.println("Number of lines in the file are :"+stringArray.length);
   }
}