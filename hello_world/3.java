public class MyClass {
    public static void main(String args[]) {
        int x = 10;       // 將10存入int變數x
        System.out.println("x = " + x);   
        int y = x + 100;  // 將變數x加上100後再存入int變數y
        System.out.println("y = " + y);
     
        String s1 = "Ironhead Home";  // 將字串存入String變數s1
        System.out.println("s1 = " + s1);
        
        String s2 = s1 + 87;    // 將變數s1 "串接"一個字串"87"
        System.out.println("s2 = " + s2);
        
        // 所以 + 用在int與String變數時用途不一樣
        // String s2 = s1 - 87會發生什麼事?    
    }
}