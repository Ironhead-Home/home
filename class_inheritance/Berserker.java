package ironhead.home;

public class Berserker {
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
		return "狂戰士";
	}
	
	int getHp() {
		return hp;
	}
	
	void fight() {
		System.out.printf("%s使出了普通的攻擊%d點\n", name, damage);
	}
	
	void berserk() {
		damage *= 2;
		System.out.printf("%s進入了狂暴的狀態, 攻擊力變%d\n", name, damage);
	}
}
