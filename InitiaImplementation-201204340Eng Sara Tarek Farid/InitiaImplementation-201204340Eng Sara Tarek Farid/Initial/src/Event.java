public class Event
{
 User u1 = new User ();
 
 public int Event_Id;
 
 public String Event_name;
 
 public String Event_description; 
 
 public String Event_date ;
 
 public String Event_day ;
 
 public String Event_time ;
 
 public String Event_location;
 
 public String Category;
 
 public int Max_attendees;
 
 public int Min_attendees;
 
 public User Event_Admin ;
 
 public int no_of_tickets;
 
 public void CreateEvent ()
 {
	 
 }
 
public void DeleteEvent()
{
	}

public Event ViewEvents(Event e)
{
	return e;
}

}
