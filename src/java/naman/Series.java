package java.naman;
/*   Created By: IntelliJ Idea
 *    Author: Naman Agarwal (naman2807)
 *    Date: 11-08-2020
 *    Time: 01:37 PM
 *    Package: PACKAGE_NAME
 */


public class Series {
    public static long nSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 0; i < n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for (int i = 0; i < n; i++) {
            fib = nMinus1 + nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
