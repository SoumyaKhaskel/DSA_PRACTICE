public class friendsharing {
    public static int friendsharing(int n) {
        //base
        if(n==1 ||n==2)
        {
            return n;
        }
        //choices
        //single
        int fnm1=friendsharing(n-1);

        //pair
        int fnm2=friendsharing(n-2);
        int pairways=(n-1)*fnm2;

        //totalways
        int tw=fnm1+pairways;
        return tw;
        //return friendsharing(n-1)+ (n-1) * friendsharing(n-2);
    }
    public static void main(String args[]) {
        System.out.println(friendsharing(3));
    }
    
}
