/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmerogdatastrukturer;

/**
 *
 * @author Jonas
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Sum(6));
        System.out.println(evenSquares(4));
        System.out.println(fib(10));
        System.out.println(linear("string", 's', 5));
    }

    public static int Sum(int value) {

        if (value == 0) {
            return value;
        } else {
            return Sum(value - 1) + value;
        }
    }

    public static int evenSquares(int value) {
        if (value == 0) {
            return value;
        } else if (value % 2 == 0) {
            return evenSquares(value - 1) + value * value;
        } else {
            return evenSquares(value - 1);
        }
//    return evenSquares(value-1); dette er også en mulighed
    }

    public static long fib(long index) {
        if (index == 0 || index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }

    public static boolean linear(String s, char c, int len) {
        if (c == s.charAt(len-1)) {
            return true;
        } else if (len == 0) {
            return false;
        } else {
            return linear(s, c, len - 1);
        }
    }

}
