package ironhead.home;

public class Knight {
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
		return "�M�h";
	}
	
	int getHp() {
		return hp;
	}
	
	void fight() {
		System.out.printf("%s�ϥX�F���q������%d�I\n", name, damage);
	}
	
	void shield() {
		hp *= 2;
		System.out.printf("%s�|�_�F�޵P, hp��%d\n", name, hp);
	}
}
