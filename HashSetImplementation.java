import java.util.HashSet;

public class HashSetImplementation {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> a = new HashSet<Character>();
       
        for (int i = 0; i < s.length(); i++) {
            a.add(null);
        }
        return a.size();
    }

    
}
