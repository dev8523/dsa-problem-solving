package com.debasish.practise.dsa.topicwise.recursion;

/**
 * @author debasishsahoo
 * <p>
 * Problem Description
 * <p>
 * Write a program to find the factorial of the given number A.
 * <p>
 * Explanation 1:
 * <p>
 * Factorial of 4 = 4 * 3 * 2 * 1 = 24
 * Explanation 2:
 * <p>
 * Factorial of 1 = 1
 */
public class FindFactorial {
    public int solve(int A) {
        if (A == 0 || A == 1) return 1;
        return A * solve(A - 1);
    }
}
