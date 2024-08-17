import java.util.Scanner;
class RemoveAllCharactersOtherThanAlphabets
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string=");
      String a=sc.nextLine();
      String b="";
      for(int i=0;i<a.length();i++)
        {
          if(a.charAt(i)>='a'&&a.charAt(i)<='z'||a.charAt(i)>='A'&&a.charAt(i)<='Z')
          {
            b=b+a.charAt(i);
          }
        }
      System.out.println(b);
    }
  }