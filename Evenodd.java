import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer to check whether it is even or odd:");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even integer");
        } else {
            System.out.println(num + " is an odd integer");
        }
        sc.close(); // It's good practice to close the scanner when done
    }
}
