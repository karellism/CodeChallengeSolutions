// Solution to CodeAbbey Problem 4 - Minimum of Two in Java
// By Karel Vanhelden
import java.util.*;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    int a[] = new int[n];
    int b[] = new int[n];
    int out[] = new int[n];

    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    for(int i=0;i<n;i++){
        if (a[i] < b[i]){
				out[i] = a[i];
		}	else {
				out[i] = b[i];
		}

        System.out.println(out[i] + " ");
    }

    sc.close();
  }
}
