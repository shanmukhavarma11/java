
class ThrowExample
{ 
	static void fun() 
	{ 
		try
		{ 
			throw new NullPointerException("demo"); 
		} 
		catch(NullPointerException e) 
		{ 
			System.out.println("on static method"); 
			throw e;
		} 
	} 

	public static void main(String args[]) 
	{ 
		try
		{ 
			fun(); 
		} 
		catch(NullPointerException e) 
		{ 
			System.out.println("on main method."); 
		} 
	} 
} 
