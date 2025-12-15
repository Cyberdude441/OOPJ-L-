import java.util.Scanner;

class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        
        sc.close();
    }
}

