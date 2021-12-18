public class Solution5 {
    private static int firstIndex(int input[], int x, int m) {

        int n = input.length;
        if(n==0 ) {
            return -1;
        }



        if(input[0] == x) {
            return m - n;
        }
        else {

            int smallInput[] = new int[input.length - 1];
            for(int j = 1; j <input.length; j++) {
                smallInput[j-1] = input[j];//Create new array

            }
            return firstIndex(smallInput, x, m);

        }

    }

    public static int firstIndex(int input[], int x) {

        return firstIndex(input, x, input.length);




    }
}
