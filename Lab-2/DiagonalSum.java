import java.util.Scanner;

class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int leftSum = 0, rightSum = 0;

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate diagonal sums
        for (int i = 0; i < 3; i++) {
            leftSum += matrix[i][i];            // Left diagonal (top-left to bottom-right)
            rightSum += matrix[i][2 - i];       // Right diagonal (top-right to bottom-left)
        }

        System.out.println("Left = " + leftSum);
        System.out.println("Right = " + rightSum);
        sc.close();
    }
}
