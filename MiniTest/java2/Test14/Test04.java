/*
 assertion 문법
 x 는 int b는 boolean 이라고 가정할때


 assert = 1;
 틀렸다. assert 뒤에는 조건식을 기술해야한다. 컴파일 에러
 assert b:System.out.println("A");
 조건식 : 뒤에는 문자열이나 수치 식이성립하는것이 와야한다.
 assert x == 1 : x;
 바른답!
 assert 0;
 틀림
 assert b: foo(); 
 틀림
 assert b : new MyClass(); 이건 맞는답니다.
 assert b : b가 true라면 new MyClass()의 인스턴스를 참조
*/