
import java.util.*;
class StackPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }
        
        String rev = "";
        while(!stack.isEmpty())
        {
            rev = rev + stack.pop();
        }
        
        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        
        
    }
}