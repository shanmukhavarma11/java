import java.sql.*;
public class TestingData {
	public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","shanmukha","asdfghjkl");
		Statement stmt = con.createStatement();
		/*String tableCreation="create table Customer1(CustomerID  SERIAL PRIMARY KEY,CustomerNAME varchar(50),PhoneNumber int,ShipToAddress varchar(40),ShipToZip int,ShipToCity varchar(40),ShipToState varchar(40))";
        stmt.executeUpdate(tableCreation);	*/	
        String insert="insert into Customer1(CustomerNAME,PhoneNumber,ShipToAddress,ShipToZip,ShipToCity,ShipToState) values('shanmukha',630,'NAD VSP',530027,'vsp','andhrapradesh')";
        stmt.executeUpdate(insert);
        System.out.println("done");
        ResultSet rs=stmt.executeQuery("select * from Customer1");
        while(rs.next()) {
	    	System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getLong(3));
	    }
	}
	
	catch(Exception e){
		
		e.printStackTrace();
	}
}
}


