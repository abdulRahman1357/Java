import java.util.Scanner;

public class sum{
    public static void main(String[] arg){
        System.out.println("Enter your number:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int sum=0;
            for(int i=0;i<=a;i++){
                sum=sum+i;
            }
            System.out.println("The sum of numbers is :"+sum);

    }
}