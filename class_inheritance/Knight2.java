package ironhead.home;

public class Knight2 extends Warrior {

	// ���[�o�Ӫ���getJob�|�^��"�Ԥh"
	@Override
	String getJob() {
		return "�M�h2";
	}	
	
	// ���ԩI�s��class��getHp�í��H�Y����.
	@Override
	int getHp() {
		return (int) (super.getHp() * 1.2);
	}	
		
	// �]��shield�O�g�Ԥh�W�����ޯ�, �ҥH�n�b�o��class�t�~�[�J
	void shield() {
		hp *= 2;
		System.out.printf("%s�|�_�F�޵P, hp��%d\n", name, hp);
	}

}
