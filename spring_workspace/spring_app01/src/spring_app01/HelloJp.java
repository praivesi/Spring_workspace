package spring_app01;

public class HelloJp implements Hello{
	@Override
	public void sayHello(String str) {
		System.out.println(str + " こんにちは");
	}
}
