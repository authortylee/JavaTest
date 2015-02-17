public class Test17{
	static void main(int[] args){
		args[3] /= 3;
		return ;
	}
	public static void main(String[] args){
		int[] a = {10,20,30,40,50};

		for(int i = 1 ; i <=1; i++) // 단순하게 main(a) 를 2번 하라는 처리
		main(a);					// 첫번째는 배열 a의 값이 10, 20, 30 ,13,50
									// 두번째는 배열 a의 값이 10, 20, 30, 4, 50
		for(int i = 0 ; i < 5 ; i ++){
			System.out.println(a[i] + " ");
		}
	}
}