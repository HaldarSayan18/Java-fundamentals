// Problem statement - Print your name for N times using recursion
// Time complexity - O(n) && Space complexity - O(n)

import java.util.Scanner;
public class PrintName {
    public void name(int i , int n){
        // base condition
        if( i > n){
            return;
        }
        System.out.println("Haldar");
        // same function call
        name(i+1, n);
        // if its only 'i' then it will go to infinite loop
    }
}