import java.util.*;
public class function {
    // public static int sum(int a, int b){
    //     int add =  a  +  b;
    //     return  add ;

    // }
    // public static void main(String Args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = sum(a,b);
    //     System.out.println("sum :" + sum) ;
    // }

    public static int factorial(int n ,int r){
        int f=1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
     }

     public static int binCoeff(int n ,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
     }

     public static void main (String Args[]){
        System.out.println(binCoeff(5,2));
     }

}
