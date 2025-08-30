public class prime_num {
    public static void main(String args[]){
        int num = 4;
        boolean prime = true;
        if(num==1) System.out.println(false);
        for(int i =2;i<num;i++){
            if(num%i==0) prime=false;
        }
        System.out.println(prime);
    }
}
