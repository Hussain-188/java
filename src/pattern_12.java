public class pattern_12 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char el='A';
            for(int j=1;j<=2*i-1;j++){
                System.out.print(el);
                if(j<i) el++;
                else el--;
            }
            System.out.println();
        }
    }
}
