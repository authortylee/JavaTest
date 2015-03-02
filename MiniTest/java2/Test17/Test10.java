class Outer{
	class Inner{
		void method(){Inner in = new Inner();}
		static void method2(){Inner in = new Inner();} // static 메소드에서는 Outer().Inner() 로 작석해야 한다.
	}
}