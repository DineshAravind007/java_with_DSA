// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //moving non-zeroes to 1st
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count] = arr[i];
                count++;
            }
        }
        
        //fill zeroes to the end
        while(count<n)
        {
            arr[count] = 0;
            count++;
        }
        
        System.out.print("The final array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}