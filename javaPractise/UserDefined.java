
class UserDefined1 extends Exception 
{ 
	public UserDefined1(String s) 
	{  
		System.out.println("in constructor"+s);
	} 
	public String test(String st){
	return ("from function");
	}
} 

public class UserDefined 
{ 
	public static void  main(String args[]) 
	{ 
		try
		{ 
		
			throw new UserDefined1("i will  handle the exception"); 
		} 
		catch (UserDefined1 ex) 
		{ 
			System.out.println("in catch"); 
			System.out.println(ex.getMessage()); 
		} 
	} 
} 
