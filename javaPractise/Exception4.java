 class Exception4 {  
  
    public static void main(String[] args) {  
          
           try{    
                String s=null;  
                System.out.println(s.length());  
               }  			   
               catch(ArithmeticException e)  
                  {  
                   System.out.println("First cathch");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("Second catch");  
                  }    
				  catch(Exception e)  
                  {  
                   System.out.println("Thrid catch");  
                  } 
                           
               System.out.println("end");    
    }  
}