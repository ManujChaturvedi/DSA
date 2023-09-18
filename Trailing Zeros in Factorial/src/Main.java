import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Trailing zeros in a factorial is found by the formula --> N/5 + N/5^2 + N/5^3 + ...
//    Do this till you get a decimal value

        // to take the input.
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();

        //variable to raise to the power:
        int n=1;
        // variable for answer:
        int ans=0;

        while(N/Math.pow(5,n)<=1){
            ans+=N/Math.pow(5,n);
            n++;
        }

        // Print answer or return the value:
        System.out.println(ans);
    }
}