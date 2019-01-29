package spring_aop01;

public class CustomerServiceImpl implements CustomerService{
	
	String name;
	String email;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void printName() {
		System.out.println("Your name : " + name);
	}

	@Override
	public void printEmail() {
		System.out.println("Your email : " + email);
		
	}
}
