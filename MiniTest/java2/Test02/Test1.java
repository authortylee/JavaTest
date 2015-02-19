class Sp{}

class Sub extends Sp{
	static void foo(){
		System.out.print("A");
	}
}

class Test{
	public static void main(String[] args){
		Sub.foo();
		Sp s = new Sub();
		s.foo();
	}
}