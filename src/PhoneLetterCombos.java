import java.util.ArrayList;
import java.util.List;


public class PhoneLetterCombos {

    List<String> ourList = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        String[] letterArr = new String[]{null, null, "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String[] tempArr = new String[digits.length()];

        //0 and 1 length cases.
        if(digits.length() == 0) { return ourList; }
        if(digits.length() == 1) {
            tempArr[0] = letterArr[Integer.valueOf(String.valueOf(digits.charAt(0)))];
            helper(tempArr);
            return ourList;
        }

        //Add all of our corresponding letter combinations to our array for each number.
        for(int i = 0; i < digits.length(); i++){
            tempArr[i] = letterArr[Integer.valueOf(String.valueOf(digits.charAt(i)))];
        }

        //Use helper to add all combos to our list and then return our list.
        helper(tempArr);
        for(String s: ourList){
            System.out.println(s);
        }
        return ourList;
    }

    public void helper(String[] s1){

        if(s1.length == 1){
            char[] ch = s1[0].toCharArray();
            for(char c : ch){
                ourList.add(String.valueOf(c));
            }
        }
        else if(s1.length == 2){

            int index = 0;
            char[] ch1 = s1[index].toCharArray();
            char[] ch2 = s1[index + 1].toCharArray();

            for(char c: ch1){
                for(char d: ch2){
                    ourList.add(String.valueOf(c) + String.valueOf(d));
                }
            }
        }

        else if(s1.length == 3){

            int index = 0;
            char[] ch1 = s1[index].toCharArray();
            char[] ch2 = s1[index + 1].toCharArray();
            char[] ch3 = s1[index + 2].toCharArray();

            for(char c: ch1){
                for(char d: ch2){
                    for(char e: ch3){
                        ourList.add(String.valueOf(c) + String.valueOf(d) + String.valueOf(e));
                    }
                }
            }
        }
        else if(s1.length == 4){

            int index = 0;
            char[] ch1 = s1[index].toCharArray();
            char[] ch2 = s1[index + 1].toCharArray();
            char[] ch3 = s1[index + 2].toCharArray();
            char[] ch4 = s1[index + 3].toCharArray();

            for(char c: ch1){
                for(char d: ch2){
                    for(char e: ch3){
                        for(char f: ch4){
                            ourList.add(String.valueOf(c) + String.valueOf(d) + String.valueOf(e) + String.valueOf(f));
                        }
                    }
                }
            }
        }
    }
}

/**
    public List<String> letterCombinations(String digits) {

        String[] letterArr = new String[]{null, null, "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String[] tempArr = new String[digits.length()];

        //0 and 1 length cases.
        if(digits.length() == 0) { return ourList; }
        if(digits.length() == 1) {
            char[] ch;
            int index = Integer.valueOf(String.valueOf(digits.charAt(0)));
            ch = letterArr[index].toCharArray();
            //Iterate through our string and add each character to our list.
            for(char c : ch){
                ourList.add(String.valueOf(c));
            }
            return ourList;
        }

        //Use our helper method to add each combination to ourList.
        for(int i = 0; i < digits.length() - 1; i++){
            for(int j = 1; j < digits.length(); j++){
                helper(letterArr[Integer.valueOf(String.valueOf(digits.charAt(i)))], letterArr[Integer.valueOf(String.valueOf(digits.charAt(j)))]);
            }
        }
        return ourList;
    }

    public void helper(String s1, String s2){

        char[] ch1;
        char[] ch2;
        ch1 =  s1.toCharArray();
        ch2 = s2.toCharArray();

        for(char c : ch1) {
            for(char d : ch2){
                ourList.add(String.valueOf(c) + String.valueOf(d));
            }
        }
    }
**/