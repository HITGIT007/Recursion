public class CheckSorted {
    public static boolean checkSorted(int input[]) {
        if(input.length<=1) {
            return true;
        }
        if(input[0] > input[1]) {//Check first two elements
            return true;
        }
        int smallInput[] = new int[input.length - 1];
        for(int i = 1; i <input.length; i++) {
            smallInput[i-1] = input[i];//Create new array
        }
        boolean smallAns = checkSorted(smallInput);
        return smallAns;

    }

    public static boolean checkSortedBetter(int input[], int startIndex) {//Better in terms of space
        //We don't have to create new array
        //We are just using sliding window technique here by increasing the start index by 1
        if(startIndex >= input.length - 1) {
            return true;
        }
        if(input[startIndex] > input[startIndex + 1]) {//Check first two elements
            return false;
        }
        boolean smallAns =  checkSortedBetter(input, startIndex + 1);
        return smallAns;
    }

    public static void main(String args[]) {
        //int input[] = {2,1,3,6,9};
        //System.out.println(checkSorted(input));
        //System.out.println(checkSorted(input1));
        int input1[] = {1,2,3};
        System.out.println(checkSortedBetter(input1,0));
    }
}
