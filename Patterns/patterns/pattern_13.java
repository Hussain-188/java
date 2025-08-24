package patterns;

public class pattern_13 {
    public static void main(String args[]){
        int n=5;
        char el=(char)('A'+n-1);
        for(int i=1;i<=n;i++){
            for(char ch=(char)(el-i+1);ch<=el;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
