package CodeWars;

public class StringEndsWith {

    public static void main(String[] args) {
        System.out.println(solution("ails", "fails"));
    }

    public static boolean solution(String str, String ending) {
        if(ending.length()>str.length()){
            return false;
        }

        int i = ending.length()-1;
        int j = str.length()-1;

        while( i > -1 && j > -1){
            if(str.charAt(j) != ending.charAt(i)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}