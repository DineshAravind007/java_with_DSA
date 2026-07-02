
import java.util.*;
class RemovDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        System.out.print(set);
    }
}