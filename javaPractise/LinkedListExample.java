import java.util.*;
class LinkedListExample{
public static void main(String args[]){
LinkedList<String> ll=new LinkedList<String>();
ll.add("Shape");
ll.add("rectungalr");
ll.add("square");
ll.add("pentagon");
ll.add("diamond");
ll.addFirst("king");
System.out.println(ll);
LinkedList<String>lFirst=new LinkedList<String>();
lFirst.addFirst("some")
;
ll.addAll(1,lFirst);
System.out.println(ll);
Iterator it=ll.descendingIterator();
while(it.hasNext()){
	System.out.println(it.next());
	
}
ll.remove(0);
}
}