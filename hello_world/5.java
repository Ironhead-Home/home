public class MyClass {
    public static void main(String args[]) {
        int a = 987;
        int b = 600;

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else if (a == b) {
            System.out.println(a + " == " + b);
        }

        int height = 170;
        if (height < 160) {
            System.out.println("You are short.");
        } else if (height >= 160 && height < 170) {
            System.out.println("You are normal.");
        } else if (height >= 170 && height < 190) {
            System.out.println("You are tall.");
        } else {
            System.out.println("You are a giant.");
        }
    }
}