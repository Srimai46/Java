
public class the extends Movie{
	private int thea;
	
	public the(String id , String name , Dir dir,int thea) {
		super(id,name,dir);
		this.thea = thea;
	}
	
	public the () {
		super();
		
	}
	public String getThea() {
		if(thea>0&&thea<12) {
			return "Basic Theater";
		}
		else if (thea>11&&thea<15) {
			return "Sweet Theater";
		}
		else if (thea==15) {
			return "Premium Theater";
		}
		else return "null";
	}
	public String toString() {
		return getThea()+" : "+super.toString();
	}

}
