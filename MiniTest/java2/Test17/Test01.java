class Outer{
	class Inner{
		void foo(){
			System.out.print("A");
		}
	}
}

class Test{
	public static void main(String[] args){
		Outer.Inner i =  new Outer().new Inner();
		i.foo();
	}
}