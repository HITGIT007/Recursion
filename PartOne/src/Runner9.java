//Geometric Sum
//        Send Feedback
//        Given k, find the geometric sum i.e.
//        1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
//        using recursion.
//        Input format :
//        Integer k
//        Output format :
//        Geometric sum (upto 5 decimal places)
//        Constraints :
//        0 <= k <= 1000
//        Sample Input 1 :
//        3
//        Sample Output 1 :
//        1.87500
//        Sample Input 2 :
//        4
//        Sample Output 2 :
//        1.93750
import java.text.DecimalFormat;
import java.util.Scanner;
public class Runner9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        double ans = Solution9.findGeometricSum(k);
        DecimalFormat dec = new DecimalFormat("#0.00000");
        System.out.println(dec.format(ans));
    }
}
