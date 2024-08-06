import java.util.Scanner;
class HarshadNumber {
    public static boolean sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int sum=0;
        while(x>0)
        {
            int rem=x%10;
            sum=sum+rem;
            x=x/10;
        }
        if(n%sum==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int n=sc.nextInt();
        System.out.println(sumOfTheDigitsOfHarshadNumber(n));
    }
}