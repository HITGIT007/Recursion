import java.util.ArrayList;
public class Solution7 {
    private static int[] allIndexes(int input[], int x, int m, ArrayList<Integer> output) {

        int n = input.length;
        if(n==0 ) {
            int[] outputarr = new int[output.size()];
            int i = 0;
            for(int j: output){
                outputarr[i++] = j;
            }

            return outputarr;
        }



        if(input[0] == x) {
            int l = m - n;
            output.add(l);
            int smallInput[] = new int[input.length - 1];
            for(int j = 1; j <input.length; j++) {
                smallInput[j-1] = input[j];//Create new array

            }

            return allIndexes(smallInput, x, m, output);

        }
        else {

            int smallInput[] = new int[input.length - 1];
            for(int j = 1; j <input.length; j++) {
                smallInput[j-1] = input[j];//Create new array

            }

            return allIndexes(smallInput, x, m, output);

        }

    }
    public static int[] allIndexes(int input[], int x) {

        ArrayList <Integer> output = new ArrayList<Integer>();
        return allIndexes(input, x, input.length, output);
    }
}
