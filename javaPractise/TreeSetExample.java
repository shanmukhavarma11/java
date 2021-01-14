import java.util.*;  
class TreeSetExample{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
           
         System.out.println(set);  
           
         System.out.println(set.headSet("C"));  
          
         System.out.println(set.subSet("A", "E"));  
           
         System.out.println(set.tailSet("C"));  
 }  
} 