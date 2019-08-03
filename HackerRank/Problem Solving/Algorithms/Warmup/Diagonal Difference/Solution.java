 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = Integer.parseInt(sc.nextLine());
        int diagonalOne=0, diagonalTwo =0;
        for(int i=0;i<length;i++){
            String[]line = sc.nextLine().split(" ");
            diagonalOne +=Integer.parseInt(line[i]);
            diagonalTwo+=Integer.parseInt(line[line.length-1-i]);
        }
System.out.println(Math.abs(diagonalOne-diagonalTwo));
    }
}
