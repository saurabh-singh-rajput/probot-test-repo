package package2;

public class DummyClass2 {
    
    public static void main(String[] args) {
        // Some code here
    }
    
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    public int add(int num1, int num2) {
        return num1 + num2 + 3;
    }
    
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
