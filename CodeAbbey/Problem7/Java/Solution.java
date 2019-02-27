// Solution to CodeAbbey Problem 7 - Fahrenheit to Celsius in Java
// By Karel Vanhelden
import java.util.*;

class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=0;i<n;i++){
        System.out.print(Math.round((sc.nextDouble() - 32) * 5 / 9) + " ");
    }

    sc.close();
  }
}
