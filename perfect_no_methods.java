//a perfect no is a no in which the sum of digits is th no itself
import java.util.*;
class perfect_no_methods{
    public static boolean perfect(int k){
        int i,s=0;
        for(i=1;i<k;i++){
            if(k%i==0){
                s+=i;
            }
        }if(s==k)
        return true;
        else
        return false;
    }
    public static void main(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();
        boolean b=perfect(n);
        if(b){
            System.out.println("perfect no");
        }else{
            System.out.println("not a prfect no");
        }
    }
}