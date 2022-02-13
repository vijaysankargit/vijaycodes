

public class Laptop implements Comparable<Laptop>{
	private int lid;
	private String lname;
	
	public Laptop(int lid, String lname){
		this.lid = lid;
		this.lname= lname;
	}
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public int compareTo(Laptop o) {
		if(this.getLid() > o.getLid()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}
