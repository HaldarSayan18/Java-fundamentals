
import java.util.Scanner;

public class PrintName_num {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times you want to print \t");
        int n = sc.nextInt();
        PrintName obj = new PrintName();
        obj.name(1, n);
        LinearPrint lp = new LinearPrint();
        lp.linear(1, 10);
        lp.oppositeNum(10, 1);
        sc.close();
    }
}