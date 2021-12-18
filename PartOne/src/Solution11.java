public class Solution11 {
    public static int sumOfDigits(int input){
        if(input < 10){
            if(input ==0){
                return 0;
            }else{
                return input;
            }
        }

        return  input%10 +  sumOfDigits(input/10);

    }
}
