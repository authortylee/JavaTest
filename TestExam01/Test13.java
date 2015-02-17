public class Test13{
	public static void main(String[] args){
		int x = 0;

		outer: for(;;){
			x++;
			inner: for(int i = 1; i < 10 ; i++){
				if((x+i)%3 == 0)
					break outer;
				if((x+i)%5 == 0)
					continue outer;
				if((x+i)%4 == 0)
					continue inner;
				x++;
			}
		}
		System.out.println(x);
	}
}