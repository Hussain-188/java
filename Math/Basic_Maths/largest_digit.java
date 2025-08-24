public class largest_digit {
    public static void main(String args[]){
        int largest = 0;
        int num = 132521;
        while(num>0){
            int rem=num%10;
            if(rem>largest){
                largest=rem;
            }
            num=num/10;
        }
        System.out.println(largest);
    }
}
