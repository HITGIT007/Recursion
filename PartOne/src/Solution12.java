public class Solution12 {
    public static int multiplyTwoIntegers(int m, int n){
       if(n==0){
           return 0;
       }


       return m + multiplyTwoIntegers( m,n-1);

    }
}
