public class count_oddNums {
    public static void main(String args[]){
        int num = 12345;
        int count = 0;
        while(num>0){
            int rem = num%10;
            if(rem%2!=0){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
