package ironhead.home;

public class Berserker {
	private String name = "�L�W��";
	private int hp = 100;
	private int damage = 50;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getJob() {
		return "�g�Ԥh";
	}
	
	int getHp() {
		return hp;
	}
	
	void fight() {
		System.out.printf("%s�ϥX�F���q������%d�I\n", name, damage);
	}
	
	void berserk() {
		damage *= 2;
		System.out.printf("%s�i�J�F�g�ɪ����A, �����O��%d\n", name, damage);
	}
}
