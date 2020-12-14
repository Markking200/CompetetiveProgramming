package CodeForces;

import java.util.Scanner;

class Bit{

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            String variable=sc.next();
            switch(variable){
                case "++X":
                x++;
                break;
                case "--X":
                x--;
                break;
                case "X++":
                x++;
                break;
                case "X--":
                x--;
                break;
            }
        }
        sc.close();
        System.out.println(x);
        
    }

}
