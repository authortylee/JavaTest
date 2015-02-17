public class Test06{
	public static void main(String[] args){
		byte b = 1;
		short s = b;

		s += s;
		s = s + s; // Compile Error              NoCast s = short s+s = int
		//
		int i = s;

		System.out.println(i);
	}
}