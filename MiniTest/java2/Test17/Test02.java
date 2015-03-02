class Outer{
	class Inner{
		void foo(){
			System.out.println("A");	
		}		
	}
	public void meth(){
		Inner i = new Inner();
		//outer.Inner i = new Inner();
		i.foo();
	}
}