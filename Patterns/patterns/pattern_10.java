package patterns;

public class pattern_10 {
    public static void main(String args[]){
        int n=5;
        char start='A';
        for(int i=1;i<=n;i++){
            for(char ch=start;ch<=start+(n-i);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
