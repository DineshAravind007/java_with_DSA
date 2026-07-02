import java.util.*;
class CheckDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array values: ");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter k Value: ");
        int k = sc.nextInt();
        
        boolean res = false;
        for(int i=0;i<n-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
                if(arr[j] == arr[i+k])
                {
                    System.out.print(res = true);
                    return;
                }
            }
        }
    }
}