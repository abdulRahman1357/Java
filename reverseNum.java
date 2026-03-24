import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args){
        
        int rev=0;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number:");
            int a = sc.nextInt();
            while(a>0){
                int digit = a%10;
                rev = rev*10+digit;
                a=a/10;
            }
        System.out.println("Reversed Number :"+ rev);
        sc.close();
    }
}
