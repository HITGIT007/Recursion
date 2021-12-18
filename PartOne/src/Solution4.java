public class Solution4 {
    public static boolean checkNumber(int input[], int x) {

        int n = input.length;
        if (n == 0) {
            return false;
        }


        if (input[0] == x) {
            return true;
        } else {
            int smallInput[] = new int[input.length - 1];
            for (int j = 1; j < input.length; j++) {
                smallInput[j - 1] = input[j];//Create new array
            }
            return checkNumber(smallInput, x);

        }
    }
}
