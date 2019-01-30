package spring_aop03_before_after;

public class BankImp implements Bank {
	
	String name;
	int balance;

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void transfer(int money) {
		System.out.println("계좌 이체를 시작합니다.");
		System.out.println(name + " 님 계좌에서 " + money + " 원 출금되었습니다.");
		balance -= money;
		System.out.println("자액 : " + balance + " 원");
	}

}
