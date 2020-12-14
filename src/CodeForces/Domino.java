package CodeForces;

import java.util.Scanner;

public class Domino {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M= sc.nextInt();
        int field = M*N;
        int ouput=0;
        if(field%2==0){
            ouput=field/2;

        }else{
            ouput=field/2;
            Math.round(ouput);
        }
        System.out.println(ouput);
    }

}