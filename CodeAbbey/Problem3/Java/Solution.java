// Solution to CodeAbbey Problem 3 - Sums of Loops in Java 
// By Karel Vanhelden 13/01/2018
import java.util.*;

class Solution {

  public static void main(String[] args) {
    int i, n;

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int a[] = new int [n];
    int b[] = new int [n];

    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int sum = 0;
    for (i = 0; i < n; i++) {
      sum = a[i] + b[i];
      System.out.println(sum + " ");
    }
    
  }
}
