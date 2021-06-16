package section2;

public class section2 {
	public static void main(String args[]) {
//		Pocket<String> p=new Pocket<String>();
//		p.put("Hello");
//		System.out.println(p.get());
//		Pocket<Integer> p2=new Pocket<Integer>();
//		p2.put(2);
//		System.out.println(p2.get());
//		Pocket<?> pp;
//		pp=new Pocket<String>();
//		pp=new Pocket<Integer>();
		
		//innerクラスの呼び出し
		Outer ou=new Outer();
		ou.outerMethod();
	}
}
