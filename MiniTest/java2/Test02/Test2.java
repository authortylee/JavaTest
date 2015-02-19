class Sp{
	static void foo(){
		System.out.print("A");
	}
}

class Sub extends Sp{
}

class Test{
	public static void main(String[] args){
		Sub s1 = new Sub();
		s1.foo();
		Sp s2 = (Sp)s1;
		s2.foo();
		System.out.println();
	}
}