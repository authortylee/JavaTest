package com.coffee.bean;
import com.coffee.MyClass;
class Test extends MyClass{
	public void bar(boolean test){
		assert test;
		System.out.println("NG");
	}
	public static void main(String[] args){
		Test t = new Test();
		t.foo(false);
		t.foo(false);
	}
}