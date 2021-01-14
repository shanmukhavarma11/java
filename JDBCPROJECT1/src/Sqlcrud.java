
import java.sql.*;
public class Sqlcrud {
	public static void main(String args[]) {
		
		try {
			Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","shanmukha","asdfghjkl");
		Statement stmt = con.createStatement();
		System.out.println("done");
	    System.out.println("CREATED table");
	    String insert="insert into employee values(1,'varma',2500)";
	    stmt.executeUpdate(insert);
	    System.out.println("Data inserted");
	    ResultSet rs=stmt.executeQuery("select * from employee");
	    while(rs.next()) {
	    	System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getLong(3));
	    }
	    System.out.println("updating the table");
		String update="update employee set name='king' where id_number=1 ";
		stmt.executeUpdate(update);
		System.out.println("updated______________");
		ResultSet r1=stmt.executeQuery("select * from employee");
		while(r1.next()) {
	    	System.out.println(r1.getLong(1)+" "+r1.getString(2)+" "+r1.getLong(3));
	    }
		System.out.println("deleteing the data");
		String delete="delete  from employee where id_number=1";
		stmt.executeUpdate(delete);
		String insert1="insert into employee values(1,'varma',3000)";
		stmt.executeUpdate(insert1);
		System.out.println("done");
		ResultSet t1=stmt.executeQuery("select * from employee");
		while(t1.next()) {
			System.out.println(t1.getLong(1)+" "+t1.getString(2)+" "+t1.getLong(3));
		}
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
	}

}
