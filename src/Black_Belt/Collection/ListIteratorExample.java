package Black_Belt.Collection;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
// Полиндром. слова, которые читаются одинаково со всех сторон
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(s);

        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch); // каждый чар сh из массива заносим в лист
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;

        while (iterator.hasNext() && iterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
