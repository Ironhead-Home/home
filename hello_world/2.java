import java.util.*;		// 匯入Java util函式庫

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 	// (先不用懂這一行) 
        System.out.print("Enter a string: ");  	// 輸出字串
        
        String str= sc.nextLine();              // 輸入字串 (先不用懂這一行)   
        System.out.print("You have entered: " + str);      // 將使用者剛剛輸入的字串再輸出
    }
}