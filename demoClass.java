package demoClass;

import java.sql.*;

public class demoClass {
	public static void main(String[] args) {
		
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement s = con.createStatement();
		String sql = "insert into students (name, address, salary) values('ritee', 'usa', '2000000')";
		int i = s.executeUpdate(sql);
		System.out.println(i);
		System.out.println("inserted");
		
		String str = "select *from students";
		ResultSet r = s.executeQuery(str);
		
		while(r.next())
		{
			System.out.println(r.getInt("id"));
			System.out.println(r.getString("name"));
			System.out.println(r.getString("address"));
			System.out.println(r.getInt("salary"));
		}
	}
	catch(Exception e)
		{
			System.out.println(e);
		}
	}

}