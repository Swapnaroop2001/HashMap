import java.util.HashSet;

public class HashSetImplementation {
    public static int lengthOfLongestSubstring(String s) {
       HashSet<Character> a = new HashSet<Character>();
       
        for (int i = 0; i < s.length(); i++) {
            a.add(s.charAt(i));
        }
        return a.size();
    }

    //Check if pair with given Sum exists in Array (Two Sum)
    static Boolean printpairs(int arr[], int sum){
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int temp=sum+arr[i];
            if (a.contains(temp)) {
                return true;
            }
            a.add(arr[i]);
        }  
        return false;     
    }
    
    public static void main(String[] args) {
        int []arr={0, -1, 2, -3, 1};
        int k=4;
        System.out.println(printpairs(arr, k));
    }
}
