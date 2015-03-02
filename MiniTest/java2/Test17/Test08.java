class Outer{
	void foo(){
		class Inner{
			void bar(){
				System.out.println("A");
			}
		}
		Inner x = new Inner();
		x.bar();
		System.out.println("B");
	}
}

class Test{
	public static void main(String[] args){
		Outer o = new Outer();
		o.foo();
	}
}