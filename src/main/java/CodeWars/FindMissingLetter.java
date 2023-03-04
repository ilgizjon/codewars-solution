package CodeWars;

public class FindMissingLetter {

    public static void main(String[] args) {
        System.out.println(FindMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
    }

    public static char findMissingLetter(char[] array) {
        char start = array[0];
        for (char c: array) {
            if (start != c) return start;
            start++;
        }
        return ' ';
    }
}