import java.util.*;
class ArrayListExample{
public static void main(String args[]){
ArrayList<String> arraylist=new ArrayList<String>();
arraylist.add("Shanmukhavarma");
arraylist.add("varma");
arraylist.add("SubbaRaju");
arraylist.add("Kalyani");
//printing the arraylist
for(String a:arraylist){
System.out.println("index number"+" "+arraylist.indexOf(a)+" "+a);
}
//lets sort the arraylist
Collections.sort(arraylist);
System.out.println(arraylist);
//print in reverse order
Collections.sort(arraylist,Collections.reverseOrder());
System.out.println("reverse order"+arraylist);
//remove element
arraylist.remove(0);
int d=arraylist.indexOf("Shanmukhavarma");
System.out.println("removed element is"+" "+arraylist);
arraylist.remove(d);
System.out.println("using d element"+arraylist);
arraylist.add("varma");
arraylist.add("shanmukhavarma");
arraylist.add("king");
arraylist.add("queen");
//printing using iterator
Iterator it=arraylist.iterator();
while(it.hasNext()){
	System.out.println(it.next());
}
for(int j=0;j<arraylist.size();j++){
	arraylist.set(j,"wow");
	System.out.println(arraylist.get(j));
}
for(String s:arraylist){
	System.out.println(s);
}
}
}