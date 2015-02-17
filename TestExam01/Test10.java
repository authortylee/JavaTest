public class Test10{
	public static void main(String[] args){
		int a = 4;
		int b = 3;
		int c = 2;

		if((a > b) ^ ((c*2) == a)){
			// 処理の中心は ^(NOT演算子)である。 
			// 左 (a>b)は true を返す。
			// 右 (c*2) = 4である。
			//      4   ==  a は true を返す。
			// true ^ true = false
			// それでいかの文は処理されない。

			System.out.println("x");
		}

		if((b + 1 != a ) ^ (( c * 2 ) == b)){
			/*  処理の中心は ^ 演算子である。
				左 : (b + 1 != a)
					    4   != a


			*/

			System.out.println("y");
		}

		System.out.println((b + 1 != a ));

	}
}