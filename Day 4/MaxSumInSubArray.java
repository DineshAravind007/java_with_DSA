import java.util.*;
public class MaxSumInSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-4,5,3,2};
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }

        }
        System.out.println("Maximum sum of subarray: " + max);
        
  }
}