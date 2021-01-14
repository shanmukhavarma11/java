import java.util.*; 
public class StringTokenizerExample 
{ 
    public static void main(String args[]) 
    { 
        System.out.println("Testing"); 
        StringTokenizer st1 = 
             new StringTokenizer("Hello Hai How are you", " "); 
        while (st1.hasMoreTokens()) 
            System.out.println(st1.nextToken());
			}
			}