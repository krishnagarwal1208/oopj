import java.util.*;
public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int s=0,r=0;
        
        while(n>0) {
            r = n%10;
            s = (s*10)+r;
            n=n/10;
        }
        System.out.println("Reversed number = "+s);
    }
    
}
