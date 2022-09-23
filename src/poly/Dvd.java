package poly;

public class Dvd extends Item {

	String number;
	String title;
	String singer;
	
	public Dvd() {
		
	}
	public Dvd(String number,String title,String singer){
		this.number = number;
		this.singer = singer;
		this.title =title;
	}
	public void output() {
		System.out.println(singer);
	}
	
}
