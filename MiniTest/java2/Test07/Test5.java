interface If1{}
interface If2{}
class S implements If2{}

class Test{
	public static void main(String[] args){
		If1 i1 = new S();
		If2 i2 = (If2)i1; // compile Error
	}
}