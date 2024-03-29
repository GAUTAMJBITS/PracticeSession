package BinaryTree;

public class rec {
//
    public static int fiboNa(int n){
        if(n <= 1){
            return n;
        }

        return fiboNa(n - 1) + fiboNa( n- 2);
    }
    static int facTorial(int n){
        if(n == 0){
            return 1;
        }
        return n * facTorial(n-1);
    }
    public static void main(String[] args) {
        int n =5;
        int ans = facTorial(n);
//        int anss = fiboNa(n);
        System.out.println(" factorial of 10 is: "+ans);
//        System.out.println("fibo :" +anss);
        for(int i =0; i < n; i++){
            System.out.println(fiboNa(i));
        }
    }
}
