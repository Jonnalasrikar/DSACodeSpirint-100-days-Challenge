import java.util.*;

class ReplaceParticularString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = "Hello, welcome to the coding world!";
    System.out.println("Enter the string that needs to be replaced:");
    String toReplace = sc.next();
    System.out.println("Enter the replacement string:");
    String replacement = sc.next();

    String[] words = s.split(" ");
    ArrayList<String> result = new ArrayList<String>();

    for (String word : words) {
      if (word.equals(toReplace)) {
        String replacedWord = word.replace(word, replacement);
        result.add(replacedWord);
      } else {
        result.add(word);
      }
    }
    String modifiedString = String.join(" ", result);
    System.out.println("Modified String: " + modifiedString);
  }
}
