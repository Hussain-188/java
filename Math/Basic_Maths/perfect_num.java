public class perfect_num {
    public static void main(String args[]){
        int num = 6;
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0) sum+=i;
        }
        if(sum==num) System.out.println(true);
        else System.out.println(false);
    }
}
