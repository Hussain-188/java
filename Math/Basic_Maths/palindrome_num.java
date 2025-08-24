public class palindrome_num {
    public static void main(String args[]){
        int num = 12121;
        int rev = 0;
        int copy = num;
        while(num>0){
            int rem = num%10;
            rev = (rev*10)+rem;
            num=num/10;
        }
        if(rev==copy){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
