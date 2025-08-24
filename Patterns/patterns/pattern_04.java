package patterns;

import java.util.Scanner;

class pattern_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=(n-i)*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
