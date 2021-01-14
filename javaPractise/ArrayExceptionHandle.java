class ArrayExceptionHandle{    
  public static void main(String args[]){    
   try{    
    int a[]=new int[5];    
    a[5]=30/0;   
    System.out.println(a[6]);	
   }       
   catch(ArithmeticException e){
   System.out.println("First");}
   try{
	   int a[]=new int[5];
	   System.out.println(a[6]);
   }
   catch(ArrayIndexOutOfBoundsException e){System.out.println("second");}  
catch(Exception e){System.out.println("common task completed");}     
   System.out.println("Last line");    
 }    
}