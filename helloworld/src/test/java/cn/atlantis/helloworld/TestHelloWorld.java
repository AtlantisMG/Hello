package cn.atlantis.helloworld;

import org.junit.Test;

import cn.atlantis.helloword.HelloWorld;

public class TestHelloWorld {
	@Test
	public void test() {
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.sayHi("张三"));
	}
}
