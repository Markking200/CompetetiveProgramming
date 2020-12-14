package CodeForces;

import java.util.Scanner;

public class ateam {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int view=0;
        int count=0;
        int output=0;
        for (int i = 0; i < n; i++) {
            count=0;
            for(int j=0;j<3;j++){
                view=sc.nextInt();
                if(view==1){
                    count++;
                }
            }  
            if(count>=2){
                output++;
            } 
        }
        sc.close();
       System.out.print(output);
    }

}
