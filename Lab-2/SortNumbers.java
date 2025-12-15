import java.util.Scanner;
import java.util.Arrays;

class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to sort: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Numbers in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
