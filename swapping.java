public class swapping {
    // public static void main(String  Args[]){

    //     int a = 10;
    //     int b = 15;

    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.print("a ="+ a);
    //     System.out.print("b ="+ b);

    // }


    // public static int swap(int a,int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.print("a =" + a);
    //     System.out.print("b =" + b);
    //     return b;
    // }

    // public static void main (String Args[]){
    //     int a = 10;
    //     int b = 15;
    //     swap(a , b);
    // }

    // public static int multiplication(int a , int b){
    //     int prod = a * b;
       
    //     return prod;
    // }

    // public static void main (String Args[]){
    //     int a = 10;
    //     int b = 10;
    //     int prod = multiplication(a , b);
    //     System.out.println("prod "+ prod);
    //     prod =  multiplication(12 , 12);
    //     System.out.println("prod "+ prod);
 
    // }


    //factorization;

    public static int factorial(int n ){
        int f = 1;

        for(int i=1 ; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n , int r){
        int fact_n =  factorial(n);
        int fact_r =  factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);

        return binCoeff ;

    }

    public static void main (String Args[]){
        System.out.print(binCoeff(5,2));
    }

    




}
