import java.util.Scanner;
public class MainView {
	//function Register()
	User u=new User();
	Main mainController = new Main();
	public Scanner in= new Scanner(System.in);
	
	public void Register( )
	{

		String name, email , password , confirmed_password;
		 int age ;
		
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
	    
	    
	    mainController.signUp(name , email ,age, password,confirmed_password);
	    
	    
	    //u1=in;//an 3arfa en da ghalat 3lshan hasta5dem el database
	    //Users_data.add(u1);//we da ghalat
	  /*  for(int i=0; i<Users_data.size();i++)
	    {
	    	//if(u1!=Users_data.get(arg0))//we da ghalat
	        {
	        	
	        }
	    	 */
	    System.out.println("You successfully signed up!");

	    }


	//function login()
  Scanner input = new Scanner(System.in);
  String email; 
  String password;
  
	public void login ()
	{
		
		System.out.println("Please Enter your email :" );
		input = new Scanner (System.in);
		email = input.next();
		System.out.println("Please Enter the Password");
		password = input.next();
		System.out.println("You Successfully logged in!");
		// use database
		mainController.signIn(email ,password);
		
}
}
