// Solution to CodeAbbey Problem 8 -  Arithmetic Progression in Java
// By Karel Vanhelden
import java.util.*;

class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    int a[] = new int[n];
    int b[] = new int[n];
    int c[] = new int[n];
    int sum[] = new int[n];

    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
        c[i] = sc.nextInt();
    }


     for(int i=0;i<n;i++){
       int ar = a[i] + (c[i] - 1) * b[i];
       sum[i] = c[i] * (a[i] + ar) / 2;
       System.out.print(sum[i] + " ");
    }

    sc.close();
  }
}
