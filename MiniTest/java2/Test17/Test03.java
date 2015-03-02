class Outer{
	class Inner{
		int x = 10;
		public Inner(int x){
			this.x = x;
		}
		public void foo(){
			System.out.println(x);
		}
	}
	public static void bar(){
		new Inner(7).foo(); // complie Error
	}
}

class Test{
	public static void main(String[] args){
		Outer.bar();
	}
}