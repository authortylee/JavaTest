class Outer{
	class Inner{
		void method(){
			System.out.println("ABC");
		}
	}
}

class Test{
	public static void main(String[] args){
		Outer.Inner i = new Outer().new Inner();
	}
}