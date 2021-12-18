public class Solution9 {
    public static double findGeometricSum(int k){
        if(k == 0){
            return 1;
        }
        double l = 1/Math.pow(2,k) + findGeometricSum(k-1);
        return l;

    }
}
