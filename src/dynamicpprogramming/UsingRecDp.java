package dynamicpprogramming;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsingRecDp {

//    public static int fibo(int n){
//        return fibo(n,new HashMap<>());
//    }
//    public static int fibo(int n, HashMap<Integer, Integer> memo){
//        if (n == 0||n == 1){
//            return n;
//        }
//        if (memo.containsKey(n)){
//            return memo.get(n);
//        }
//
//        int result =  fibo(n-1, memo)+fibo(n-2, memo);
//        memo.put(n, result);
//        return result;
//    }

//    public static int trib(int n){
//        return trib(n,new HashMap<>());
//    }
//    public static int trib(int n, HashMap<Integer, Integer> memo){
//        if (n==0||n==1){
//            return n;
//        }
//        if (n==2){
//            return 1;
//        }
//        if (memo.containsKey(n)){
//            return memo.get(n);
//        }
//        int result = trib(n -1,memo)+trib(n-2,memo)+trib(n-3,memo);
//        memo.put(n,result);
//        return result;
//    }
    public static boolean sumPossible(int target, List<Integer> nums){
        return sumPossible(target,nums,new HashMap<>());
    }
    public static boolean sumPossible(int target,List<Integer> nums,HashMap<Integer, Boolean> memo){
        if (target==0){
            return true;
        }
        if (target <0){
            return false;
        }
        if (memo.containsKey(target)){
            return memo.get(target);
        }
        for (int n:nums){
            int subAmount = target - n;
            if (sumPossible(subAmount,nums,memo)){
                memo.put(target,true);
                return true;
            }
        }
        memo.put(target,false);
        return false;
    }



    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(4);
        nums.add(3);
        nums.toString();


        System.out.println(sumPossible(15, nums));

        //  System.out.println(trib(2));


    }

}
