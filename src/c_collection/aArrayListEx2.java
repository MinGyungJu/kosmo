package c_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		// generics : 내가 넣고자하는 자료형을 명시하는것
		
		list.set(3, "rabbit");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
//		//System.out.println(list);
//		for(int i=0; i<list.size(); i++) {
//			String data = (String)list.get(i); //형변환
//			System.out.println(data);
//		}
//		
//		// 향상된 for 문 (genereics 해야만 사용가능)
//		for( String data : list ) {
//			System.out.println(data);
//		}
//		

	}
}
