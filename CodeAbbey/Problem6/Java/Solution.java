// Solution to CodeAbbey Problem 6 - Rounding in Java
// By Karel Vanhelden
import java.util.*;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    int a[] = new int[n];

    for(int i=0;i<n;i++){
      a[i] = (int) Math.round(((double) sc.nextInt()) / ((double) sc.nextInt()));
    }


    for(int i=0;i<n;i++){
        System.out.print(a[i] + " ");
    }
    sc.close();
    // System.out.println(a[n - 1]);
  }
}
