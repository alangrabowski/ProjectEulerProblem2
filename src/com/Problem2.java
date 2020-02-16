package com;

public class Problem2 {
    public static int sumEvenFibonacciUpTo (int upTo){
        int fibo1=0, fibo2=1, fibo3=0, sum=0;
        while (fibo3<=upTo){
            if (fibo3%2==0){
                sum+=fibo3;
            }
            fibo3=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibo3;
        }
        return sum;
    } //this method returns sum of all even Fibonacci terms under or equal to given number

    public static void main(String[] args) {
        System.out.println(sumEvenFibonacciUpTo(4000000));
    }
}
