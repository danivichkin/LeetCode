public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = new String[]{"flower", "flow", "flight"};
        String[] words1 = new String[]{"a", "a", "b"};

        System.out.println("Words = " + getLongestPrefix(words));
        System.out.println("Words1 = " + getLongestPrefix(words1));
    }

    public static String getLongestPrefix(String[] strs) {

        if (strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

}