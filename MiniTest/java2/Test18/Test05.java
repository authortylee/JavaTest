class Outer{
	static class Inner{
		void method(){
			System.out.println("ABC");
		}
	}
}

class Test{
	public static void main(String[] args){
		new Outer.Inner().method();
	}
}