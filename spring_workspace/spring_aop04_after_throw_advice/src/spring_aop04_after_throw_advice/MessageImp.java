package spring_aop04_after_throw_advice;

public class MessageImp implements Message {
	
	String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void printMsg() {
		System.out.println("출력 메시지 : " + msg);
	}

	@Override
	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}
