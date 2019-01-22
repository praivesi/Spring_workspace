package spring_app02;

public class BeverageImp implements Beverage{
	String menu;
	
	public BeverageImp() {
		this.menu = "냉수";
	}
	
	public BeverageImp(String menu) {
		this.menu = menu;
	}
	
	@Override
	public void drink(String name) {
		System.out.println(name + " 님이  " + menu + " 를 마셔요.");
	}
}
