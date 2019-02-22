// Solution to CodeAbbey Problem 5 - Minimum of Three in Java
// By Karel Vanhelden
import java.util.*;

class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    int a[] = new int[n];
    int b[] = new int[n];
    int c[] = new int[n];
    int out[] = new int[n];

    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }

    for(int i=0;i<n;i++){
        if (a[i] < b[i] && a[i] < c[i]){
				out[i] = a[i];
		} else if(b[i] < a[i] && b[i] < c[i])
        {
            out[i] = b[i];
        }	else {
				out[i] = c[i];
		}

        System.out.println(out[i] + " ");
    }

    sc.close();
  }
}
