import java.util.*;
class ReplaceSubstring
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s="Hello, welcome to the coding world!";
      String wordToReplace = "coding";
      String replacementWord = "programming";
      String s1=s.replace(wordToReplace,replacementWord);
      System.out.println(s1);
    }
  }