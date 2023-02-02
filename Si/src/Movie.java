
public class Movie {
	private String id;
	private String name;
	private Dir  dir;
	
	public Movie(String id, String name,Dir dir) {
		this.id=id;
		this.name=name;
		this.dir=dir;          
				
	}
	public Movie() {
		this.id="";
		this.name="";
		this.dir=null;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Dir getDir() {
		return dir;
	}
	public void setDir(Dir dir) {
		this.dir = dir;
	}
	
	public String toString() {
		return getId()+" "+getName()+" direct by "+dir.toString();
	}

}
