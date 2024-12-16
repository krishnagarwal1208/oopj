import java.util.*;
public class swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Numbers before swapping:");
        System.out.println("a = "+a+", b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swapping:");
        System.out.println("a = "+a+", b = "+b);
    }
    
}
