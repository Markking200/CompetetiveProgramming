package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongWOrds {

    public static void main(String[] args) throws Exception {
        ArrayList<String>wordlist=new ArrayList<>();
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
                if(word.length()>10){
                char firstLetter = word.charAt(0);
                char LastLetter = word.charAt(word.length()-1);
                int diggits = word.length()-2;
                String output=String.valueOf(firstLetter)+String.valueOf(diggits)+String.valueOf(LastLetter);
                wordlist.add(output);
            }else{
                wordlist.add(word);
            }
        }
        for(int i=0;i<wordlist.size();i++){
        System.out.println(wordlist.get(i));
        }
    }

}
