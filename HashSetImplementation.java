import java.util.HashSet;

public class HashSetImplementation {
    public static int lengthOfLongestSubstring(String s) {
       HashSet<Character> a = new HashSet<Character>();
       
        for (int i = 0; i < s.length(); i++) {
            a.add(s.charAt(i));
        }
        return a.size();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcabc"));
    }

    
}
