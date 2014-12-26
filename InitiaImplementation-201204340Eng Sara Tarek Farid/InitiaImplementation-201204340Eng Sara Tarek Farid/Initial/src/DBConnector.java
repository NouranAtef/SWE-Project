import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.sql.*;

public class DBConnector
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
//	MainView m = new MainView();
	
	public DBConnector()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventdb","root",""); // ngrb mra fl awl
			//st 
			con.createStatement();
			

		//	Result.getString(3);
			}
			
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public boolean addNewUSer (String name , String email , int age , String password , String confirmed_password){
		
		PreparedStatement Statement = con.PreparedStatement("insert into (User_Name,Email,Age,Password,Confirmed_Password) values (`"+ name + "`," + email+ "`," + age + "`," + password + "`," + confirmed_password + "`,"+")");
		//Statement = con.PreparedStatement("");
		int Result = Statement.executeUpdate();
		return true;
	}
	public void getData()
	{
		try
		{
			String query = "Select * from users_information";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while(rs.next())
			{
				String name = rs.getString("User_Name");
				String age = rs.getString("Age");
				System.out.println("Name: "+ name + "" + "Age: "+ age);
				
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
