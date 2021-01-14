import java.io.IOException;  
class ThrowsExample{  
  void m()throws IOException{  
    throw new IOException("device error");  
  }  
  
  void p(){  
   try{  
    m();  
   }catch(Exception e){
   System.out.println("exception handled");
   }  
  }  
  public static void main(String args[]){  
   ThrowsExample obj=new ThrowsExample();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}