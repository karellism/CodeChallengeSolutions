// Solution to CodeAbbey Problem 9 - Triangles in Java
// By Karel Vanhelden
import java.util.*;

class Solution {

  public static int check(int a, int b, int c) {
      if ((a + b) < c || (a + c) < b || (b + c) < a)
          return 0;
      else return 1;
    }

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
      sum[i] = check(a[i], b[i], c[i]);
      System.out.print(sum[i] + " ");
		}

    sc.close();
  }
}
