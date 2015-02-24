class Test{
	public double foo(float d){
		return d + 5.0d;
	}
	public static void main(String[] args){
		Test t = null;
		t.foo(5); // 변수 t는 현재 null값이 대입되어있다. 그러므로 NullPointerException
				  // 을 붐어내면서 종료.
	}
}