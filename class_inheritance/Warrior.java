package ironhead.home;

public class Warrior {
	protected String name = "�L�W��";
	protected int hp = 100;
	protected int damage = 50;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getJob() {
		return "�Ԥh";
	}
	
	int getHp() {
		return hp;
	}
	
	void fight() {
		System.out.printf("%s�ϥX�F���q������%d�I\n", name, damage);
	}	
}
