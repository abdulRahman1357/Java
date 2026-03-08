
import java.util.Scanner;

class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        String c;

        System.out.println("Enter your first number:");
        a = sc.nextInt();

        System.out.println("Enter your Second number:");
        b = sc.nextInt();

         System.out.println("Choose your operator:");
         System.out.println("1.+");
         System.out.println("2.-");
         System.out.println("3.*");
         System.out.println("4./");

        c = sc.next();
        if(c.equals("1"))
        {
            System.out.println("Your ans is:" + (a+b));
        }
        else if(c.equals("2"))
        {
            System.out.println("Your ans is:" + (a-b));
        }
        else if(c.equals("3"))
        {
            System.out.println("Your ans is:" + (a*b));
        }
        else if(c.equals("4"))
        {
            System.out.println("Your ans is:" + (a/b));
        }
        else{
            System.out.println("Invalid opr");
        }
    }
}
