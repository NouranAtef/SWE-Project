
public class UserDatabaseManager {

	public  boolean notificationStatus ;
	public  boolean mailremainderStatus;
	public  boolean name;
	public  boolean Mail;
	public  boolean Bio;
	public  boolean city;
	public  boolean removeCity;
	public  boolean interists;
	public  boolean addinterest;
	public  boolean removeinterest;
	public  boolean addticket;
	public  boolean Ticket;
	public  boolean User;
	public  boolean FollowersName;
	public  boolean FollowingName;
	public  boolean Usersbymail;
	public  boolean addnewuser;
	public boolean isNotificationStatus() {
		return notificationStatus;
	}
	public void setNotificationStatus(boolean notificationStatus) {
		this.notificationStatus = notificationStatus;
	}
	public boolean isMailremainderStatus() {
		return mailremainderStatus;
	}
	public void setMailremainderStatus(boolean mailremainderStatus) {
		this.mailremainderStatus = mailremainderStatus;
	}
	public boolean isName() {
		return name;
	}
	public void setName(boolean name) {
		this.name = name;
	}
	public boolean isMail() {
		return Mail;
	}
	public void setMail(boolean mail) {
		Mail = mail;
	}
	public boolean isBio() {
		return Bio;
	}
	public void setBio(boolean bio) {
		Bio = bio;
	}
	public boolean isCity() {
		return city;
	}
	public void setCity(boolean city) {
		this.city = city;
	}
	public boolean isRemoveCity() {
		return removeCity;
	}
	public void setRemoveCity(boolean removeCity) {
		this.removeCity = removeCity;
	}
	public boolean isInterists() {
		return interists;
	}
	public void setInterists(boolean interists) {
		this.interists = interists;
	}
	public boolean isAddinterest() {
		return addinterest;
	}
	public void setAddinterest(boolean addinterest) {
		this.addinterest = addinterest;
	}
	public boolean isRemoveinterest() {
		return removeinterest;
	}
	public void setRemoveinterest(boolean removeinterest) {
		this.removeinterest = removeinterest;
	}
	public boolean isAddticket() {
		return addticket;
	}
	public void setAddticket(boolean addticket) {
		this.addticket = addticket;
	}
	public boolean isTicket() {
		return Ticket;
	}
	public void setTicket(boolean ticket) {
		Ticket = ticket;
	}
	public boolean isUser() {
		return User;
	}
	public void setUser(boolean user) {
		User = user;
	}
	public boolean isFollowersName() {
		return FollowersName;
	}
	public void setFollowersName(boolean followersName) {
		FollowersName = followersName;
	}
	public boolean isFollowingName() {
		return FollowingName;
	}
	public void setFollowingName(boolean followingName) {
		FollowingName = followingName;
	}
	public boolean isUsersbymail() {
		return Usersbymail;
	}
	public void setUsersbymail(boolean usersbymail) {
		Usersbymail = usersbymail;
	}
	public boolean isAddnewuser() {
		return addnewuser;
	}
	public void setAddnewuser(boolean addnewuser) {
		this.addnewuser = addnewuser;
	}
	public UserDatabaseManager(boolean notificationStatus,
			boolean mailremainderStatus, boolean name, boolean mail,
			boolean bio, boolean city, boolean removeCity, boolean interists,
			boolean addinterest, boolean removeinterest, boolean addticket,
			boolean ticket, boolean user, boolean followersName,
			boolean followingName, boolean usersbymail, boolean addnewuser) {
		super();
		this.notificationStatus = notificationStatus;
		this.mailremainderStatus = mailremainderStatus;
		this.name = name;
		Mail = mail;
		Bio = bio;
		this.city = city;
		this.removeCity = removeCity;
		this.interists = interists;
		this.addinterest = addinterest;
		this.removeinterest = removeinterest;
		this.addticket = addticket;
		Ticket = ticket;
		User = user;
		FollowersName = followersName;
		FollowingName = followingName;
		Usersbymail = usersbymail;
		this.addnewuser = addnewuser;
	}
	
	
}
