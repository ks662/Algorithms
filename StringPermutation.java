import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kalyani Shirwalkar
 */
public class StringPermutation {
    public static void main(String args[]){
        String one, two;                                                //Two input strings to be checked
        boolean flag;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        one = sc.next();
        System.out.print("Enter the second string: ");
        two = sc.next();
        flag = isPerm(one, two);                                        
        
        if(flag){
            System.out.println("Strings are permutation of each other");
        } else{
            System.out.println("Strings are not permutation of each other");
        }
    }
    
    public static boolean isPerm(String x, String y){                       //Checks if strings are permutation of each other
        if(x.length() != y.length())
            return false;
        char ch;
        int i;
        Map<Character, Integer> x_char_count = new HashMap<>(); 
        Map<Character, Integer> y_char_count = new HashMap<>();
        for(i = 0;  i < x.length(); i++){
            ch = x.charAt(i);
            if(x_char_count.containsKey(ch)){
                x_char_count.put(ch, x_char_count.get(ch) + 1);
            } else{
                x_char_count.put(ch, 1);
            }
            ch = y.charAt(i);
            if(y_char_count.containsKey(ch)){
                y_char_count.put(ch, y_char_count.get(ch) + 1);
            } else{
                y_char_count.put(ch, 1);
            }
        }
        if(x_char_count.equals(y_char_count))
            return true;
        return false;
    }
}
