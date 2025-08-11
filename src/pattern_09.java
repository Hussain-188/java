public class pattern_9 {
    public static void main(String args[]){
        char start='a';
        int n=4;
        for(int i=0;i<n;i++){
            for(char ch=start;ch<=start+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
