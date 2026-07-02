import java.util.*;

public class intersection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        set1.retainAll(set2);

        System.out.println("Intersection = " + set1);
    }
}