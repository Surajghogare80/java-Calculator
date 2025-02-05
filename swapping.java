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


    public static int swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.print("a =" + a);
        System.out.print("b =" + b);
        return b;
    }

    public static void main (String Args[]){
        int a = 10;
        int b = 15;
        swap(a , b);
    }

}
