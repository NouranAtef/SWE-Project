import java.util.ArrayList;


public class Profile {
ArrayList <User> followers = new ArrayList <User> () ;
ArrayList <User> following = new ArrayList <User> () ;
public ArrayList<User> getFollowers() {
	return followers;
}
public void setFollowers(ArrayList<User> followers) {
	this.followers = followers;
}
public ArrayList<User> getFollowing() {
	return following;
}
public void setFollowing(ArrayList<User> following) {
	this.following = following;
}
public Profile(ArrayList<User> followers, ArrayList<User> following) {
	super();
	this.followers = followers;
	this.following = following;
}


}
