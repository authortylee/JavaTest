public class Outer{
	private String s = "HELLO";
	public static int x = 10;
	public void method(final int x){
		int z = 0;
		class Inner{
			void showValue(){
				System.out.println(s);
				System.out.println(x);
				System.out.println(y);
				System.out.println(z); // compile error
				// 로컬네스트클래스에서는 같은 메소드 안에 있는
				// final 변수 밖에 사용하지 못한다.
			}
		}
	}
}