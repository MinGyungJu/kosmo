package poly;

abstract public class Item {
	
	protected String name;
	protected String num;
	
	public Item(){
		
	}
	public Item(String name, String num) {
		this.num = num;
		this.name = name;
	}
	abstract public void output() ;
	
		
	
}
