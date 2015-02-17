public class Test01{
	public static void main(String[] args){
		int mask = 0;
		int count = 0;

		if( (5>7)||(++count<10) | mask++ < 10 ) // true 変数 maskは 1
			mask = mask+1;                      //      Processing mask = 2
		if((6>8) ^ false) //false
			mask = mask + 10; // No Processing
		if(!(mask > 1) && ++ count > 1) //false         Processing count = 1
			mask = mask+100; // No Processing

		System.out.println("mask : count");
		System.out.println(mask + "    :    " + count);
					     //  2     				  1

	}
}