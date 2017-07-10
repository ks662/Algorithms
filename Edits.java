/*
 * Types of edits: insert, delete, replace
 * Given 2 strings, check if they're one(or zero edits away)
 */
package strings;

/**
 *
 * @author Kalyani Shirwalkar
 */
import java.util.Scanner;

public class Edits {

    public static void main(String args[]) {
        String first, second;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        first = sc.next();
        System.out.print("Enter the second string: ");
        second = sc.next();
        if(first.equals(second)){
            System.out.println("They are zero edits away");
        }
        else if (first.length() == second.length()) {
            System.out.println(oneEditReplace(first, second));
        }
        else if (first.length() + 1 == second.length()) {
            System.out.println(oneEditInsert(first, second));
        } else if (first.length() - 1 == second.length()) {
            System.out.println(oneEditInsert(second, first));
        }
    }

    public static boolean oneEditInsert(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) != b.charAt(j)) {
                if (i != j) {
                    return false;
                }
                j++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }

    public static boolean oneEditReplace(String a, String b) {
        int i;
        boolean flag = false;
        for (i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (flag) {
                    return false;
                }
                flag = true;
            }
        }
        return true;
    }
}
