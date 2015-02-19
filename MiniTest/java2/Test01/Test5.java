class A{
	static String name = "Fred";
}
class B extends A{
	static String name = "Lucy";
}

class Test{
	public static void main(String[] args){
		A a = new B();
		System.out.println(a.name);
		System.out.println(A.name);

		B b = (B)a;
		System.out.println(b.name);
		System.out.println(B.name);
	}
}
/*
 static 필드와 인스턴스 필드의 차이점을 보여준다.
 단순하게 static 필드의 변수값은 변수 타입을 따라간다.
  B b = (B)a; 
  의 결과값(Lucy)을 보듯 인스턴스값과의 차이점을 보여준다.
  인스턴스의 경우라면(Fred)가 나와야하지만 static이기때문에 변수의 형태를 따라간다. 

*/