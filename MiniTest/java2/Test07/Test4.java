interface If1{}
interface If2 extends If1{}
class S implements If2{}

class Test{
	public static void main(String[] args){
		If2 i2 = new S();
		If1 i1 = i2;
		S s = (S)i1;
		If1 x = (If1)s;
	}
}