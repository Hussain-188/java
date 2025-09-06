import java.util.Scanner;

public class sum_of_arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}
