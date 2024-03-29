import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr= {75, 34, 65, 76, 3, 55};
        qsort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);

    }
    static void qsort(int[] nums, int low, int high){

        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while(s <= e) {

            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;

            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        qsort(nums, low, e);
        qsort(nums, s, high);

    }
}
