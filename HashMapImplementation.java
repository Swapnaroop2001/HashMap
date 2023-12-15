import java.util.HashMap;

/**
 * HashMapImplementation
 */
public class HashMapImplementation {
    public static Integer countUniqueWords(String[] words) {
    HashMap<String, Integer> Words = new HashMap<String,Integer>();
    for (int i = 0; i < words.length; i++) {
      Words.put(words[i],i);
    }
    int count=Words.keySet().size();
    System.out.println(Words.keySet());
    return count; 
  }

    public static void main(String[] args) {

        HashMap<String,Integer> a=new HashMap<String,Integer>();
        a.put("Ram", 100);
        a.put("Laxman", 100);
        a.put("Bharat", 100);
        a.put("Hanuman", 100);

        System.out.println(a);
        System.out.println(a);
    }
}