
public class Dir {
	private String name;
	private String email;
	private String gender;
	
	public Dir (String name , String email , String gender) {
		this.name = name;
		this.email = email;
		this.gender=gender;
	}
	
	public Dir() {
		this.name = "";
		this.email = "";
		this.gender="";
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGender(String Character) {
		String gender = Character.toString();
		return gender;
	}
	public String toString() {
		return name+" ("+email+";"+gender+")";
	}

}
