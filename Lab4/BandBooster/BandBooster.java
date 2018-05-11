
public class BandBooster {
	String name;
	int boxesSold;
	
	public BandBooster(String boosterName) {
		//boosterName = name;
		name = boosterName;
		boxesSold = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int updateSales(int sold) {
		boxesSold = boxesSold + sold;
		return sold;
	}
	
	public String toString() {
		return(getName() + " has sold: "+ boxesSold + " boxes.");
	}
	
}
