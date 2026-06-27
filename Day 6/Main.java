import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array values : ");
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int l = 0;
        int r = 1;
        
        while(r<arr.length)
        {
            if(arr[l]==arr[r])
            {
                r++;
            }
            else if(arr[l] != arr[r])
            {
                l++;
                arr[l] = arr[r];
            }
        }
        for(int i=0;i<=l;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}