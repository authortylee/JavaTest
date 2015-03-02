class Outer{
	class A{
		void print(){
			System.out.print("A");
		}
	}
	void foo(){
		class A{
			void print(){
				System.out.print("B");
			}
		}
		new A().print();
	}
}

class Test{
	public static void main(String[] args){
		new Outer().foo();
	}
}