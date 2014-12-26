import java.util.ArrayList;


public class EventController {
public int currentUserId ; 
Event e = new Event();
ArrayList<Event> al = new ArrayList<Event> () ; 
public Event getEventId(int eventId) { 
	return e ;
}
public boolean createNewEvent (String newEvent){
	return false;

}

public boolean saveEvent (Event m)
{
	return false;
	
}
public boolean joinEvent (int eventId)
{
	return false;
	
}

public boolean leaveEvent ( int eventId){
	return false;}
public boolean deleteEvent (int eventId ){
	return false;}
public ArrayList getRecentEvents (int eventId )
{
	return al;
}
public ArrayList getCreatedEventsByUserId ()
{
	return al;
	
}

public ArrayList getJointEventsByUserId ()
{
	return al;
}
public Event searchEvents (String SE)
{
	return e;
	
}
public boolean addNewNotification(String s){
	return false;} 

public boolean buyTicket(int eventId, int price ) {
	return false;} 






}
