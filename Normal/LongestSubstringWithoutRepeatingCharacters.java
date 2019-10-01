package Normal;


public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbb"));

    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int max = 0; //Больше 2х в ряд не прочитает, но что делать если там повтор строки?
        char[] strToArray = s.toCharArray();
        String[] str = new String[10];
        for (int i = 0; i < s.length(); i++) {
            if (strToArray[i] == strToArray[i+1]) {
                max =  count;
                count = 1; //2+ in a row
            }
            else{
                count++;
            }
        }
        return count;
    }
 }

