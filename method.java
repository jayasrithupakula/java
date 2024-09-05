import java.util.Scanner;

public class Addition {
    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers for addition:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = add(x, y);
        System.out.println("Sum of " + x + " and " + y + " is " + z);
        sc.close();
    }
}
