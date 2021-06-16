package section1;

import java.util.ArrayList;
import java.util.List;


public class Section1 {
	public static void main(String args[]) {
		Hero h1=new Hero("ミナト",100,10);
		System.out.println(h1);
		
		List<Hero> list=new ArrayList<>();
		list.add(h1);
		Hero h2=new Hero("ミナト",100, 100);
		Hero h3=new Hero("minato",100,100);
		list.remove(h2);
		System.out.println("要素数"+list.size());
		
		System.out.println(h2.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h3.hashCode());
		
	}
	
}
