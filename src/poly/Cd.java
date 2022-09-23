package poly;

public class Cd extends Item {
	String singer;
	
	public Cd() {
		
	}
	public Cd(String singer) {
		this.singer =singer;
	}
	public void output() {
		System.out.println(singer);
	}

	
}
