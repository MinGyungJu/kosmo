package Project_20220929;

public class EdibleVo {
	String name;
	int cost;

	public EdibleVo(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", cost=" + cost + "]\n";
	}
 

}
