public class MyClass {
    public static void main(String args[]) {
        int x = 10;       // �N10�s�Jint�ܼ�x
        System.out.println("x = " + x);   
        int y = x + 100;  // �N�ܼ�x�[�W100��A�s�Jint�ܼ�y
        System.out.println("y = " + y);
     
        String s1 = "Ironhead Home";  // �N�r��s�JString�ܼ�s1
        System.out.println("s1 = " + s1);
        
        String s2 = s1 + 87;    // �N�ܼ�s1 "�걵"�@�Ӧr��"87"
        System.out.println("s2 = " + s2);
        
        // �ҥH + �Φbint�PString�ܼƮɥγ~���@��
        // String s2 = s1 - 87�|�o�ͤ����?    
    }
}