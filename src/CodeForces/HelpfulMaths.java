package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine().replace("+", "");
        char[] output = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            output[i] = input.charAt(i);
        }
        Arrays.sort(output);

        String soutput=String.valueOf(output);   
        sc.close();  
        String toReplace = soutput.replaceAll("", "+");
        String Ouput = toReplace.substring(1, toReplace.length()-1);      
        System.out.println(Ouput);
        
    }

}