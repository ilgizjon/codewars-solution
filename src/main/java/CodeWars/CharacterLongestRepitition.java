package CodeWars;

import javax.xml.stream.events.Characters;

public class CharacterLongestRepitition {

    public static Object[] longestRepetition(String s) {
        if(s.isEmpty())return new Object[]{"", 0};

        Object[]res = new Object[2];
        int maxLen = 0;
        int curLen = 1;
        String result = "";

        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                curLen++;
                if(curLen>maxLen){
                    result = Character.toString(s.charAt(i));
                    maxLen = curLen;
                }
            }
            else{
                curLen = 1;
            }
        }
        return new Object[]{result, maxLen};
    }

    public static Object[] longestRepetition1(String s){

        return new Object[]{};
    }
}