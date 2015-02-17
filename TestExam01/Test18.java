public class Test18{
	public static void main(String[] args){
		byte a = 1 , b = 2 , c = 3;
		if(a<b){
			if(a>c)
				b*=2;
			else
				b =(byte)(b%2);
				b -= 1;
		}else{
			b = b;
		}
		System.out.println(b);
	}
}