import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("pkbbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbbbbb"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0; int j = 0; //counters

        HashMap <Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                j = Math.max(map.get(s.charAt(i)), j);
            }
            count = Math.max(count, i - j + 1);
            map.put(s.charAt(i), i+1);
        }
        return count;
    }
 }

