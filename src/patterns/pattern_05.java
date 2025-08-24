package patterns;

import java.util.Scanner;

class pattern_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
