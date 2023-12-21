import java.util.HashMap;

/**
 * HashMapImplementation
 */
public class HashMapImplementation {
  //Top K Frequent Elements
  public static Integer countUniqueWords(String[] words) {
    HashMap<String, Integer> Words = new HashMap<String, Integer>();
    for (int i = 0; i < words.length; i++) {
      Words.put(words[i], i);
    }
    int count = Words.keySet().size();
    System.out.println(Words.keySet());
    return count;
  }

  public static int romanToInt(String s) {
    int sum=0;
    HashMap< Character,Integer> romans= new HashMap<Character,Integer>();
    romans.put('I', 1);
    romans.put('V', 5);
    romans.put('X', 10);
    romans.put('L',50);
    romans.put('C', 100);
    romans.put('D', 500);
    romans.put('M', 1000);
    sum=sum+romans.get(s.charAt(0));
    for (int i =1; i<s.length(); i++) {
      if (romans.get(s.charAt(i))>romans.get(s.charAt(i-1))) {
        sum=sum+romans.get(s.charAt(i))-(romans.get(s.charAt(i-1))*2);
      } else {
        sum=sum+romans.get(s.charAt(i));
      }
    }

    return sum;
  }
  public static void main(String[] args) {

    HashMap<String, Integer> a = new HashMap<String, Integer>();
    a.put("Ram", 100);
    a.put("Laxman", 100);
    a.put("Bharat", 100);
    a.put("Hanuman", 100);
    // System.out.println(a.get("Laxman"));
    // System.out.println(a);
    System.out.println(romanToInt("XVII"));
  }
}