package spring_app01;

public class HelloCh implements Hello{
	@Override
	public void sayHello(String str) {
		System.out.println(str + " 你好");
	}
}
