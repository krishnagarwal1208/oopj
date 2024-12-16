import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int prev=0,next=1;
        int curr=0;
        for(int i=2;i<n;i++) {
            curr = prev+next;
            prev = next;
            next = curr;
        }
        System.out.println("The "+n+"th fibonacci number = "+curr);
    }
    
}
