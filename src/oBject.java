public class oBject{

    public static void main(String[] args) {
        int x =45;
        int y = 67;
//        System.out.println(swap(a,b));
        swap2(x, y);

        System.out.println("value of x:"+x +" value of y: "+ y);
    }
    static void swap2(int a, int b){
         a = a^b;
         b = a^b;
         a = a^b;

    }
    static void swap(int a, int b){
        int temp;
        temp = a;
         a=b;
         b=temp;
    }
}

//
//import java.util.*;
//class oBject {
//    public static void main(String[] args) {
//        int x, y, t;// x and y are to swap
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of X and Y");
//        x = sc.nextInt();
//        y = sc.nextInt();
//        System.out.println("before swapping numbers: "+x +"  "+ y);
//        /*swapping */
//        t = x;
//        x = y;
//        y = t;
//        System.out.println("After swapping: "+x +"   " + y);
//        System.out.println( );
//    }
//}