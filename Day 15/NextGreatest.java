import java.util.*;
public class NextGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            int next = -1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] > arr[i])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " --> " + next);
        }
        
    }
}
