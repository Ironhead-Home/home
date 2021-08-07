package ironhead.home;

public class Knight2 extends Warrior {

	// 不加這個的話getJob會回傳"戰士"
	@Override
	String getJob() {
		return "騎士2";
	}	
	
	// 直拉呼叫父class的getHp並乘以某倍數.
	@Override
	int getHp() {
		return (int) (super.getHp() * 1.2);
	}	
		
	// 因為shield是狂戰士獨有的技能, 所以要在這個class另外加入
	void shield() {
		hp *= 2;
		System.out.printf("%s舉起了盾牌, hp變%d\n", name, hp);
	}

}
