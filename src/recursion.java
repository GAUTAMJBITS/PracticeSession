import java.util.ArrayList;

public class recursion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 9, 10, 10, 10};
        ArrayList<Integer> ans = findAllIndex2(arr, 10, 1 );

        System.out.println(ans);

    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(index == target){
            list.add(index);

        }
        return findAllIndex(arr, target, index + 1, list);
    }



}
