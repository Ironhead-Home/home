package ironhead.home;

public class Warrior {
	protected String name = "無名氏";
	protected int hp = 100;
	protected int damage = 50;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getJob() {
		return "戰士";
	}
	
	int getHp() {
		return hp;
	}
	
	void fight() {
		System.out.printf("%s使出了普通的攻擊%d點\n", name, damage);
	}	
}
