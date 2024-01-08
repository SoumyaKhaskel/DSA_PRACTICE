import java.util.*;
public class calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        char operator;

        System.out.println("Enter 2 numbers as operands : ");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Enter the operator : ");
        operator =sc.next().charAt(0);

        switch(operator)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
            default:
            System.out.println("Wrong option");
            
        }
    }
}
