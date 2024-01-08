import java.util.*;
class classroom1{
    static Scanner sc =new Scanner(System.in);
    int money[]=new int[10];
    String name[]=new String[10];
    name[0]="Samay";
    name[1]="Soumya";
    
    public static void Signup(){

    }
    public static void Login(){
        System.out.println("Enter your name: ");
        String log_name=sc.nextLine();
        System.out.println("Enter your password: ");
        System.out.println("Press 1 to generate OTP :");
        int l_opt=sc.nextInt();
        if(l_opt==1){
            Random random = new Random();
            int otp = 1000 + random.nextInt(9000); 
            System.out.println("Your OTP is: "+otp);
        }
        else{
            System.out.println("Thanks for using our service provider!");
        }
        System.out.println("Enter your otp to login successfully:");
        int otp2=sc.nextInt();
        if(otp2==otp){
            for(int i=0;i<name.length;i++)
            {
                if(name[i]=="")
                {
                    name [i]=log_name;
                    money[i]=100;
                }
            }
                System.out.println("Welcome "+log_name);
        }
        else{
                string ans="Invalid OTP";
            }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to BosuH Bank");
        System.out.println();
        System.out.println("Press 1 to Signup :   or ");
        System.out.print("Press 2 to Login :");
        
        int input = sc.nextInt();
        
            switch(input){
                case 1:
                    Signup();
                    break;
                case 2:
                    Login();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
    }
}