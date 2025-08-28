public class armstrong_num {
    public static void main(String args[]){
        int num = 153;
        int count = (int)(Math.log10(num)+1);
        int sum=0;
        int copy=num;
        while(num>0){
            int rem = num%10;
            sum=sum+(int)(Math.pow(rem,count));
            num=num/10;
        }
        if(copy==sum){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
