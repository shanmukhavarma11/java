import java.util.*;
class HashSetExample{
public static void main(String args[]){
HashSet<String> set=new HashSet<String>();
set.add("Shanmukhavarma");
set.add("Varma");
set.add("King");
set.add("Queen");
set.add("Queen");
System.out.println(set);
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
HashSet<String> set1=new HashSet<String>();  
set1.add("Ajay");  
set1.add("Gaurav");  
set.addAll(set1);  
System.out.println("Updated List: "+set);  
set.removeAll(set1);  
System.out.println("removeAll method: "+set);  
set.clear();  
System.out.println(" clear method: "+set);
set.removeAll(set1);
}
}