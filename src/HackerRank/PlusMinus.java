package HackerRank;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrgr= sc.nextInt();
        int [] arr= new int[arrgr];
        double negativ=0;
        double positv=0;
        double zero=0;

        for (int i = 0; i < arrgr; i++) {
            arr[i]= sc.nextInt();
            if(arr[i]>0){
                positv++;
            }else if(arr[i]<0){
                negativ++;
            }else if(arr[i]==0){
                zero++;
            }
        }
        positv=positv/arrgr;
        negativ=negativ/arrgr;
        zero=zero/arrgr;

        Double.toString(positv);
        String positiv=String.format("%.6f",positv);

        System.out.println(positiv);
        System.out.println(Math.round(negativ*1000000d)/1000000d);
        System.out.println(Math.round(zero*1000000d)/1000000d);
    }
}
