import java.util.*;
import java.io.*;  
public class FileExample {  
    public static void main(String args[]){    
           try{    
		   ArrayList<String> arraylist=new ArrayList<String>();
		   arraylist.add("shanmukha");
		   arraylist.add("varma");
		   arraylist.add("king");
		   arraylist.add("queen");
		   arraylist.add("done");
             FileOutputStream fout=new FileOutputStream("c:\\users\\varma\\desktop\\java\\input.txt");   
for(String a:arraylist){	
        byte[] ad=a.getBytes();		 
             fout.write(ad);  
			 
			 }  fout.close();  
             System.out.println("success..."); 
FileInputStream input=new FileInputStream("c:\\users\\varma\\desktop\\java\\input.txt");
FileOutputStream output=new FileOutputStream("c:\\users\\varma\\desktop\\java\\output.txt");
int r=0;
			 while((r=input.read())!=-1){
				 output.write(r);
				 
			 }
			 	input.close();	
output.close();				
		 System.out.println("input");
            }catch(Exception e){System.out.println(e);}  
finally{
	System.out.println("Final");
}			
      }    
}