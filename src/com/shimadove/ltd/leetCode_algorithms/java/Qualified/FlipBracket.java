package com.shimadove.ltd.leetCode_algorithms.java.Qualified;


public class FlipBracket {

    public static void main(String[] args) {
        String word1 = "{[()]}";
        String word2 = "{[(])}";
       System.out.println(getValue(word1));
       System.out.println(getValue(word2));


    }


    private static String getValue(String strWord){
        String value = null;
        int count = 0;
        for(int i =0 ; i < strWord.length() && i < strWord.length()/2; i++){
            Character bb = null;
            Character name =  strWord.charAt(i);
            Character mirroCharacter = mirrorValue(name);
            if (count == 0){
                 bb =  strWord.charAt(strWord.length() -1);
                count = strWord.length() - 1;
            }else {
                count = count -1;
                bb =  strWord.charAt(count);
            }
            if (mirroCharacter == bb){
                value = "YES";
            }else {
                value = "NO";
                break;
            }
        }
        return value;
    }

    private static Character mirrorValue(Character value){
        Character returnValue = null;
        switch (value){
            case '{':
                returnValue = '}';
                break;
            case '(':
                returnValue = ')';
                break;
            case '[':
                returnValue =  ']';
                break;
        }

        return returnValue;
    }
}
