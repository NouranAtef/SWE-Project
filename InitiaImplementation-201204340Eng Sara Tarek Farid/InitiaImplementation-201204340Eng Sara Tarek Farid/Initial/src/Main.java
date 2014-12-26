import java.util.Scanner;


public class Main 
{
	public int currentUserId;
	DBConnector connector  = new DBConnector();
	User U = new User();
	Scanner in = new Scanner (System.in);
	Scanner input = new Scanner (System.in);
	public void createcontrollers()
	 {
		 
	 }


	public void signUp (String name , String email , int age , String password , String confirmed_password)
	{
//		System.out.println("Please Enter your name");
//		in = new Scanner (System.in);
//	    name = in.next();
//	    System.out.println("Please Enter your email");
//	    email = in.next();
//	    System.out.println("Please Enter your age");
//	    age = in.nextInt();
//	    System.out.println("Please Enter your password");
//	    password = in.next();
//	    System.out.println("Please Enter your Confirmed_password");
//	    confirmed_password = in.next();
		
		connector.addNewUSer(name, email, age, password, confirmed_password);
		/*String value = null;
		if (email == value)
		{
			return true;
		}
		else
		{
			return false;
		}*/
	}
	public boolean signIn (String mail , String password)
	{
		/*System.out.println("Please Enter your email :" );
		input = new Scanner (System.in);
		mail = input.next();
		System.out.println("Please Enter the Password");
		password = input.next();
		System.out.println("You Successfully logged in!");
		String value = null;
		if (mail == value)
		{
			return true;
		}
		else
		{
			return false;
		}*/
		
		connector.getData();
		return true;
	}
	public void logout ()
	{
		
	}
	public void initMainView ()
	{
		
	}
	public void finalize ()
	{
		
	}
	public void SuggestUsersTofollow()
	{
		
	}
	public int followUser(int currentUserId)
	{
		return currentUserId;
		
	}
	public void createEvent(String User_Name)
	{
		
	}
	public int getCurrentUserId() {
		return currentUserId;
	}
	public void setCurrentUserId(int currentUserId) {
		this.currentUserId = currentUserId;
	}
	public User getU() {
		return U;
	}
	public void setU(User u) {
		U = u;
	}


}