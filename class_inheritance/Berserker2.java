package ironhead.home;

public class Berserker2 extends Warrior {
	
	// ���[�o�Ӫ���getJob�|�^��"�Ԥh"
	@Override
	String getJob() {
		return "�g�Ԥh2";
	}	
	
	// ���ԩI�s��class��getHp�í��H�Y����.
	@Override
	int getHp() {
		return (int) (super.getHp() * 0.8);
	}	
		
	// �]��berserk�O�g�Ԥh�W�����ޯ�, �ҥH�n�b�o��class�t�~�[�J
	void berserk() {
		damage *= 2;
		System.out.printf("%s�i�J�F�g�ɪ����A, �����O��%d\n", name, damage);
	}
}
