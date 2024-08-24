import java.util.*;
class PermutationsofString {
    public static List<String> permuteString(String s) {
        List<String> ans = new ArrayList<>();
        boolean[] freq = new boolean[s.length()];
        StringBuilder ds = new StringBuilder();
        recurPermute(s, ds, ans, freq);
        return ans;
    }
    public static void recurPermute(String s, StringBuilder ds, List<String> ans, boolean[] freq) {
        if (ds.length() == s.length()) {
            ans.add(ds.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.append(s.charAt(i));
                recurPermute(s, ds, ans, freq);
                ds.deleteCharAt(ds.length() - 1);
                freq[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string=");
        String s = sc.next();
        List<String> permutations = permuteString(s);
        Collections.sort(permutations);
        System.out.println(permutations);
    }
}
