import java.util.*;
public class count_odd_nums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==1) count++;
        }
        System.out.println(count);
    }
}
