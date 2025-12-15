import java.util.*;

class NumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Using HashMap to store occurrences
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Display occurrences
        System.out.println("\nOccurrences of each number:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Occurrence of " + entry.getKey() + " = " + entry.getValue());
        }

        sc.close();
    }
}
