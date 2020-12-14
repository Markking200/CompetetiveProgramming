package CodeForces;

import java.util.Scanner;

public class StringsTask{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        input=input.toLowerCase();
        input=input.replaceAll("a", "");
        input=input.replaceAll("e", "");
        input=input.replaceAll("i", "");
        input=input.replaceAll("o", "");
        input=input.replaceAll("u", "");
        input=input.replaceAll("y", "");

        String output="";
        char dot='.';
        for(int i=0;i<input.length();i++){
            output=output + dot +input.charAt(i);
        }
        sc.close();
        System.out.println(output);
        
    }

}