import java.util.Arrays;

public class bubbleRecursion {
    public static void main(String[] args) {
        int[] arr = {41, 5, 8, 4, 9};
//        bubbleRe(arr, arr.length - 1,0);
        selectionSot(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSot(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionSot(arr, r, c+1, c);
            }else{
                selectionSot(arr, r, c+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSot(arr, r-1, 0, 0);
        }
    }




    //Bubble Sort using Recursion
    static void bubbleRe(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleRe(arr, r, c+1);
        }else{
            bubbleRe(arr, r-1, 0);
        }
    }
}
