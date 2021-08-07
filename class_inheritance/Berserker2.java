package ironhead.home;

public class Berserker2 extends Warrior {
	
	// 不加這個的話getJob會回傳"戰士"
	@Override
	String getJob() {
		return "狂戰士2";
	}	
	
	// 直拉呼叫父class的getHp並乘以某倍數.
	@Override
	int getHp() {
		return (int) (super.getHp() * 0.8);
	}	
		
	// 因為berserk是狂戰士獨有的技能, 所以要在這個class另外加入
	void berserk() {
		damage *= 2;
		System.out.printf("%s進入了狂暴的狀態, 攻擊力變%d\n", name, damage);
	}
}
