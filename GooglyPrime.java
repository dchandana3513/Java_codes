import java.util.*;
class Googly_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=0,sum=0;
        while(num!=0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        if(is_prime(sum)){
            System.out.println("YES");
        }
        else{System.out.println("NO");}
    }
    public static boolean is_prime(int n){
        if (n<=1){return false;}
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
             
        }
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
