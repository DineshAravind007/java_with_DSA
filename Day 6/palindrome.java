
import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        str=str.toLowerCase();
        int l = 0;
        int r = str.length()-1;
        str=str.toLowerCase();
        while(l<r)
        {
            if(str.charAt(l) != str.charAt(r))
            {
                System.out.println("Not a palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
    }
} 
    

