package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet <Integer>lottos = new HashSet<Integer>();
		//set = 순서를 저장하지않음, 중복을 피하는거
		
//		for(int i = 0; i<6; i++) {
		while(lottos.size()<6) {
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
		}
		System.out.println(lottos);
		
		ArrayList<Integer> list = new ArrayList<Integer>(lottos);
		Collections.sort(list);
		System.out.println(list);

		
	}
}
