/*
            *       *
            **      **
            ***     ***
            ****    ****
            ****    ****
            ***     ***
            **      **
            *       *
  */

  package Patterns;
  import java.util.Scanner;
  
  public class ArrowPattern {
      public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.print("Enter number of rows= ");
          int row = sc.nextInt();
          int spaces = (2 * row) - 1;
          //upper half
          for (int i = 1; i <= row; i++) {
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              //spaces
              for (int j = 1; j <= spaces; j++) {
                  System.out.print(" ");
              }
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println();
          }
          //reverse order for lower half
          for (int i = row; i >= 1; i--) {
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              for (int j = 1; j <= spaces; j++) {
                  System.out.print(" ");
              }
              for (int j = 1; j <= i; j++) {
                  System.out.print("*");
              }
              System.out.println();
          }
          sc.close();
      }
  }
  