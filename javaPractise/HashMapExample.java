 import java.util.*; 
class HashMapExample{ 
	public static void main(String args[]) 
	{  
		Map<Integer, String> hm = new HashMap<Integer, String>(); 
 
		hm.put(1, "test"); 
		hm.put(2, "check"); 
		hm.put(3, "test"); 
		hm.put(4, "done"); 

		System.out.println("Mappings of HashMap are : "
						+ hm); 
		hm.remove(4); 
 
		System.out.println("Mappings after removal are : "
						+ hm); 
		for(Integer i :hm.keySet()){
			System.out.println(hm.get(i));
		}
		for(Integer j:hm.keySet()){
			System.out.println(j);
		}
	} 
}
