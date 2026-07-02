
import java.util.*;
class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        System.out.print("Enter n1 value: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 1st array elements: ");
        for(int i=0;i<n1;i++)
        {
            set.add(sc.nextInt());
        }
        
        System.out.print("Enter n2 value: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 2nd array elements: ");
        for(int i=0;i<n2;i++)
        {
            set.add(sc.nextInt());
        }
        
        System.out.print(set);
    }
}