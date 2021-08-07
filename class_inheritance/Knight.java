package ironhead.home;

public class Knight {
	private String name = "無名氏";
	private int hp = 100;
	private int damage = 50;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getJob() {
		return "騎士";
	}
	
	int getHp() {
		return hp;
	}
	
	void fight() {
		System.out.printf("%s使出了普通的攻擊%d點\n", name, damage);
	}
	
	void shield() {
		hp *= 2;
		System.out.printf("%s舉起了盾牌, hp變%d\n", name, hp);
	}
}
