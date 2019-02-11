package spring_aop09_AspectJ_Hw;

public class WeaponImp implements Weapon{

	String type;
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void fire() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(type + " 발사. 탕 ~!");
	}

	@Override
	public void reload() {
		System.out.println(type + " 재장전");
	}

}
