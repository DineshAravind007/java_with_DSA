public class optiSw {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,5};

        int k = 3;
        int maxSum = 0;
        int Sum = 0;
        for(int i =0 ;i<k;i++){
            Sum += arr[i];
        }
        maxSum = Sum;
        for(int j=k;j<arr.length;j++){
            Sum = (Sum-arr[j-k])+arr[j];
            maxSum = Math.max(maxSum,Sum);
        }
        System.out.println(maxSum);
    }
}
