import java.util.Scanner;

public class factorial
{
    public static void main(String a[]){
        Scanner on = new Scanner (System.in);
        int n= on.nextInt();
        
        factorial ob=new factorial();
        ob.fac(n);
    }
    void fac(int n){
        int fact=1;
        for (int i =1;i<=n;i++){
            fact =fact*i;
        }
        System.out.println("FActorial = "+ fact);
    }
}