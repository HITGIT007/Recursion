public class Solution10 {
    public static boolean isStringPalindrome(String input) {

        if(input == null){
            return false;
        }

        if(input.length() <= 1){
            return true;
        }

        String first = input.substring(0,1);
        String last = input.substring(input.length()-1,input.length());

        if(!first.equals(last)){
            return false;
        }else{
            return isStringPalindrome(input.substring(1,input.length()-1));
        }

    }
}
