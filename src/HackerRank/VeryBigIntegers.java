package HackerRank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class VeryBigIntegers {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int numbers=sc.nextInt();
        BigInteger [] sums= new BigInteger[numbers];
        
        for(int i=0;i<numbers;i++){
           sums[i]=sc.nextBigInteger(); 

        }

        BigInteger output = new BigInteger("0");

        for(int i=0;i<numbers;i++){
            output=output.add(sums[i]);
        }
        
        System.out.println(output);
    }
}