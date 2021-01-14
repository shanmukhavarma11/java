import java.util.Properties;
import java.io.*;
public class PropertiesClass {
	public static void main(String args[]) {
		try {
			FileWriter fw;
			Properties p=new Properties();
			p.setProperty("username", "Shanmukha");
			p.setProperty("password","shanmukha");
			p.store(new FileWriter("db.properties"),"user login");
			System.out.println("created successfully");
			FileReader fr=new FileReader("db.properties");
			p.load(fr);
			System.out.println(p.getProperty("username"));
		}
		catch(Exception e) {
			
		}
	}

}
