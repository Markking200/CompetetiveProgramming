package CodeForces;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i=3;
        int j=3;
        int row1=0;
        int column1=0;

        for(int i1=1;i1<=5;i1++){
            String s = sc.nextLine().replaceAll(" ", "");
            if(s.contains("1")){
                row1=i1;
                column1=s.indexOf("1")+1;
                break;
            }
        }
        sc.close();
        System.out.println(Math.abs(j-row1)+Math.abs(i-column1));
    }

}