import java.util.Scanner;
class AutoMorphicNumber
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number=");
      int n=sc.nextInt();
      int sq=n*n;
      int i=0;
      while(n>0)
        {
          if(n%10!=sq%10)
          {
            System.out.println("Not an Automorphic Number");
            i=1;
            break;
          }
          n=n/10;
          sq=sq/10;
        }
      if(i==0)
      {
        System.out.println("Automorphic Number");
      }
        
    }
  }