
import java.util.*;
class ReverseKelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter k value: ");
        int k = sc.nextInt();
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<n-k;i++)
        {
            q.addLast(arr[i]);
        }
        
        for(int i=n-k;i<n;i++)
        {
            stack.push(arr[i]);
        }
        
        while(!stack.isEmpty())
        {
            q.addLast(stack.pop());
        }
        
        while(!q.isEmpty())
        {
            System.out.print(q.pollFirst() + " ");
        }
    }
}