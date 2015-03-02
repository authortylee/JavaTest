class Outer{
	class Inner{
		void method(){
			System.out.println("ABC");
		}
	}
	public static void main(String[] args){
		Inner i = new Outer().new Inner();
		Outer.Inner i2 = i;
		i2 = new Outer().new Inner();
	}
}