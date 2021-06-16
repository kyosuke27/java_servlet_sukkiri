package section2;

public class Outer {
	//ルーカルクラスの利用
	int outerMember=2;
	static int outerMember2=12;
	void outerMethod() {
		int a=10;
		class Inner{
			public void innerMethod() {
				System.out.println("innerMethodです");
				System.out.println(outerMember+a);
				System.out.println("クラス変数との足し算は"+(outerMember2+a)+"です");
			}
		}
		Inner ic=new Inner();
		ic.innerMethod();
	}
}
