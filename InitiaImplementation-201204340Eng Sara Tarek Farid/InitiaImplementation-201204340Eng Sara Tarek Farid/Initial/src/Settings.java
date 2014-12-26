import java.util.ArrayList;



public class Settings {
	public String name ; 
	public String mail ; 
	public String bio ; 
    ArrayList <String> cities = new ArrayList <String> ();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public ArrayList<String> getCities() {
		return cities;
	}
	public void setCities(ArrayList<String> cities) {
		this.cities = cities;
	}
	public Settings(String name, String mail, String bio,
			ArrayList<String> cities) {
		super();
		this.name = name;
		this.mail = mail;
		this.bio = bio;
		this.cities = cities;
	} 
    
    
    
}
