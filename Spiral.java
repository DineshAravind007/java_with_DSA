import java.util.*;

class Spiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[4][4];

        System.out.println("Enter 16 elements:");

        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = 3;
        int left = 0;
        int right = 3;

        System.out.println("Spiral Order:");

        while(top <= bottom && left <= right) {

            
            for(int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            
            for(int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}