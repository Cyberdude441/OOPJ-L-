import java.util.Scanner;

class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100)
            System.out.println("Grade: O (Outstanding)");
        else if (marks >= 80)
            System.out.println("Grade: E (Excellent)");
        else if (marks >= 70)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F (Fail)");

        sc.close();
    }
}