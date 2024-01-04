package set1.q1.Beans;

public class Emp {
	private int ID;
	private String Name;
	private String Gen;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int iD, String name, String gen) {
		super();
		this.ID = iD;
		this.Name = name;
		this.Gen = gen;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGen() {
		return Gen;
	}
	public void setGen(String gen) {
		Gen = gen;
	}
	@Override
	public String toString() {
		return "Emp [ID=" + ID + ", Name=" + Name + ", Gen=" + Gen + "]";
	}
	
	
}
