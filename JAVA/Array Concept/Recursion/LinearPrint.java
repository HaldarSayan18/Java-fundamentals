// Problem statement - Print linearly from 1 to N using recursion
// Time complexity - O(n)  &&  Space Complexity - O(n)

public class LinearPrint{
    public void linear(int i, int n){
        // base condition
        if(i > n){
            return;
        }
        System.out.println(i);
        //recursion
        linear(i+1, n);
    }

    // print from opposite side
    public void oppositeNum(int j, int m){
        if(j < 1){
            return;
        }
        System.out.println(j);
        oppositeNum(j-1, m);
        // System.out.println(j);
    }
}