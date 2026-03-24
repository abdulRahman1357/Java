import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int temp=num1;
        int rev =0;
        while(num1>0){
            int digit = num1%10;
            rev=rev*10+digit;
            num1=num1/10;
        
        }
        if(rev==temp){
            System.out.println("Your number is a palindrome.");}
            else
                System.out.println("Your number is not a palindrome.");
        
    }
    
}
