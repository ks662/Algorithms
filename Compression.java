/*
 * Compress the string and return if smaller than original
 * eg: aabcccccaaa -> a2b1c5a3
 */
package strings;

/**
 *
 * @author Kalyani Shirwalkar
 */

import java.util.Scanner;

public class Compression {
    public static void main(String args[]){
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        input = sc.next();
        System.out.println(compression(input));
    }
    static String compression(String original){
        int count = 0, i;
        StringBuilder sb = new StringBuilder("");
        for(i = 0; i < original.length(); i++){
            count++;
            if(i + 1 >= original.length() || original.charAt(i) != original.charAt(i + 1)){
                sb.append(original.charAt(i));
                sb.append(count);
                count = 0;
            }
        }
        return sb.length() < original.length() ? sb.toString() : original;
    }
}
