public class LCM {
    public static void main(String args[]){
        int n1 = 4;
        int n2 = 12;
        int n1_copy = n1;
        int n2_copy = n2;
        int gcd  =1;
        while(n1!=0 && n2!=0){
            if(n1>n2) n1=n1%n2;
            else n2=n2%n1;
        }
        if(n1==0) gcd = n2;
        else gcd = n1;
        int lcm = (n1_copy*n2_copy)/gcd;
        System.out.println(lcm);
    }
}
