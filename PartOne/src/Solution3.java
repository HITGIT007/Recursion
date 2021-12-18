public class Solution3 {
    public static int sum(int input[]) {

        int n = input.length;

        if (n <= 1) {
            return input[0];
        }


        int smallInput[] = new int[input.length - 1];
        for (int j = 1; j < input.length; j++) {
            smallInput[j - 1] = input[j];//Create new array
        }


        int f = smallInput[0] + sum(smallInput);

        return f;


    }
}