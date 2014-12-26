import java.util.ArrayList;
import java.util.Scanner;
//import java.io.*;

public class User
{
	Scanner u1;
	
	Event ev1 = new Event();
	
	public String User_Name ;
	
	public int User_Id;
	
	private String Password ;
	
	private String Confirmed_Password;
	
	public int Age ;
	
	public String Email;
	
	public int My_tickets;
	
	public int Notifications;
	
	public Event Created_events ;
	
	public Event Favorite_category ;
	
	public Event Attended_events ;
	
	private Scanner in;
	
	private Scanner input;
	
	ArrayList <UserDB> Users_data = new ArrayList <UserDB>();

//setters and getters
public void setUser_Name(String n)
{
	User_Name=n;
}

public String getUser_Name()
{
	return User_Name;
}

public void setPassword(String p)
{
	Password=p;
}

public String getPassword()
{
	return Password;
}

public void setConfirmed_Password(String c_p)
{
	Confirmed_Password=c_p;
}

public String getConfirmed_Password()
{
	return Confirmed_Password;
}

public void setAge(int a)
{
	Age=a;
}

public int getAge()
{
	return Age;
}
public void setEmail(String email)
{
	Email=email;
}

public String getEmail()
{
	return Email;
}


/*
 * 
 * da hayb2a f class esmo mainview
//function Register()
public void Register(String name , String email , int age , String password , String confirmed_password)
{
	
	System.out.println("Please Enter your name");
	in = new Scanner (System.in);
    name = in.next();
    System.out.println("Please Enter your email");
    email = in.next();
    System.out.println("Please Enter your age");
    age = in.nextInt();
    System.out.println("Please Enter your password");
    password = in.next();
    System.out.println("Please Enter your Confirmed_password");
    confirmed_password = in.next();
    //u1=in;//an 3arfa en da ghalat 3lshan hasta5dem el database
    //Users_data.add(u1);//we da ghalat
    for(int i=0; i<Users_data.size();i++)
    {
    	//if(u1!=Users_data.get(arg0))//we da ghalat
        {
        	
        }
    	
    }
    
    System.out.println("You successfully signed up!");
}

//function login()
public void login (String email , String password)
{
	System.out.println("Please Enter your email :" );
	input = new Scanner (System.in);
	email = input.next();
	System.out.println("Please Enter the Password");
	password = input.next();
	System.out.println("You Successfully logged in!");
	// use database
	
	}


*/
}
