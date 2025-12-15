import java.util.Scanner;

class ObjectCounter {
    static int count = 0;  // static variable shared by all objects

    ObjectCounter() {
        count++;  // increment count when object is created
    }

    static void displayCount() {
        System.out.println("Number of objects created = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many objects you want to create: ");
        int n = sc.nextInt();

        // create n objects
        for (int i = 0; i < n; i++) {
            new ObjectCounter();
        }

        // display total objects created
        ObjectCounter.displayCount();
        sc.close();
    }
}
