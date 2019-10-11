import javax.print.DocFlavor;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanToInteger {
    public static void main(String[] args) {

//        System.out.println(romanToInt(" ")); //Error
//        System.out.println(romanToInt("MMMMMMM"));  //Error
        System.out.println(romanToInt("I") + " = 1" );
        System.out.println(romanToInt("III") + " = 3");
        System.out.println(romanToInt("VI = 6") + " = 6");
        System.out.println(romanToInt("LVIII") + " = 58");
        System.out.println(romanToInt("MCMXCIV") + " = 1994");

    }

    public static int romanToInt(String s) {
        int counter = 0; int ans = 0;

        if (s.trim().isEmpty()){
            throw new IllegalArgumentException("Incorrect value"); }

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                counter++;
            if (counter > 4){
                throw new IllegalArgumentException("Incorrect value"); }
            }
        }

        int nums[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]){
                ans -= nums[i+1];
            } else {
                ans += nums[i];
            }
        }

        return ans + nums[nums.length-1];
    }
}
