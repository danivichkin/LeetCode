import java.util.LinkedList;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(18481));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1111111111));
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int x){
        //Мне стыдно за решение, я не прогал пол года
        LinkedList<Character> linkedList = new LinkedList<Character>();

        for (int i = 0; i < String.valueOf(x).length(); i++) {
            linkedList.add(String.valueOf(x).charAt(i));
        }

        while (linkedList.size() != 1 && !linkedList.isEmpty()) {
            System.out.println(linkedList.toString());
            if (linkedList.getFirst() == linkedList.peekLast()){
                linkedList.removeFirst();
                linkedList.removeLast();
            } else return false;
        }
        return true;
    }

}