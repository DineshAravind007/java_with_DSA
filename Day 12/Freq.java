
import java.util.*;
class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        
        
    }
}