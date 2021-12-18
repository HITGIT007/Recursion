public class Solution6 {
    private static int lastIndex(int input[], int x, int m) {

        int n = input.length;
        if(n==0 ) {
            return -1;
        }



        if(input[0] == x) {
            return m - (m-n+1);
        }
        else {

            int smallInput[] = new int[input.length - 1];
            for(int j = 1; j <input.length; j++) {
                smallInput[j-1] = input[j];//Create new array

            }
            return lastIndex(smallInput, x, m);

        }

    }

    public static int lastIndex(int input[], int x) {

        int revInput[] = new int[input.length];
        int j = input.length-1;
        for(int i=0 ; i<input.length; i++){
            revInput[i] = input[j];
            j--;
        }
        return lastIndex(revInput, x, input.length);
    }
}
