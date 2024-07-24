import java.util.*;

public class MergeAndSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size 1 : ");
        int s1 = sc.nextInt();
        System.out.print("Enter size 2 : ");
        int s2 = sc.nextInt();

        int a[] = new int[s1];
        int b[] = new int[s2];
        int c[] = new int[s1 + s2];

        System.out.print("Enter array 1 elements : ");
        for (int i = 0; i < s1; i++) {
            a[i] = sc.nextInt();
            c[i] = a[i];
        }

        System.out.print("Enter array 2 elements : ");
        for (int i = 0; i < s2; i++) {
            b[i] = sc.nextInt();
            c[s1 + i] = b[i];
        }

        Arrays.sort(c);

        System.out.print("Merged 7 Sorted array : ");

        for (int i = 0; i < s1 + s2; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    flag = false;
                    c[j] = -1;
                }
            }
            if (flag && c[i] != -1)
                System.out.print(c[i] + " ");
        }
        sc.close();
    }
}