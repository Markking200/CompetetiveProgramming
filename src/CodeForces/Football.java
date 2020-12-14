package CodeForces;


import java.util.Scanner;

public class Football {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        boolean dangerous=false;
        int count;

        for(int i=0;i<input.length();i++){
            count=0;
            if(input.charAt(i)=='0'){
                 for(int j=i;j<i+7;j++){
                     if(i+7<=input.length()){
                     if(input.charAt(j)=='0'){
                         count++;
                         if(count==7){
                        dangerous=true;
                        break;
                        }
                     }
                    }
                 }         
            }
        }
        
        for(int i=0;i<input.length();i++){
            count=0;
            if(input.charAt(i)=='1'){
                 for(int j=i;j<i+7;j++){
                    if(i+7<=input.length()){
                     if(input.charAt(j)=='1'){
                         count++;
                         if(count==7){
                        dangerous=true;
                        break;
                         }
                     }
                 }  
                }       
            }
        }

        if(dangerous==false){
        System.out.println("NO");
        }else if(dangerous==true){
            System.out.println("YES");  
        }
    }

}