import java.util.*;
public class conditional {
    public static void main(String args[]){
     /*
         int age = 22;
        if(age>=18){
            System.out.println("Your r adult");
        }
        else{
            System.out.println("Your r not adult");
        }
      */

      /*
       Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();

      if(n%2==0){
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }
       */


    /*
    
    Scanner sc = new Scanner (System.in);
    int income = sc.nextInt();
    int Tax ;

          if (income < 500000){
        Tax = 0;
    }
    else if(income >500000 && income < 1000000){
        Tax =(int) (income * 0.2) ;
    }
    else{
        Tax =(int) (income * 0.3); 
    }

    System.out.println("Your tax is:" + Tax);
    */

    /*
     Scanner sc = new Scanner (System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    if (A>=B && A>=C){
        System.out.println("A is largest" + A);
    }
    else if(B>=C){
        System.out.println("B is largest" + B);
    }
    else{
        System.out.println("C is largest" + C);
    }
    */

     int a = 10;
     String type = ((a)==0) ? "yes" : "no";
     System.out.println(type);

    }
}
