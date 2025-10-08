// Fibonacci series using recursion
// Multiple recursion concept
/*
 * normal method
 * f[0] = 0; f[1]=1;
 * for(i=2:n){
 *      f[i]=f[i-1]+f[i-2]
 * }
 */

public class Fibonacci_recursion {
    public int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int last = fibonacci(n-1);
        int secLast = fibonacci(n-2);
        // System.out.println(last+secLast);
        return (last + secLast);
    }
    public static void main(String[] args) {
        Fibonacci_recursion fr = new Fibonacci_recursion();
        System.out.println(fr.fibonacci(7));
    }
}
