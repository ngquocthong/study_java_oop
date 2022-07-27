import java.util.Scanner;

public class quocthong {
    public static void main(String[] args) {
        System.out.println("Hi, wassss up bro!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.printf("Your name is: %s, and your age is: %d", name, age);

        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // System.out.printf("%d + %d = %d", a, b, a + b);
    }
}