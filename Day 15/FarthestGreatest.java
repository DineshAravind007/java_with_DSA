import java.util.*;
public class FarthestGreatest{
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
            int far = -1;
            for(int j=arr.length-1;j>i;j--)
            {
                if(arr[j] > arr[i])
                {
                    far = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " --> " + far);
        }
        
    }
}
