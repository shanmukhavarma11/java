 abstract class Test{  
   Test(){
   
   System.out.println("constructor is called");
   
   }  
   abstract void TestFunction();  
   void AbstractFunction(){
   System.out.println("Abstract Function");
   }  
 }  
 
 class Test1 extends Test{  
 void TestFunction(){
 System.out.println("Test Function called");
 }  
 }  
 
 class AbstractAndDynamic{  
 public static void main(String args[]){  
   Test obj = new Test1();  
  obj.TestFunction();  
  obj.AbstractFunction();  
 }  
}