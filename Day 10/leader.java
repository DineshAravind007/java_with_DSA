// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array values: ");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i] > max)
            {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(leaders);
        System.out.print("Leader Elements: ");
        for(int i : leaders)
        {
            System.out.print(i+" ");
        }
        
        
    }
}