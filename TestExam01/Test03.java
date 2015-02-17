public class Test03{
	public static int x;
	public static final int y = 0;
	public static void foo(int x){
		x --;
		y /=0; // Compile Error y is fanal 

		System.out.println(x + " : " + y);
	}
	public static void main(String[] args){
		foo(0);
	}
}