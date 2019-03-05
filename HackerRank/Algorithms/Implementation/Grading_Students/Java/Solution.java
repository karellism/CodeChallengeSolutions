// My solution in Java for Grading Studens problem at HackerRank found under Algorithms -> Implementation
// By Karel Vanhelden
import java.util.*;
 
public class Solution {
    private static int profGrade(int grade) {
        int multiply5 = grade / 5;
        int roundBy5 = (grade % 5 == 0) ? (multiply5 * 5) : ((multiply5 + 1) * 5);
        if(roundBy5 - grade < 3 && grade >= 38) {
            return roundBy5;
        }
        return grade;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < test; i++) {
            int grade = Integer.parseInt(sc.nextLine());
            int finalGrade = profGrade(grade);
            System.out.println(finalGrade);
        }
        sc.close();
    }
}
