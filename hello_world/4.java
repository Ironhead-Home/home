public class MyClass {
    public static void main(String args[]) {
        String s1 = "Ironhead Home";  // 將字串存入String變數s1
        System.out.println("s1 = " + s1);
        
        String s2 = s1.toUpperCase();	// 將字串全部轉大寫
        System.out.println("s2 = " + s2);
        
        int length = s1.length();		// 計算字串的長度
        System.out.println("length = " + length);
    }
}