/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Kalyani Shirwalkar
 */

/*
* Given an input string, find if all the characters are unique
*/



import java.util.*;

public class UniqueChars {

    /**
     * @param args the command line arguments
     */
    
    public static char inp[];                                                   //Store input string as a char array
    public static char s_inp[];                                                 //Store the characters of input string in sorted manner
    
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        Scanner sc = new Scanner(System.in);
        String input;        
        
        System.out.print("Enter the string: ");
        input = sc.next();
        
        inp = input.toCharArray();
        
        s_inp = new char[inp.length];
        
        mergeSort(0, inp.length - 1);
        
        for(i = 0; i < s_inp.length - 1; i++){
            if(s_inp[i] == s_inp[i + 1]){
                System.out.println("The string doesn't have unique characters");
                System.exit(0);
            }
        }
        System.out.println("The string has all unique characters");
    }

    public static void mergeSort(int low, int high) {                           //MergeSort method
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void merge(int low, int mid, int high) {                      //Merge Sorts the characters of input string
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (inp[i] <= inp[j]) {
                s_inp[k] = inp[i];
                i++;
            } else {
                s_inp[k] = inp[j];
                j++;
            }
            k++;
        }
        while (j <= high) {
            s_inp[k] = inp[j];
            j++;
            k++;
        }
        while (i <= mid) {
            s_inp[k] = inp[i];
            i++;
            k++;
        }
        for (i = low; i < k; i++) {
            inp[i] = s_inp[i];
        }
    }
}
